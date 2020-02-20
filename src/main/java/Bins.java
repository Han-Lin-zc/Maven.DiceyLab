import java.util.ArrayList;
import java.util.Collections;

public class Bins {

    private Dice dice;
    ArrayList<Integer> num;


    public Bins(int numOfDice, int maxValue) {
        this.dice = new Dice(numOfDice,6);
        this.num = new ArrayList<>(maxValue - numOfDice + 1);
        for (Integer i : num) {
            i = 0;
        }
    }

    private Integer getBin(int rollsValue) {
        return null;
    }

    private void incrementBin() { }



}
