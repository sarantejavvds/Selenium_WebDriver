package _006_Locators_Available_in_Selenium.Using_tagname_of_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_all_Hyperlinks_in_a_Page_with_help_of_tagname 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://asobimo.com/en/");
		
		List<WebElement> links_of_page = driver.findElements(By.tagName("a"));
		
		int count_of_links = links_of_page.size();
		
		System.out.println("Count of Links in Webpage: " + count_of_links);
		
		System.out.println("Names of all Links: ...");
		
		for(WebElement link : links_of_page)
		{
			System.out.println(link.getText());
		}

		driver.quit();
	}

}
