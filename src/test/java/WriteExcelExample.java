import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteExcelExample {
    private DateFormat sdf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    private DateFormat sdf1=new SimpleDateFormat("yyyy_mm_dd");

    @Test
    public void ExcelWriteResult() {
        Date date=new Date();
        System.out.println(sdf.format(date));
        //File file = new File("C:\\Users\\Atul Sarathe\\IdeaProjects\\TestProject\\src\\test\\Resources\\TestData" + "\\" + "ExcelExample.xlsx");
        String file = System.getProperty("user.dir")+"\\src\\test\\Resources\\TestData" + "\\" +sdf.format(date)+ ".xlsx";
        Workbook wb=new XSSFWorkbook();
        try {
            FileOutputStream output = new FileOutputStream(file);
            Sheet sheet=wb.createSheet("Sheet1");
            for(int i=0;i<10;i++) {
                Row row = sheet.createRow(i);
                    row.createCell(0).setCellValue("UserName");
                    row.createCell(1).setCellValue("Password");
            }
            System.out.println(sheet.getLastRowNum());
            System.out.println(sheet.getRow(0).getLastCellNum());
            wb.write(output);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        String path=System.getProperty("user.dir");
        System.out.println(path);
    }

    @Test
    public void testDirectory(){
        Date date=new Date();
        File file=new File(System.getProperty("user.dir")+"\\src\\test\\Resources\\TestData\\"+sdf1.format(date));
        file.mkdir();
    }
}
