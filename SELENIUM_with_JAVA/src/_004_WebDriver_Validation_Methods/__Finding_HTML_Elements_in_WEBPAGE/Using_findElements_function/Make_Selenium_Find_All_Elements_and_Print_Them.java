package _004_WebDriver_Validation_Methods.__Finding_HTML_Elements_in_WEBPAGE.Using_findElements_function;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_Selenium_Find_All_Elements_and_Print_Them 
{

	public Make_Selenium_Find_All_Elements_and_Print_Them() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		//driver.get("https://readberserk.com/");
		driver.get("https://google.com/");
		
		List<WebElement> all_hyperlinks = driver.findElements(By.tagName("a"));

		int count_of_links = all_hyperlinks.size();
		System.out.println("Total Links present in Webpage are " + count_of_links);
		
		System.out.println("Links: ");
		
		for(WebElement link : all_hyperlinks)
		{
			System.out.println(link.getText());
		}
	
		driver.quit();
	}

}
