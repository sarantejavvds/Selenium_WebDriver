package _practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _keybd {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//mouse hover to create account link
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Create account']")));
		ac.click().perform();
		for(int i=1;i<=3;i++)
		{
			//press up arrow for 3 times
			Thread.sleep(5000);
			ac.sendKeys(Keys.ARROW_UP).perform();
		}
		//click enter key
                Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("testing");
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Next']")));
		ac.click().perform();
		Thread.sleep(5000);
		//store month listbox into select class
		Select monthlistbox = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		//get collection of options in listbox
		List<WebElement> items = monthlistbox.getOptions();
		int all_items = items.size()-1;
		System.out.println("No of items are::"+all_items);
		for(int i=1;i<items.size();i++)
		{
			System.out.println(items.get(i).getText());
		}
	}

}
