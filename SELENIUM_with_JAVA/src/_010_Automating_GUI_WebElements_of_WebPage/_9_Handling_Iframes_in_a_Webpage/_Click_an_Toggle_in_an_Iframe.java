package _010_Automating_GUI_WebElements_of_WebPage._9_Handling_Iframes_in_a_Webpage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _Click_an_Toggle_in_an_Iframe 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/iframes.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Iframe_Element = driver.findElement(By.xpath("(//iframe)[1]"));
		
		driver.switchTo().frame(Iframe_Element);
		
		
		driver.findElement(By.xpath("(//a[normalize-space()='Toggle'])[1]")).click();
	
	
	}

}
