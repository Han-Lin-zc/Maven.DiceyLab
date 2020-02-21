
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class DiceTest {

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    @Test
    public void tossAndSum() {
        Dice dice = new Dice(2, 6);
        Assert.assertTrue(dice.tossAndSum(100000) >= 2 && dice.tossAndSum(100000) <= 12);
        }
    }
