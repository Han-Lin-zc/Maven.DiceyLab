import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int numberOfDice;
    private int sizes;
    private Random random;


    public Dice(int numberOfDice, int sizes, long random) {
        this.numberOfDice = numberOfDice;
        this.sizes = sizes;
        this.random = new Random(random);
    }

    public Dice(int numberOfDice, int sizes) {
        this.numberOfDice = numberOfDice;
        this.sizes = sizes;
        this.random = new Random();
    }

    public int tossAndSum(int numberOfTosses) {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += random.nextInt(sizes) + 1;
        }
        return sum;
    }
}
