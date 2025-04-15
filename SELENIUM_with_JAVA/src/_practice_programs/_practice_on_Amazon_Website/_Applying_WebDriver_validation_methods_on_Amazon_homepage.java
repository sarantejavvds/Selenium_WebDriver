package _practice_programs._practice_on_Amazon_Website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _Applying_WebDriver_validation_methods_on_Amazon_homepage
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://amazon.com");
		
		//print title and length of title
		String pagetitle =driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and lenght of url
		String strUrrl = driver.getCurrentUrl();
		System.out.println(strUrrl);
		System.out.println(strUrrl.length());

	}

}
