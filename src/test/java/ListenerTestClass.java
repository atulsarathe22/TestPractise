import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class ListenerTestClass {

    @Test (priority=1)
    public void testPass(){
        Assert.assertEquals(2,2);
    }

    @Test (priority=2)
    public void testFail(){
        Assert.assertTrue(false);
    }
}
