import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Plagiarism {
    DriverInitialize driverInitialize= new DriverInitialize();
    FindDifferentElements findDifferentElements=new FindDifferentElements();
    WebDriver driver;
    @Test
    public void plagiarismProdLogin() {
        String submissionid="0bde1897-7a76-4641-a42f-efd4b20170bb,8d048c79-27cf-4522-b4b1-ba1f6766738a,573a5e45-0ce4-4336-b4f3-3ab1e606ae94,0ba507a5-225c-4705-aa8b-5e0951140831,e2d1d583-9768-4435-bbe0-101304538a74,eec18fc3-9a45-4569-88dc-e8309af215b5,a97f6d1b-7fd7-4699-9f8b-1e2eaa589b19,54cfeaa2-681f-45b2-ba67-b78e1d619ae5,09c53e86-544f-4ceb-b30f-c71fcefddd7e,9eac9d97-dfb9-40eb-aacd-a49b38ee1214,adcaab1e-39de-4abe-ab8d-f2bc2961975c,c4160c5b-f3ab-422c-8251-47c759ac19d5,1defcb05-ddfc-4e37-af28-fd7542d37e1b,e99358a7-8b13-4afb-b0f1-286756e51dfa,ebc64b5f-92d4-494a-80b7-df98b59d44ae,da04c615-0da3-4d51-895e-352f1f28016a,9a1f8b2b-ff9d-4f38-b16f-06d406870dca,bdb1f966-6a6f-4495-88f9-34f02c4280ec,e104b661-5c20-4f1b-aea3-ca9a35f6538c,4db33947-5e2d-4e99-be9d-3905c3a05e61,a14dca27-6ffd-437c-94d4-066a61abe022,a4ac7e85-04f4-4505-9f53-523e6f37ed6f,8ec0944d-e816-4a14-be1d-6f781858525e,b659fd6d-410e-40b3-beca-daa6459e3fd6,251f0d79-8b85-41d9-989a-549c14f6bd43,54553d12-2bdd-439f-956f-613e4398f51c,0f339247-be0d-496b-a984-3db46b1347ed,126e24a3-ae97-4a3e-a656-4e5ead9cf916,846b371b-85f9-40a1-9e12-6b3943369c0a,8c42e87c-0179-402a-93f6-db82615dbcd9,8ef90ff0-6a0e-463b-a4ce-578e1064b001,3e0931b9-a43c-40c9-a539-263234183a52,1bb5151d-8707-44eb-8bed-12a448351b39,5ae7fdc4-8dcb-4873-98ca-850738d322d4,1d5f4cbc-1d4e-4d78-875f-ceed0f966fea,ab4162ea-e700-4cec-9f28-a22c8ab414f7,1de4a59a-71e1-41e4-aa0d-69dee68af31b,503ae249-1489-4fb0-ae37-849918e09326,21691599-7a97-4514-947d-e2303d7af43a,b490ecf7-84e7-40b4-87a0-e254944b452d,77591b69-2085-44ec-8f03-6c8f80026c5a,6dcf4b8c-e202-4789-9730-4135980dabf6,4789fbc0-3fb5-4b52-8f25-80af2bc8e81b,c8e1b950-e5d0-468b-ba48-edff6470e837,a79cb227-5fd2-4727-b02f-1a83d7f2d588,138f79c1-7fe7-4254-a889-511fd2e256f9,49494bbc-57ab-4278-81a9-b2453c9e401e,dbf90953-b2fb-4213-ab67-2000e81362b8,c210f331-f957-4c05-8be5-e9b57bb62db2,dd8ed977-41a0-4b6e-aaad-72e98670684e,7e61a310-b98e-4294-beb3-12d112ac0519,95c06aa7-6c32-41cd-88ac-063e67e789ea,24708be8-b896-42d2-aa83-f20217ff9893,bf3adc5c-685b-4a84-adb0-d62268425727,f4a3cb7d-ec52-483b-8971-64bc3acde45f,ae7e61f7-4d18-4c76-9d04-c70feb0a7e82,52191041-060f-4fbc-a479-0c1a1b6c69a0,e711afb4-1e67-4d3d-9705-52512843e5ea,c68ec427-5d90-4c95-86ce-c2a0df2c773c,bea59685-f073-4943-ba9c-cdfdf4ecaf2a,3053a5b4-9d2e-4bd2-9650-99dce482b554,6c1d68bc-a111-44da-bfd2-7a77289cf0ab,a72c4434-161c-450e-89f6-a29bbf8163d1,db7a9eaf-80b1-4b35-9d17-602f61060d34,677a1079-9305-4119-9235-099752a461c4,3dbcf65d-38b0-46ca-985c-71d38bb7123e,650beca7-29d8-4ab1-9116-bd275ef781e2,4ffe5c76-4a19-4e9b-85ee-a5eba91c7266,7029810f-3739-4ec1-8990-4db005620c7f,20d9009f-c0ca-4d52-a7c1-d3fb26c9d680,1ac482b4-bb5a-43b4-a617-de44176426fd,ed810c02-a7e5-44d0-8c96-cc28b85a04ae,793952ad-7602-461c-b60a-b7e03c446a5e,9c416898-bf66-46be-a6fa-2909e321bd98,9764e826-4b78-41aa-ab42-310aa99bb38c,8d7efd66-bb99-4af0-b004-df0a2ba9ffee,8ebf5a99-7791-4f1e-bfbd-876934d0694d,04aaf121-0468-45cc-ba94-1b637381aeea,5745a288-8c62-4a10-96d9-f5c09c43a950,9b50a84f-b892-4c78-a398-fc61831e3e46";
        String arraySteps[] = submissionid.split(",");
        System.out.println(arraySteps[0]);
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-prod.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        //driver.findElement(By.id("validation-email")).sendKeys("Atul");
        findDifferentElements.getUserName().sendKeys("admin");
        driver.findElement(By.id("validation-password")).sendKeys("PlagiarismProd");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"form-control plag--search-submission-text-field ng-pristine ng-valid ng-empty ng-touched\"]")));
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        for(int i=0;i<arraySteps.length;i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(arraySteps[i]);
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();
            driver.findElement(By.xpath("//div//input")).clear();
        }
        driver.close();
    }

    @Test
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


    @Test
    public static void testExcelResult(){
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","DevID"));
        System.out.println(finalList);
        System.out.println(finalList.size());
        for(int i=0;i<finalList.size();i++){
            System.out.println(finalList.get(i));
        }
    }



    @Test
    public void plagiarismDevfiledownload() {
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","DevID"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-dev.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("admin");
        driver.findElement(By.id("validation-password")).sendKeys("PlagiarismDev");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
        WebElement dropElements=driver.findElement(By.xpath("//li[@class=\"dropdown\"]/select"));
        Select dropDownSelect=new Select(dropElements);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        dropDownSelect.selectByVisibleText("Demo Tenant");
        for(int i=0;i<finalList.size();i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();
            driver.findElement(By.xpath("//div//input")).clear();
        }
        driver.close();
    }


    @Test
    public void plagiarismDevfileRetry() {
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","DevRetry"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-dev.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("Deepa");
        driver.findElement(By.id("validation-password")).sendKeys("deepa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
        WebElement dropElements=driver.findElement(By.xpath("//li[@class=\"dropdown\"]/select"));
        Select dropDownSelect=new Select(dropElements);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        dropDownSelect.selectByVisibleText("Demo Tenant");
        for(int i=0;i<finalList.size();i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
////            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"retry--dashboard\"]")));
            driver.findElement(By.xpath("//*[@id=\"retry--dashboard\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Confirm']")));
            driver.findElement(By.xpath("//span[text()='Confirm']")).click();
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//div//input")).clear();
        }
        driver.close();
    }


    @Test
    public void plagiarismProdFileDownload() {
        Set<String> submissionIDNA=new HashSet<String>();
        ArrayList finalList=new ArrayList(FileDownload("ProdSubmission.xlsx","ProdExtra"));
        String prodURL="https://lopescgc-prod.us-west-2.elasticbeanstalk.com/#/login";
        try {
            Thread.sleep(12000);
        }
        catch (Exception e){

        }
        login(prodURL,"admin","PlagiarismProd");
        WebDriverWait wait=new WebDriverWait(driver,2000);
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

    public void login(String url,String username, String password){
         this.driver = driverInitialize.initializeDriver("ie");
        driver.navigate().to(url);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation[email]")));
        findDifferentElements.getUserName().sendKeys(username);
        driver.findElement(By.id("validation-password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @Test
    public void plagiarismDevGetFileName() {
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","DevID"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-dev.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("Deepa");
        driver.findElement(By.id("validation-password")).sendKeys("deepa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title=\"Search by SubmissionId or Assignmentname or Classname or Attached document\"]")));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@title=\"Search by SubmissionId or Assignmentname or Classname or Attached document\"]"))));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='col-sm-3']/input[@type='text']")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("col-sm-3")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-search']")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span//input[@type='text']")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/span[1]/input")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fa fa-search")));
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class='fa fa-search']"))));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//span//button//following::i[@class='fa fa-search']")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(@class,'fa fa-search')]")));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'fa fa-search')]")));



        for(int i=0;i<finalList.size();i++){
            driver.findElement(By.xpath("//*[@class='col-sm-3']/input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@class='fa fa-search']")).click();
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){

            }

        }
        driver.close();
    }

    @Test
    public void plagiarismDevOpenReport() {
        ArrayList finalList = new ArrayList(FileDownload("testdata.xlsx", "Report"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-dev.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("Deepa");
        driver.findElement(By.id("validation-password")).sendKeys("deepa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
        for(int i=0;i<finalList.size();i++) {
            try {
                Robot rb = new Robot();
                rb.keyPress(KeyEvent.VK_CONTROL);
                rb.keyPress(KeyEvent.VK_T);
                rb.keyRelease(KeyEvent.VK_CONTROL);
                rb.keyRelease(KeyEvent.VK_T);
                driver.switchTo().window(finalList.get(i).toString());
                Thread.sleep(12000);

                //driver.get(finalList.get(i).toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void plagiarismDevReportOpen() {
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","ReportOpen"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-dev.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("Deepa");
        driver.findElement(By.id("validation-password")).sendKeys("deepa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
        WebElement dropElements=driver.findElement(By.xpath("//li[@class=\"dropdown\"]/select"));
        Select dropDownSelect=new Select(dropElements);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        dropDownSelect.selectByVisibleText("Demo Tenant");
        for(int i=0;i<finalList.size();i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
////            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"retry--dashboard\"]")));
            driver.findElement(By.xpath("//*[@id=\"retry--dashboard\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Confirm']")));
            driver.findElement(By.xpath("//span[text()='Confirm']")).click();
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//div//input")).clear();
        }
        driver.close();
    }



    @Test
    public void plagiarismQAfileRetry() {
        ArrayList finalList=new ArrayList(FileDownload("testdata.xlsx","QARetry"));
        WebDriver driver = driverInitialize.initializeDriver("chromE");
        driver.get("https://lopescgc-qa.us-west-2.elasticbeanstalk.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation-email")));
        findDifferentElements.getUserName().sendKeys("Deepa");
        driver.findElement(By.id("validation-password")).sendKeys("deepa");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")));
        driver.findElement(By.xpath("//*[@id=\"logout\"]//li[@class=\"plag--navbar-list-item\"]/a[contains(text(),'Search')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input")));
        WebElement dropElements=driver.findElement(By.xpath("//li[@class=\"dropdown\"]/select"));
        Select dropDownSelect=new Select(dropElements);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        dropDownSelect.selectByVisibleText("Demo Tenant");
        for(int i=0;i<finalList.size();i++) {
            driver.findElement(By.xpath("//div//input")).sendKeys(finalList.get(i).toString());
            driver.findElement(By.xpath("//*[@id=\"submit--dashboard\"]")).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
////            driver.findElement(By.xpath("//a[contains(text(),'Original File')]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"retry--dashboard\"]")));
            driver.findElement(By.xpath("//*[@id=\"retry--dashboard\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Confirm']")));
            driver.findElement(By.xpath("//span[text()='Confirm']")).click();
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Original File')]")));
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//div//input")).clear();
        }
        driver.close();
    }

}
