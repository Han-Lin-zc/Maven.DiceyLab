import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void incrementBin() {
        Bins bin = new Bins(2, 12);
        bin.incrementBin(2);
        Assert.assertTrue(bin.myMap.containsKey(2));
    }

    @Test
    public void getBin() {
        Bins bin = new Bins(2,12);
        bin.incrementBin(2);
        bin.incrementBin(2);
        Assert.assertEquals(bin.myMap.get(2),bin.getBin(2));

    }
}