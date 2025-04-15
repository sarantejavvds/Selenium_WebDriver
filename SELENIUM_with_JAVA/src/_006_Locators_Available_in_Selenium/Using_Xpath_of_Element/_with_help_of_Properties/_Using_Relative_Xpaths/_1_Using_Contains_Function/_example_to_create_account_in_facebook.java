package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Properties._Using_Relative_Xpaths._1_Using_Contains_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _example_to_create_account_in_facebook 
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://facebook.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   
		   driver.findElement(By.xpath("(//a[contains(@id,'u_0')])[2]")).click();
		   
			driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Selenium");
			driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("testing");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Day')]"))).selectByVisibleText("20");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Month')]"))).selectByIndex(10);
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Year')]"))).selectByVisibleText("1987");
			driver.findElement(By.xpath("(//*[contains(@type,'radio')])[2]")).click();
			driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[5]")).sendKeys("hellow@gmail.com");
			driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[7]")).sendKeys("test#$%5");
			
			driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
		   
		   
	}

}
