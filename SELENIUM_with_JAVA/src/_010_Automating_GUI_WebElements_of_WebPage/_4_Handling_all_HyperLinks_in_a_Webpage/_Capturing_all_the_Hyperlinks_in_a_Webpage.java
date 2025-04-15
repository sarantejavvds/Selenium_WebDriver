package _010_Automating_GUI_WebElements_of_WebPage._4_Handling_all_HyperLinks_in_a_Webpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Capturing_all_the_Hyperlinks_in_a_Webpage
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.get("https://tatacliq.com");
		
		//get collection of links which are stored into tag a
		List<WebElement> all_Links =driver.findElements(By.tagName("a"));
		System.out.println("Number of Hyperlinks in the webpage : " +all_Links.size());
		
		//iterate all links
		System.out.println();
		System.out.println("Print all Link Names wit their URLs : ");
		for (WebElement each_link : all_Links)
		{
			//print each position link name
			System.out.println(each_link.getText());
			//print each link url
			System.out.println(each_link.getAttribute("href"));
			System.out.println();
		}
		
	driver.quit();

	}

}
