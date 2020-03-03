import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class testClassProd {

    @Test
    public void plagiarismProdFileDownload() {
        Set<String> submissionIDNA=new HashSet<String>();
        ArrayList finalList=new ArrayList(FileDownload("ProdSubmission.xlsx","ProdExtra"));
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul Sarathe\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String prodURL="https://lopescgc-prod.us-west-2.elasticbeanstalk.com/#/login";
        driver.get("https://lopescgc-prod.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        driver.findElement(By.id("validation-email")).sendKeys("admin");
        driver.findElement(By.id("validation-password")).sendKeys("PlagiarismProd");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
        for(int i=0;i<finalList.size();i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();

            try{
                driver.findElement(By.id("main-message"));
                driver.navigate().back();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
            }
            catch(Exception e){
                //System.out.println("in catch block");
                submissionIDNA.add(finalList.get(i).toString());
            }
            driver.findElement(By.xpath("//div//input")).clear();
        }

        Iterator<String> iterator=submissionIDNA.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
        }
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
        }
        driver.close();
    }

    public static List<String> FileDownload(String testFileName, String sheetName){
        TestPractise testPractise=new TestPractise();
        //testPractise.plagiarismProdLogin();
        FileInputStream input;
        Workbook wb;
        String fileName=testFileName;
        ArrayList<String> arrayList = new ArrayList<String>();
        String filePath = System.getProperty("user.dir")+"\\src\\test\\Resources\\TestData" + "\\" +fileName;
        try {
            //File file = new File("C:\\Users\\Atul Sarathe\\IdeaProjects\\TestProject\\src\\test\\Resources\\TestData\\"+fileName);
            File file=new File(filePath);
            input = new FileInputStream(file);
            wb= new XSSFWorkbook(input);
            Sheet sheet = wb.getSheet(sheetName);
            // Row row=sheet.getRow(100);
            int rowCount=sheet.getLastRowNum();
            System.out.println(rowCount);
            // String result=row.getCell(3).getStringCellValue();
            // System.out.println(result);

            for(int i=1;i<=rowCount;i++){
                //String finalResult=sheet.getRow(i).getCell(3).getStringCellValue();
                //System.out.println(finalResult);
                arrayList.add(sheet.getRow(i).getCell(3).getStringCellValue());
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return arrayList;

    }
}
