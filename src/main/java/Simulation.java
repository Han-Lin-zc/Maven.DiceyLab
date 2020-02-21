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
        bins.incrementBin(dice.tossAndSum(numberOfTosses));
    }

    public void printResult() {
        System.out.println("Simulation of 2 dice tossed for 100000 times.");
        System.out.println();

        for (int i = numberOfDice; i < numberOfDice * 6 + 1; i++) {

            int numberOfRolls = bins.getBin(i - numberOfDice);

            int odds = bins.getBin(i - numberOfDice) / numberOfTosses;

            String s = String.format(" %2.2s : %7.8s : %2.3s %2.10s" , i , numberOfRolls, odds, getRowOfStars(odds));

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
