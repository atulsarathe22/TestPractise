import org.testng.annotations.*;

public class testClass {

    @Test
    public void beforeCheck(){
        System.out.println("inside test");
    }

    @Test
    public void beforeCheck1(){
        System.out.println("inside test1");
    }

    @BeforeTest
    public void beforeTestCheck(){
        System.out.println("inside before test");
    }

    @BeforeMethod
    public void beforeMethodCheck(){
        System.out.println("inside before method");
    }

    @AfterMethod
    public void afterMethodCheck(){
        System.out.println("inside after method");
    }

    @AfterTest
    public void afterTestCheck(){
        System.out.println("inside after test");
    }

}
