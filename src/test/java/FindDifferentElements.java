import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindDifferentElements extends DriverInitialize {
    WebElement username,password;
    public WebElement getUserName(){
        WebDriver driver=getWEbDriver();
        username=driver.findElement(By.id("validation-email"));
        return username;
    }
}
