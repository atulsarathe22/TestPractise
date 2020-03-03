import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class TestClass1 {

//    public static void main(String args[]){
//        TestClass1 tc1=new TestClass1();
//        tc1.returnName();
//    }
//
//    public void returnName(){
//        String result= this.getClass().getSimpleName();
//        System.out.println(result);
//    }
//

    @DataProvider
    public Object[][] testData(){
        String[][] data= new String[2][2];
        data[0][0]="A";
        data[0][1]="B";
        data[1][0]="C";
        data[1][1]="D";

        return data;
    }

    @Test (dataProvider = "testData")
    public void testDataGet(String a,String b){
        String c=a;
        String d=b;
        System.out.println(c+":"+d);
    }


    @Test
    public void numberIncrement(){
        for(int i=1;i<50;i++){
            System.out.println(i);
        }
    }

    @Test
    public void  fireFoxlaunch(){
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Atul Sarathe\\Downloads\\Download old\\geckodriver.exe");
//        File pathBinary = new File("C:\\Users\\Atul Sarathe\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
//        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//        DesiredCapabilities desired = DesiredCapabilities.firefox();
//        FirefoxOptions options = new FirefoxOptions();
//        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
    }
}
