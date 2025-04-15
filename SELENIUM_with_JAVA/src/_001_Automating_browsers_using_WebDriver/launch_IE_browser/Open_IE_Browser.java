package _001_Automating_browsers_using_WebDriver.launch_IE_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_IE_Browser 
{

	public Open_IE_Browser() 
	{
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
	}

}
