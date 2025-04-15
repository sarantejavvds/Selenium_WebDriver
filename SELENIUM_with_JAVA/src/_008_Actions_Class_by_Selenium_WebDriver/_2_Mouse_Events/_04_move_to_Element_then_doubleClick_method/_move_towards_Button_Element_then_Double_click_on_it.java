package _008_Actions_Class_by_Selenium_WebDriver._2_Mouse_Events._04_move_to_Element_then_doubleClick_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _move_towards_Button_Element_then_Double_click_on_it
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://qa-practice.netlify.app/double-click");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement Sign_in_element = driver.findElement(By.xpath("//button[@type='submit']"));	
		
		action.moveToElement(Sign_in_element).doubleClick().perform();

	}

}
