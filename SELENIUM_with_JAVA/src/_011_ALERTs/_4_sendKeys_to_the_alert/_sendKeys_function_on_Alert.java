package _011_ALERTs._4_sendKeys_to_the_alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _sendKeys_function_on_Alert
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
	WebElement button =	driver.findElement(By.xpath("(//button)[5]"));
	//WebElement button = driver.findElement(By.cssSelector("#promtButton"));

	 //action.moveToElement(button).click().perform();
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
	button.click();
		
		 driver.switchTo().alert().sendKeys("SARAN");

	}
}
