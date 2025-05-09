package _011_ALERTs._1_accept_the_alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _accept_function_on_Alert
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click sign button without usrname and password
		driver.findElement(By.name("proceed")).click();
		
		//capture alert text
		String alert_message = driver.switchTo().alert().getText();
		System.out.println("Alert message : "+alert_message);
		
		//click ok  to alert 
		driver.switchTo().alert().accept();
	}
}
