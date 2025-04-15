package _practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDate
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@id,'u_0')])[2]")).click();
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("testing");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Day')]"))).selectByVisibleText("07");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Month')]"))).selectByIndex(4);
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Year')]"))).selectByVisibleText("2000");
		driver.findElement(By.xpath("(//*[contains(@type,'radio')])[2]")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[5]")).sendKeys("sst2010@gmail.com");
		driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[7]")).sendKeys("test#$%5");
		driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
	}

}
