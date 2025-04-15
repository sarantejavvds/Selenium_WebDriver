package _007_JavascriptExecutor_Interface_to_Interact_with_webpage._6_Enter_text_into_textbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _javascript_executor_to_give_input_to_textbox
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
		   
		   WebElement text_box = driver.findElement(By.xpath("(//input)[1]"));
		   
		   js_executor.executeScript("arguments[0].value='Boost';", text_box);
		   
		  driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		  // js_executor.executeScript("var e = new KeyboardEvent('keydown', {key: 'Enter'}); arguments[0].dispatchEvent(e);", text_box);
		   
		   //js_executor.executeScript("var input = document.querySelector(\"input[placeholder='Search for Products, Brands and More']\"); input.value='toys'; input.dispatchEvent(new KeyboardEvent('keydown', {'key':'Enter'}));");

	}

}
