package common.entities;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author fallen
 */
public class NotifyDTO implements Serializable {
    private int numberRoom;
    private int counterOutOfRange;
    private HashMap<String, Boolean> indicators;

    public NotifyDTO(int numberRoom,HashMap<String, Boolean> indicators, int counterOutOfRange) {
        this.numberRoom = numberRoom;
        this.indicators = indicators;
        this.counterOutOfRange = counterOutOfRange;
    }

    public HashMap<String, Boolean> getIndicators() {
        return indicators;
    }

    public void setIndicators(HashMap<String, Boolean> indicators) {
        this.indicators = indicators;
    }
    
    public int getCounterOutOfRange() {
        return counterOutOfRange;
    }

    public void setCounterOutOfRange(int counterOutOfRange) {
        this.counterOutOfRange = counterOutOfRange;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
}