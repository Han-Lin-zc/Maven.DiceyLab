import java.util.HashMap;
import java.util.Map;

public class Bins {

    private Dice dice;

    Map<Integer, Integer> myMap;


    public Bins(int numOfDice, int maxValue) {

        this.dice = new Dice(numOfDice, 6);
        this.myMap = new HashMap<>();

    }
    public void incrementBin(int faceValueToRetrieve) {

        if (!myMap.containsKey(faceValueToRetrieve)) {
            myMap.put(faceValueToRetrieve, 1);
        } else {
            myMap.replace(faceValueToRetrieve, myMap.get(faceValueToRetrieve) + 1);
        }
    }


    public Integer getBin(int faceValueToRetrieve) {

        if (!myMap.containsKey(faceValueToRetrieve)) {
            return 0;
        }
        return myMap.get(faceValueToRetrieve);
    }


}
