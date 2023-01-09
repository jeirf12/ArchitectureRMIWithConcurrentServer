package client.view;

import common.entities.IndicatorDTO;
import java.rmi.RemoteException;
import common.infra.Console;
import common.infra.Menu;
import common.interfaces.IControllerManageSensor;

/**
 *
 * @author fallen
 */
public class MenuClient extends Menu {
    private IControllerManageSensor objRemoteSensor;
    
    public MenuClient(String title, String [] options, IControllerManageSensor objRemoteSensor) {
        super(title, options);
        this.objRemoteSensor = objRemoteSensor;
        this.repeatedMenu();
    }
    
    @Override
    public void processOption() {
        switch (option) {
            case 1 -> {
                this.registerSensor();
            }
            case 2 -> {
                Console.writeJumpLine("Salir...", false);
            }
        }
    }
    
    private void registerSensor() {
        try {
            boolean value = false;
            double temperature = -1;
            int numRoom = -1, cardiacFrequency = -1, respiratoryFrequency = -1,
                    oxigenSaturation = -1, systolic = -1, diastolic = -1;
            numRoom = Console.read("Digite el numero de la habitacion del paciente: ", numRoom, false);
            cardiacFrequency = Console.read("Digite la frecuencia cardiaca: ", cardiacFrequency, false);
            systolic = Console.read("Digite la presion sistolica: ", systolic, false);
            diastolic = Console.read("Digite la presion diastolica: ", diastolic, false);
            respiratoryFrequency = Console.read("Digite la frecuencia respiratoria: ", respiratoryFrequency, false);
            temperature = Console.read("Digite la temperatura: ", temperature, false);
            oxigenSaturation = Console.read("Digite la saturacion de oxigeno: ", oxigenSaturation, false);
            IndicatorDTO indicator = new IndicatorDTO(numRoom, cardiacFrequency, systolic, diastolic, 
                    respiratoryFrequency, temperature, oxigenSaturation);
            value = this.objRemoteSensor.registerIndicator(indicator);
            String messageOut = (value) ? "Registro realizado satisfactoriamente..." : "No se pudo realizar el registro";
            Console.writeJumpLine(messageOut, false);
        } catch (RemoteException e) {
            Console.writeJumpLine("La operación no se pudo completar, intente nuevamente...", false);
        }
    }
}
