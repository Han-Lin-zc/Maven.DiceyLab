public class Simulation {

    private Dice dice;
    private int numberOfTosses;
    private Bins bins;
    private int numberOfDice;

    public Simulation (int numberOfDice, int numberOfTosses) {
        this.dice = new Dice(numberOfDice,6);
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(numberOfDice,numberOfDice * 6);
        this.numberOfDice = numberOfDice;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResult() {
        System.out.println("Simulation of 2 dice tossed for 100000 times.");
        System.out.println();

        for (int i = numberOfDice; i < numberOfDice * 6 + 1; i++) {

            double numberOfRolls = bins.getBin(i);

            double odds = numberOfRolls / numberOfTosses;

            int starsCount = (int) (odds * 100);

            String s = String.format(" %2.2s : %7.0f : %2.2f %s" , i , numberOfRolls, odds, getRowOfStars(starsCount));
            System.out.println(s);

        }
    }

    public static String getRowOfStars(int numberOfStars) {
        String expected = "";
        for (int i = 0; i < numberOfStars; i++) {
            expected += "*";
        }
        return expected;
    }

}
