package _003_Navigation_Methods._examples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _example_to_use_navigate_method_and_its_related_functions 
{

	public _example_to_use_navigate_method_and_its_related_functions() 
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// driver.get("https://google.com"); /* Takes into chrome browser Google Page */

		String google_URL = "https://google.com";
		
		String facebook_URL = "https://facebook.com";

		driver.get("https://gmail.com");
		
		//URL mangadex_url = new URL("https://mangadex.org/title/a2c1d849-af05-4bbc-b2a7-866ebb10331f/one-piece");
		
		//driver.navigate().to(mangadex_url);
		
		
		  driver.navigate().to(google_URL);  /*Navigates to google Page in chrome browser*/
		  
		  driver.navigate().to(facebook_URL);
		  
		//  driver.navigate().to(mangadex_url); driver.navigate().to("https://mangadex.org/title/a2c1d849-af05-4bbc-b2a7-866ebb10331f/one-piece");
		  
		  driver.navigate().back();
		  
		  driver.navigate().forward();
		  
		  driver.navigate().refresh();
		 
		  driver.close();
	}

}
