package auto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class automate1 {
	
public static File sterling=new File("C:\\Users\\Mathivathani\\eclipse-workspace\\sterling\\automation.xlsx");
	
	public static XSSFWorkbook workbook;
	   public static XSSFSheet sheet;
	   public static XSSFCell cell;
	   public static WebElement searchelement;
	   
	   //Creation of object for the class methods
	  static automate2 obj = new automate2();
	   static WebDriver driver;
	   
	   
  @Test
  public void input() throws InterruptedException, IOException {
	  
	  FileInputStream finput = new FileInputStream(sterling);

	  // Load the workbook.
	  workbook = new XSSFWorkbook(finput);

	// Load the sheet in which data is stored.
	sheet= workbook.getSheetAt(0);

	//Getting the row count value and storing
	int rc=sheet.getLastRowNum();

	for(int i=1; i<=rc; i++)      
	   
	   {    
	     Row row = sheet.getRow(i);
	     
	     if(row == null || row.getCell(1)==null)
	     {      
	      continue;
	     }
	         
	     String testcase = row.getCell(1).toString();        
	     System.out.println(testcase);
	     
	     //storing the test caseid value  
	     String testcaseid = row.getCell(0).toString();       
	
	   
	   
  

  switch(testcase)
  {
  
  case "Installation":
	     
	     System.out.println(testcaseid + ":" + testcase);
	    
	         obj.Beforelogin();    
	         Thread.sleep(5000);
	         updateresult("//*[@id=\'sterling-navbar\']/ul[2]/li[1]/a",i);
	     break;


}}}
  

  @SuppressWarnings("static-access")
  public static void updateresult(String componentname,int i) throws IOException, InterruptedException
  {
     
     int a =obj.driver.findElements(By.xpath(componentname)).size();
     
     
     // Specify the message needs to be written.          
        String message = "Pass";
        String message1 = "Fail";
        if(a==1)
     
     {    
     
     Thread.sleep(3000);  
    sheet.getRow(i).createCell(5).setCellValue(message);
   
     }
   
    else
          {
           Thread.sleep(3000);
           sheet.getRow(i).createCell(5).setCellValue(message1);                    
           
          }
        FileOutputStream foutput=new FileOutputStream(sterling);
     
        workbook.write(foutput);
           
        foutput.close();

        

  }  
	  
  

}
