package _002_Browser_Commands_Provided_by_WebDriver._example_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import _1_automating_browsers_basic.Open_Chrome_Browser;

public class _example_to_use_get_function 
{

	public _example_to_use_get_function() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Open_Chrome_Browser chrome_driver = new Open_Chrome_Browser();

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://google.com"); /* Takes into chrome browser */
		
		driver.get("https://mangadex.org/title/a2c1d849-af05-4bbc-b2a7-866ebb10331f/one-piece");
		
	}
	
	
}
