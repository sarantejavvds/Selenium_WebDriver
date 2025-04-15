package _010_Automating_GUI_WebElements_of_WebPage._5_Handling_all_DropDownListBoxes_in_a_Webpage._2_Multiple_Items_Selection_Listbox._1_verify_if_DropdownListbox_is_Multiselect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _example_to_use_isMultiple_Method 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("file:///E:/JAVA_Projects/Selenium_with_JAVA_Test_Automation/SELENIUM_with_JAVA/src/_010_Automating_GUI_WebElements_of_WebPage/_5_Handling_all_DropDownListBoxes_in_a_Webpage/MultiListboxHtmlpage_.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select multiple_selection_dropdownlist = new Select(driver.findElement(By.xpath("(//select)[1]")));
		
		System.out.println("Is the DropdownListbox can select Mutiple Items? : " + multiple_selection_dropdownlist.isMultiple());
		
			//select 0 to 8 items in listbox
				for(int i=0;i<=8;i++)
				{
					multiple_selection_dropdownlist.selectByIndex(i);
				}
				
				
	}

}
