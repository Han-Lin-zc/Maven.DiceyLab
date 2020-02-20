import java.util.Random;
import java.util.logging.Logger;

public class Dice {

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    private int numberOfDice;
    private int numberOfFaceOnDice;


    public Dice(int numberOfDice, int numberOfFaceOnDice) {
        this.numberOfDice = numberOfDice;
        this.numberOfFaceOnDice = numberOfFaceOnDice;
    }


    public int tossAndSum() {
        Random random = new Random();
        return random.nextInt(numberOfDice * numberOfFaceOnDice) + 1;
    }
}
