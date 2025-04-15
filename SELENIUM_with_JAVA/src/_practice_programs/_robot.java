package _practice_programs;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _robot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//mouse hover to gmail link in google page
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		//and right click on it
		ac.contextClick().perform();
		Thread.sleep(5000);
		//create object for robot class
		Robot r = new Robot();
		//press down arrow for 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click enter key
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//get collection of all windows
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		Object brw []= allwins.toArray();
		String parent =brw[0].toString();
		String child =brw[1].toString();
		//switch to child window
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Images")));
		ac.click().perform();
		System.out.println(driver.getTitle());
	}

}
