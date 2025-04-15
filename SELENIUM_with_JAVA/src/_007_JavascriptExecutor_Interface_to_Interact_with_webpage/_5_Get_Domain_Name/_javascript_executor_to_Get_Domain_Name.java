package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._5_Get_Domain_Name;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_Get_Domain_Name
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
		   
		   String domain_Name = js_executor.executeScript("return document.domain").toString();
		   
		   System.out.println("Domain Name : " + domain_Name);
		   
		   driver.quit();
	}

}
