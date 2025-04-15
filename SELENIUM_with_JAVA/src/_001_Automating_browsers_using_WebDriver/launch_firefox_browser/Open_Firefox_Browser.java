package _001_Automating_browsers_using_WebDriver.launch_firefox_browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox_Browser
{

	public Open_Firefox_Browser() 
	{
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
	}

}
