package _practice_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _iterator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='E-CATERING'])[1]")).click();
		//get collection of all windows ids
		Set<String> allwins= driver.getWindowHandles();
		System.out.println(allwins);
		Iterator<String> brw =allwins.iterator();
		while (brw.hasNext()) {
			String windows = (String) brw.next();
			if(!parent.equals(windows))
			{
				Thread.sleep(5000);
				driver.switchTo().window(windows);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

}
