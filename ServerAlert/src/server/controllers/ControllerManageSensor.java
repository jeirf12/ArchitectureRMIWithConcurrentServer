package server.controllers;

import common.entities.IndicatorDTO;
import common.entities.NotifyDTO;
import common.infra.Console;
import common.interfaces.IControllerManageSensor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.access.IClientAccess;
import server.domain.ClientService;

/**
 *
 * @author fallen
 */
public class ControllerManageSensor extends UnicastRemoteObject implements IControllerManageSensor {
    private final ControllerManageNotify objManageNotify;
    private ClientService service;
    
    public ControllerManageSensor(ControllerManageNotify objManageNotify, IClientAccess service) throws RemoteException {
        super();
        this.objManageNotify = objManageNotify;
        this.service = new ClientService(service);
    }
    
    @Override
    public boolean registerIndicator(IndicatorDTO indicator) throws RemoteException {
        HashMap<String, Boolean> indicators = new HashMap<>();
        int counter = 0;
        Console.writeJumpLine("El indicador ha sido recibido", false);
        indicators.put("Cardiac Frequency,"+indicator.getCardiacFrequency(), Boolean.FALSE);
        indicators.put("Blood Pressure,Sistolic,"+indicator.getBloodPressure()[0], Boolean.FALSE);
        indicators.put("Blood Pressure,Diastolic,"+indicator.getBloodPressure()[1], Boolean.FALSE);
        indicators.put("Respiratory Frequency,"+indicator.getRespiratoryFrequency(), Boolean.FALSE);
        indicators.put("Temperature,"+indicator.getTemperature(), Boolean.FALSE);
        indicators.put("Oxigen Saturation,"+indicator.getOxigenSaturation(), Boolean.FALSE);
        if (indicator.getCardiacFrequency() < 60 || indicator.getCardiacFrequency() > 80) {
            indicators.replace("Cardiac Frequency,"+indicator.getCardiacFrequency(), Boolean.TRUE);
            counter++;
        }
        if (indicator.getBloodPressure()[0] < 110 || indicator.getBloodPressure()[0] > 140) {
            indicators.replace("Blood Pressure,Sistolic,"+indicator.getBloodPressure()[0], Boolean.TRUE);
            counter++;
        }
        if (indicator.getBloodPressure()[1] < 70 || indicator.getBloodPressure()[1] > 90) {
            indicators.replace("Blood Pressure,Diastolic,"+indicator.getBloodPressure()[1], Boolean.TRUE);
            counter++;
        }
        if (indicator.getRespiratoryFrequency() < 12 || indicator.getRespiratoryFrequency() > 20) {
            indicators.replace("Respiratory Frequency,"+indicator.getRespiratoryFrequency(), Boolean.TRUE);
            counter++;
        }
        if (indicator.getTemperature() < 36.2 || indicator.getTemperature() > 37.2) {
            indicators.replace("Temperature,"+indicator.getTemperature(), Boolean.TRUE);
            counter++;
        }
        if (indicator.getOxigenSaturation() < 95 || indicator.getOxigenSaturation() > 100) {
            indicators.replace("Oxigen Saturation,"+indicator.getOxigenSaturation(), Boolean.TRUE);
            counter++;
        }
        NotifyDTO objNotify = new NotifyDTO(indicator.getNumberRoomPatient(), indicators, counter);
        if (counter > 1)this.objManageNotify.notifyClient(objNotify);
        String response = this.verifiedBadRequest(indicator);
        if(!response.equals("")) this.sendMessageToLog(response);
        return true;
    }
    
    private String verifiedBadRequest(IndicatorDTO indicator){
        String requestMessage = "";
        LocalDate date = LocalDate.now();
        if (indicator.getCardiacFrequency() < 1) {
            requestMessage += date + " Cardiac Frequency request bad with value: " + indicator.getCardiacFrequency() + "\n";
        }
        if (indicator.getBloodPressure()[0] < 1) {
            requestMessage += date + " Blood Pressure - Sistolic request bad with value: " + indicator.getBloodPressure()[0] + "\n";
        }
        if (indicator.getBloodPressure()[1] < 1) {
            requestMessage += date + " Blood Pressure - Diastolic request bad with value: " + indicator.getBloodPressure()[1] + "\n";
        }
        if (indicator.getRespiratoryFrequency() < 1) {
            requestMessage += date + " Respiratory Frequency request bad with value: " + indicator.getRespiratoryFrequency() + "\n";
        }
        if (indicator.getTemperature() < 1) {
            requestMessage += date + " Temperature request bad with value: " + indicator.getTemperature() + "\n";
        }
        if (indicator.getOxigenSaturation() < 1) {
            requestMessage += date + " Oxigen Saturation request bad with value: " + indicator.getOxigenSaturation() + "\n";
        }
        return requestMessage;
    }
    
    private void sendMessageToLog(String message) {
        try {
            this.service.sendMessageLog(message);
        } catch (Exception ex) {
            Logger.getLogger(ControllerManageSensor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
