package _002_Browser_Commands_Provided_by_WebDriver._example_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_Names_of_the_Webpage_and_its_URL_in_a_Browser 
{

	public Capturing_Names_of_the_Webpage_and_its_URL_in_a_Browser() 
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
		
		driver.get("https://readberserk.com/");
		
		String Page_Title = driver.getTitle();
		
		String Page_URL = driver.getCurrentUrl();
		
		System.out.println("Name of WebPage is " + Page_Title + " located in " + Page_URL);
	}

}