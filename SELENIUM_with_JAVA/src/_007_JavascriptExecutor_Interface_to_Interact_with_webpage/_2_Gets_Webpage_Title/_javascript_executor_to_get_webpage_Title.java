package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._2_Gets_Webpage_Title;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_get_webpage_Title
{

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   JavascriptExecutor js_executor = (JavascriptExecutor)driver;
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		  
		   String page_title =  js_executor.executeScript("return document.title;").toString();

		   System.out.println("Page Title : " + page_title);
		   
		   driver.quit();
	}

}
