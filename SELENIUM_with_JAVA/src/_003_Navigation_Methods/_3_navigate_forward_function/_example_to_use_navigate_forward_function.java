package _003_Navigation_Methods._3_navigate_forward_function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_navigate_forward_function 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://mangadex.org/title/40bc649f-7b49-4645-859e-6cd94136e722/dragon-ball");
		
		driver.navigate().to("https://mangadex.org/title/a2c1d849-af05-4bbc-b2a7-866ebb10331f/one-piece");
		
		driver.navigate().back();
		
		driver.navigate().forward();

	}

}
