import java.util.ArrayList;
import java.util.Collections;

public class Bins {

    private Dice dice;
    ArrayList<Integer> num;


    public Bins(int numOfDice, int maxValue) {

        this.dice = new Dice(numOfDice,6);
        this.num = new ArrayList<>();

        for (int i = 0; i < maxValue - numOfDice + 1; i++) {
            num.add(0);
        }
    }

    public Integer getBin(int rollsValue) {

        return num.get(rollsValue - dice.numberOfDice);
    }

    public void incrementBin(int rollsValue) {

        num.set(rollsValue - dice.numberOfDice, num.get(rollsValue - dice.numberOfDice) + 1);
    }
}
