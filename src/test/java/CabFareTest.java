import org.testng.Assert;
import org.testng.annotations.Test;

public class CabFareTest {
    @Test
    public void checkCabFare(){
        float expected = CabFare.fareCalc(15,40);
        Assert.assertEquals(190, expected);
    }
}
