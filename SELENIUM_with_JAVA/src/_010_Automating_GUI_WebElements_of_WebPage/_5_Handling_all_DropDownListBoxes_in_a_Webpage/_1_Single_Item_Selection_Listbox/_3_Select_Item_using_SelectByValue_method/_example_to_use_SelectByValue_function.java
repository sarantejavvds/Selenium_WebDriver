package _010_Automating_GUI_WebElements_of_WebPage._5_Handling_all_DropDownListBoxes_in_a_Webpage._1_Single_Item_Selection_Listbox._3_Select_Item_using_SelectByValue_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _example_to_use_SelectByValue_function
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		
		//select item in day,month and year listbox
		
		daylistbox.selectByValue("7");
		System.out.println(daylistbox.getFirstSelectedOption().getText());
	
		monthlistbox.selectByValue("5");
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		
		yearlistbox.selectByValue("2000");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
	}

}
