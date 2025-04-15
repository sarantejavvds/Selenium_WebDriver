package _006_Locators_Available_in_Selenium.Using_css_Selector_of_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_using_Css_Selector 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("asdfghjkl;");
		driver.findElement(By.name("pass")).sendKeys("0987654322");
		
		driver.findElement(By.cssSelector("button[type = 'submit']")).submit();
		
		driver.quit();
	}

}
