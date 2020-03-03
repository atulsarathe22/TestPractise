import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitialize {
    static WebDriver driver;

    public WebDriver initializeDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            String chromePath="C:\\Users\\Atul Sarathe\\Downloads\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",chromePath);
             this.driver= new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().deleteAllCookies();
        }

        if(browser.equalsIgnoreCase("edge")){
            String chromePath="C:\\Users\\Atul Sarathe\\Downloads\\MicrosoftWebDriver.exe";
            System.setProperty("webdriver.edge.driver",chromePath);
            this.driver= new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }

        if(browser.equalsIgnoreCase("ie")){
            String chromePath="C:\\Users\\Atul Sarathe\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver",chromePath);
            this.driver= new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
    return driver;
    }

    public WebDriver getWEbDriver(){
        return driver;
    }
}
