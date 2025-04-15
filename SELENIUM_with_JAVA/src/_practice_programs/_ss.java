package _practice_programs;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _ss {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
	//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("ranga@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//wait until flight booking button is clickable
		//mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Flight Bookings']")));
		//take screen shot and store into one variable
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screen shot into local system
		try {
			FileUtils.copyFile(screen, new File("d:/myscreenshot/homepage.png"));
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

	}

}
