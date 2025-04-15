package _009_Take_Screenshot_of_WebPage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Take_screenshot_of_Dashboard_of_ERP 
{

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://webapp.qedgetech.com/login.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String time_Stamp = new SimpleDateFormat("yyyy_MM_dd__HH_mm_ss").format(new Date());
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("master");
		
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).submit();
		
		try 
		{
			File dashboard_screenshot  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(dashboard_screenshot, new File("./src/_009_Take_Screenshot_of_WebPage/Screenshots_By_Selenium/dashboard_screenshot_of_ERP_" + time_Stamp + ".png"));
		
		} 
		catch (Throwable IO) 
		{
		  System.out.println(IO.getMessage());
		}

		driver.quit();
	}

}
