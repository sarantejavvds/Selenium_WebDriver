package _010_Automating_GUI_WebElements_of_WebPage._3_Handling_all_RadioButtons_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Capture_all_RadioButtons_in_a_Webpage
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js_executor = (JavascriptExecutor)driver;

		List<WebElement> all_RadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Number of RadioButtons present in the Webpage : " + all_RadioButtons.size());
		
		for (WebElement each_RadioButton : all_RadioButtons) 
		{
			//WebElement text_Name = each_checkBox.findElement(By.xpath("following-sibling::text()[1]"));
			String text_Name = (String) js_executor.executeScript("return arguments[0].nextSibling.nodeValue.trim();", each_RadioButton);
			
			System.out.println("Checkbox: " + text_Name.trim() + " | Selected: " + each_RadioButton.isSelected());
		}
		
		driver.quit();

	}

}
