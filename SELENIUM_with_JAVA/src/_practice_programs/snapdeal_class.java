package _practice_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal_class {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[11]/a/span"))).perform();
	
		
		
		driver.findElement(By.xpath("//*[@id=\"category10Data\"]/div[2]/div/div/p[3]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input")).sendKeys("200");
		driver.findElement(By.xpath("//div[contains(text(), 'GO')]")).click();
	
		//driver.findElement(By.xpath("(//input[@class = 'filter-value'])[1]")).click();
		try {
			driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/label")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tab-\"]/div/div/div[2]/div/div/div[15]/div[2]/label/a")).click();
		
		String Expected_brand = "lenovo";
		
		String Actual_brand = driver.findElement(By.xpath("//*[@id=\"1354031\"]/div[2]/div[1]/a/p")).getText().toLowerCase();
		
		
		if(Actual_brand.contains(Expected_brand))
		{
			System.out.println("Lenovo is Displayed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"1354031\"]/div[2]/div[1]/a/p")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pincode-check\"]")).sendKeys("500038");
		
		
		driver.findElement(By.xpath("//*[@id=\"pincode-check-bttn\"]")).click();
		
		
		String avail =  driver.findElement(By.xpath("//*[@id=\"pdp-pincode-rp\"]/div[3]/p")).getText();
		
		System.out.println("Availability: " + avail);
	}

}
