package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._7_Scroll_to_specific_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_Scroll_to_specific_Element
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
		   
		   WebElement samsung_link = driver.findElement(By.xpath("//a[contains(text(), 'SAMSUNG Galaxy S25 Plus')]"));
		   
		   js_executor.executeScript("arguments[0].scrollIntoView(true);", samsung_link);
		   

	}

}
