import java.util.Random;

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

    public int tossAndSum() {

        return random.nextInt(numberOfDice * sizes);

    }
}
