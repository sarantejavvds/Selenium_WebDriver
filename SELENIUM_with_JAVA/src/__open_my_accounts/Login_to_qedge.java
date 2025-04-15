package __open_my_accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_qedge
{
    /* No longer has Loginpage with Textboxes  */
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://learn.qedgetech.com/learn/account/signin");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("sarantejavvds1@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter a password']")).sendKeys("Saran7@2000");
		
		driver.findElement(By.cssSelector("#root-identifier-collection > div.layout.css-cihya9 > div > div > div > div.css-tavv42 > div.css-vurnku > div.css-1o1x4yu > div.css-1nr0p2b > button > div > div > div > div")).click();

		/* successfully opened and Logged-in */
		
		driver.findElement(By.xpath("//*[@id=\"root-identifier-collection\"]/div[2]/div/div[1]/nav/div/div[2]/div[2]/button/div/div[2]")).click();
		
	}

}
