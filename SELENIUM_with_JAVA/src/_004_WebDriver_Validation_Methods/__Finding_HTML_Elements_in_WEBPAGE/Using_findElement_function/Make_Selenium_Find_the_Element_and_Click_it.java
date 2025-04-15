package _004_WebDriver_Validation_Methods.__Finding_HTML_Elements_in_WEBPAGE.Using_findElement_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_Selenium_Find_the_Element_and_Click_it 
{

	public Make_Selenium_Find_the_Element_and_Click_it() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
				
		driver.get("https://facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.quit();
	}

}
