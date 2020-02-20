import java.util.Random;
import java.util.logging.Logger;

public class Dice {

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    private int numberOfDice;
    private int numberOfFaceOnDice;

    Dice crapsDice = new Dice(2, 6);
    Dice yatzeeDice = new Dice(5,6);


    Integer toss = crapsDice.tossAndSum();


    public Dice(int numberOfDice, int numberOfFaceOnDice) {
        this.numberOfDice = numberOfDice;
        this.numberOfFaceOnDice = numberOfFaceOnDice;
    }


    public int tossAndSum() {
        long seed = 25L;
        Random random = new Random(seed);
        int sum = random.nextInt(numberOfDice * numberOfFaceOnDice);
        LOGGER.info("" + random.nextInt());
        return sum;
    }


}



//for DiceyLab tests, use Random setSeed(x) when you set the seed,
// you always get the same series of “random” numbers