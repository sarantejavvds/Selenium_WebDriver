package _008_Actions_Class_by_Selenium_WebDriver._2_Mouse_Events._07_Drag_and_Drop_the_Element_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _example_to_use_dragAndDrop_function 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement Iframe_element = driver.findElement(By.xpath("(//iframe)[1]"));
		
		driver.switchTo().frame(Iframe_element);
		
		WebElement Source_draggable_element_in_Iframe = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Target_droppable_element_in_Iframe = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		
		action.dragAndDrop(Source_draggable_element_in_Iframe, Target_droppable_element_in_Iframe).perform();

		
	}

}
