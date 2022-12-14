package common.entities;

import java.io.Serializable;

/**
 *
 * @author fallen
 */
public class IndicatorDTO implements Serializable {
    private int numberRoomPatient;
    private int cardiacFrequency;
    private int [] bloodPressure;
    private int respiratoryFrequency;
    private double temperature;
    private int oxigenSaturation;

    public IndicatorDTO(int numberRoomPatient, int cardiacFrequency, int systolicPressure, int diastolicPressure, int respiratoryFrequency, double temperature, int oxigenSaturation) {
        this.numberRoomPatient = numberRoomPatient;
        this.cardiacFrequency = cardiacFrequency;
        this.bloodPressure = new int[2];
        this.bloodPressure[0] = systolicPressure;
        this.bloodPressure[1] = diastolicPressure;
        this.respiratoryFrequency = respiratoryFrequency;
        this.temperature = temperature;
        this.oxigenSaturation = oxigenSaturation;
    }
    
    public int getNumberRoomPatient() {
        return numberRoomPatient;
    }
    
    public void setNumberRoomPatient(int numberRoomPatient) {
        this.numberRoomPatient = numberRoomPatient;
    }
    
    public int getCardiacFrequency() {
        return cardiacFrequency;
    }

    public void setCardiacFrequency(int cardiacFrequency) {
        this.cardiacFrequency = cardiacFrequency;
    }

    public int[] getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int systolicPressure, int diastolicPressure) {
        this.bloodPressure[0] = systolicPressure;
        this.bloodPressure[1] = diastolicPressure;
    }

    public int getRespiratoryFrequency() {
        return respiratoryFrequency;
    }

    public void setRespiratoryFrequency(int respiratoryFrequency) {
        this.respiratoryFrequency = respiratoryFrequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getOxigenSaturation() {
        return oxigenSaturation;
    }

    public void setOxigenSaturation(int oxigenSaturation) {
        this.oxigenSaturation = oxigenSaturation;
    }
}