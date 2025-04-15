package _010_Automating_GUI_WebElements_of_WebPage._1_Handling_all_TextBoxes_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Capture_all_Textboxes_in_a_Webpage
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> visible_Textboxes = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		
		System.out.println("Number of Visible textboxes in the Webpage : " + visible_Textboxes.size());
		
		System.out.println("Placeholder values of visible Textboxes: ");
		for(WebElement each_visible_textbox : visible_Textboxes) 
		{
			System.out.println(each_visible_textbox.getAttribute("placeholder"));
		}
		
		System.out.println();
		
	 	List<WebElement> All_TextBoxes = driver.findElements(By.xpath("//input[@type='text' or @type='password' or @type='hidden']"));
	 	
	 	System.out.println("Number of All textboxes in the Webpage : " + All_TextBoxes.size());
	 	
	 	for (WebElement each_and_every_TextBox : All_TextBoxes)
	 	{
			System.out.println(each_and_every_TextBox.getTagName());
		}
	 	
	 	driver.quit();
	}

}
