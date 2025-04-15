package __open_my_accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class __open_Gmail {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&ifkv=AXH0vVvBzmCLDWSJGvyVZEO5wJyl-krklJOaKo7P5B8jBJZf3kPFamc44I8uItDnqDBpdnytl13z&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1243901738%3A1743915218119784");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("sarantejavvds1@gmail.com");
		
		driver.findElement(By.xpath("(//button)[3]")).click();
	}

}
