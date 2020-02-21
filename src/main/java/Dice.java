import java.util.Random;

public class Dice {

    public int numberOfDice;
    private int sizes;


    public Dice(int numberOfDice, int sizes) {
        this.numberOfDice = numberOfDice;
        this.sizes = sizes;
    }


    public int tossAndSum() {
        Random random = new Random();
        return random.nextInt((numberOfDice * sizes) - numberOfDice) + numberOfDice;
    }
}
