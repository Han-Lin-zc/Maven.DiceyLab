import java.util.HashMap;
import java.util.Map;

public class Bins {

    private Dice dice;
    Map<Integer, Integer> myMap;

    public Bins(int numOfDice, int maxValue) {

        this.dice = new Dice(numOfDice, 6);
        this.myMap = new HashMap<>();
    }

    public void incrementBin(int roll) {

        if (myMap.containsKey(roll)) {
            myMap.put(roll, myMap.get(roll) + 1);
        } else {
            myMap.put(roll, 1);
        }
    }

    public Integer getBin(int roll) {

        if (!myMap.containsKey(roll)) {
            return 0;
        }
        return myMap.get(roll);
    }

}
