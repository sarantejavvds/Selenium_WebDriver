package _001_Automating_browsers_using_WebDriver.launch_msEdge_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Edge_Browser 
{

	public Open_Edge_Browser() 
	{
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		
	}

}
