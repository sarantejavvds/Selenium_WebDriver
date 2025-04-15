package _010_Automating_GUI_WebElements_of_WebPage._5_Handling_all_DropDownListBoxes_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _get_all_Items_in_a_DropDownList_Box
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select countries_dropdownlist = new Select(driver.findElement(By.xpath("(//select)[1]")));
		
		List<WebElement> countries_list = countries_dropdownlist.getOptions();
		
		System.out.println("Number of Countries : " + countries_list.size());
		
		for(WebElement each_country : countries_list) 
		{
			System.out.println(each_country.getText());
		}
		
		driver.quit();
	}

}
