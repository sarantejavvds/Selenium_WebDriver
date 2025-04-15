package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Properties._Using_Relative_Xpaths._4_Using_following_sibling_Function;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_following_sibling_function
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.facebook.com/r.php?entry_point=login");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//get collection of footer links
			List<WebElement> footer_Links =driver.findElements(By.xpath("//div[@id='pageFooter']//following-sibling::div[2]/ul/li/a"));
			System.out.println("Number of footer links :"+footer_Links.size());
			
			//print each footer link text
			for (WebElement each : footer_Links) 
			{	
				System.out.println(each.getText());
			//print each link url
				System.out.println(each.getAttribute("href"));
			}
			
			driver.quit();
	}

}
