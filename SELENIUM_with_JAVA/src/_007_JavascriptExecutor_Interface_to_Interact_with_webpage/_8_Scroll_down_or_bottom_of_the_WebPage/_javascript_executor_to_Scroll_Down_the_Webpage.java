package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._8_Scroll_down_or_bottom_of_the_WebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_Scroll_Down_the_Webpage
{

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   JavascriptExecutor js_executor = (JavascriptExecutor)driver;
		   
		   js_executor.executeScript("window.location = 'https://www.flipkart.com/'");
		  
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		 
		   
		 //  js_executor.executeScript("window.scrollBy(0, 200);"); /* Scrolls down upto  200 pixels*/

		   js_executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

}
