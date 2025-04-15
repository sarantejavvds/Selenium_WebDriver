package ___Common_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Web_Application_Utilities
{
	public static WebDriver driver;
	
   public static void launch_Application_in_Chrome_Browser(String URL)
   {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   
	   driver = new ChromeDriver();
	   
	   driver.manage().deleteAllCookies();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get(URL); /* Invoke the URL into Browser*/
   }
   
   public static void launch_Application_in_Firefox_Browser(String URL)
   {
	   System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	   
	   driver = new FirefoxDriver();
	   
	   driver.manage().deleteAllCookies();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get(URL); /* Invoke the URL into Browser*/
   } 
   
   public static void launch_Application_in_Microsoft_Edge_Browser(String URL)
   {
	   System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
	   
	   driver = new EdgeDriver();
	   
	   driver.manage().deleteAllCookies();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get(URL); /* Invoke the URL into Browser*/
   } 
   
   public static void launch_Application_in_Internet_Explorer_Browser(String URL)
   {
	   System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	   
	   driver = new InternetExplorerDriver();
	   
	   driver.manage().deleteAllCookies();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get(URL); /* Invoke the URL into Browser*/
   }
	
   public static void close_Web_Application()
   {
	   driver.close();
   }
   
}
