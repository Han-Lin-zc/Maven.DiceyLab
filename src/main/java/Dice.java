import java.util.Random;

public class Dice {

    public int numberOfDice;
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
