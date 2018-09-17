package auto;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class wapper {
	
	 public static WebDriver driver;
	 public static Dimension size;
	  static String URL="https://holidayzone.biz/";
	  
 public void Installation() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mathivathani\\eclipse-workspace\\sterling\\driver\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  	 options.addArguments("--start-maximized");
		  	 driver = new ChromeDriver( options );
		  	 Thread.sleep(2000);
		  	driver.get(URL);
	
 }
 
 public void sendvaluebyxpath(String xpath, String sendvalue) throws IOException 
	{

	driver.findElement(By.xpath(xpath)).clear();
	driver.findElement(By.xpath(xpath)).sendKeys(sendvalue);
 
	}
	public void sendvaluebyid(String id, String sendvalue) throws IOException
	{

		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(sendvalue);
		
	}
	public void clickByid(String id) {
		
			driver.findElement(By.id(id)).click();
		} 
	public void clickByxpath(String xpath) {
		
		
		driver.findElement(By.xpath(xpath)).click();
	} 
//	public void clickwaitByXpath(String xpath) throws InterruptedException {
//	
//			WebElement w =driver.findElement(By.xpath(xpath));
//			wait(3000);
//			w.click();
//		}
	
	public void clickwaitByXpath(String xpath) {
		try {
			WebElement w =driver.findElement(By.xpath(xpath));
			Thread.sleep(2000);
			w.click();
		 } catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		}
	}
	
	public void sendvaluebyclassname(String classname, String sendvalue) throws IOException {
		
			driver.findElement(By.className(classname)).clear();
			driver.findElement(By.className(classname)).sendKeys(sendvalue);
	
	}
	


	public void clickByclassname(String classname) {
		try {
			driver.findElement(By.className(classname)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + classname + " here");
		}
	}

	public void assertTextXpath(String xpath) {
		
		WebElement element1 = driver.findElement(By.xpath(xpath));
	     assertTrue(element1.isDisplayed());
		
	}

	public void clickBycssSelector(String selector) {
		try {
			driver.findElement(By.cssSelector(selector)).click();
		} catch (Exception e) {
			System.out.println("Not able to recognize Webelement " + selector + " here");
		}}

}



 

