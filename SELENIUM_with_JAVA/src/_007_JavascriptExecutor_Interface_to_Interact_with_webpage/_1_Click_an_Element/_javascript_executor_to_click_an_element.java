package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._1_Click_an_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_click_an_element
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
		   
		   WebElement Login_link = driver.findElement(By.xpath("//span[contains(text(), 'Login')]"));
		   
		   
		   js_executor.executeScript("arguments[0].click();", Login_link);

	}

}
