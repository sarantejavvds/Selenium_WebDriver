package __open_my_accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class __open_whatsapp {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://web.whatsapp.com/");
		driver.get("https://wa.me/93");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
