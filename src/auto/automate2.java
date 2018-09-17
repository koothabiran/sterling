package auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class automate2 extends wapper {
	
	 public static WebDriver driver;
	 public static Dimension size;
	  
	    
	  
	 @Test 
	  public void Beforelogin() throws InterruptedException, IOException {
		 Installation();
		 Thread.sleep(10000);
		 
//		 //click on Resort and hotels
//		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[3]/header/div/div[2]/div/div/ul[2]/li[2]/a");
//		 Thread.sleep(5000);
//		
//		 //click on Nearby
//		 clickByxpath("html/body/div[2]/div[3]/div[3]/main/div/div/main/div/div/div[2]/div[1]/div[1]/nav/div[2]/ul/li[2]/span");
//		 Thread.sleep(2000);
//		 
//		 //click on popular
//		 clickByxpath("html/body/div[2]/div[3]/div[3]/main/div/div/main/div/div/div[2]/div[1]/div[1]/nav/div[2]/ul/li[3]/span");
//		 Thread.sleep(2000);
//		 
//		 //click on region dropdown button
//		 clickByxpath("html/body/div[2]/div[3]/div[3]/main/div/div/main/div/div/div[2]/div[1]/div[1]/nav/div[2]/ul/li[4]/span/span");
//		 Thread.sleep(2000); 
//		 
//		 //click on experience
//		 clickByxpath("html/body/div[2]/div[3]/div[3]/main/div/div/main/div/div/div[2]/div[1]/div[1]/nav/div[2]/ul/li[5]/span");
//		 Thread.sleep(2000); 
//		 
		 
	 }
		 
		 @SuppressWarnings("unused")
		@Test 
		  public void login() throws InterruptedException, IOException { 
		 //click on signin/signup button
		
			 clickByxpath("html/body/div[2]/div[3]/div[2]/div[3]/header/div/div[1]/div/div[2]/a[3]");
		 Thread.sleep(4000);
		 
		 //click on member
		 clickByxpath("html/body/div[2]/div[3]/div[4]/div[2]/div[6]/div/div/div/div/div[2]/div[1]/div/div[2]/ul/li[2]/a");
		 Thread.sleep(4000);
		 
		 
		 //Enter the email id
		 sendvaluebyxpath("html/body/div[2]/div[3]/div[4]/div[2]/div[6]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/form/div[1]/input","sg105722@sterlingholidays.com");
		 Thread.sleep(2000);
		 
		 //Enter the password
		 sendvaluebyxpath("html/body/div[2]/div[3]/div[4]/div[2]/div[6]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/form/div[2]/input","Sterling@123");
		 Thread.sleep(2000);
		 
		 //click on signin
		 clickByxpath("html/body/div[2]/div[3]/div[4]/div[2]/div[6]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/button");
		 Thread.sleep(10000);
		 Thread.sleep(10000);
		 Thread.sleep(10000);
		 
		 //click on book now
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/main/section/div[2]/div/ul/li[7]/a");
		 //clickByclassname("btn btn-tertiary day-zero-book-button");
		 Thread.sleep(3000);
		 
		 //Enter the resort name
		 sendvaluebyxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div[1]/div/input","Sterling Kodai - Lake");
		 Thread.sleep(2000);
		 
		 //click on check in button
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div/div[1]/input");
		 Thread.sleep(3000);
		 
		 //Select from date
		 clickByxpath("html/body/div[6]/div[1]/table/tbody/tr[4]/td[1]/div");
		 Thread.sleep(3000);
		 
		 //Select To date
		 clickByxpath("html/body/div[6]/div[1]/table/tbody/tr[4]/td[2]/div");
		 Thread.sleep(3000);
		 
		 //click on person travelling and no of guests
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/div[1]/span");
		 Thread.sleep(3000);
		 
		 //Select adult
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/button[2]");
		 Thread.sleep(3000);
		 
		 //Select children
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[3]/div/div/div/button[2]");
		 Thread.sleep(3000);
		 
		 //click on check availability
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[4]/div[4]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div[2]/button");
		 Thread.sleep(20000);
		 
		
		 //Again click on Book Now button
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/main/section/div/div[3]/div/div/div/div[2]/div/div[2]/button[2]");
		 Thread.sleep(20000);
		 
		 if("driver.switchTo().alert().accept();" != null)
				 {
					 System.out.println("pass");
					 Thread.sleep(2000);
				 }
		 else 
		 {
			 clickwaitByXpath("//*[@id='panel1']/div/div[1]/div[2]/div[2]/div/figure/div/div[2]/div/div[2]/div/button");
			 
		 }
		
		 
//		
//		 	
		 Thread.sleep(15000);
		 //click on add meals button
		// clickwaitByXpath("//*[@id='panel1']/div/div[1]/div[2]/div[2]/div/figure/div/div[2]/div/div[2]/div/button");
		 //Thread.sleep(2000);
		 
		 
		 //click on Continue button
		 clickwaitByXpath("html/body/div[2]/div[3]/div[4]/main/div/div/section/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/button");
		 Thread.sleep(2000);
		 
		 
		//Again click on Continue button
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/section/div/div[1]/div/div[2]/div[3]/div/div/div[3]/div/button");
		 Thread.sleep(3000);
		 
		 //click on show full details
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/section/div/div[1]/div/div[3]/div[3]/div/div/div/div/div/div[1]/div[1]/span[3]/a");
		 Thread.sleep(3000);
		 
		 WebElement element = driver.findElement(By.className("voBkpaymentBtn"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", element);
		 
		 //html/body/div[2]/div[3]/div[4]/main/div/div/section/div/div[1]/div/div[3]/div[3]/div/div/div/div/div/div[5]/div/div[4]/input
		 
//		 WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		 wait2.until(ExpectedConditions.elementToBeClickable(By.id("voBkpaymentBtn")));
		 
		// click on Book Now button
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/section/div/div[1]/div/div[3]/div[3]/div/div/div/div/div/div[5]/div/div[5]/div/button");
		 Thread.sleep(30000);
		 
		 //click on how to get there train tab
		 clickByxpath("html/body/div[2]/div[3]/div[4]/main/div/div/section/div[1]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[2]/div/ul/li[2]/a");
		 Thread.sleep(3000);
		
		 //click on menu buttton
		 clickByxpath("html/body/div[2]/div[3]/div[2]/div[3]/header/div/div/div/div/div[1]/div[1]/div[2]/button");
		 Thread.sleep(3000);
		 
		 
		 
		 
		 
	  }

		 }
	
	