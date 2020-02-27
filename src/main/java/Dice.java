import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int numberOfDice;
    private int sizes;


    public Dice(int numberOfDice, int sizes) {
        this.numberOfDice = numberOfDice;
        this.sizes = sizes;
    }

    public int tossAndSum() {
        int sum = 0;
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < numberOfDice; i++) {
            sum += random.nextInt(sizes) + 1;
        }
        return sum;
    }
}
