package _010_Automating_GUI_WebElements_of_WebPage._5_Handling_all_DropDownListBoxes_in_a_Webpage._2_Multiple_Items_Selection_Listbox._3_verify_if_we_can_Deselect_items_in_DropdownListbox._1_deselectByVisibleText;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _example_to_use_deselectByVisibleText_method
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
		
			
		        List<WebElement> all_options = multiple_selection_dropdownlist.getOptions();
		        System.out.println("Number of Items present in DropdownList : " + all_options.size());
			
		        for(int i=0 ; i< all_options.size() ;i++)
				{
					multiple_selection_dropdownlist.selectByIndex(i);
				}

		        
		        multiple_selection_dropdownlist.deselectByVisibleText("White");
		        multiple_selection_dropdownlist.deselectByVisibleText("navy blue");
				
				List<WebElement> selected_Items = multiple_selection_dropdownlist.getAllSelectedOptions();

				System.out.println("Number of Items selected after Deselection :  " + selected_Items.size());
				//print each item name which are selected
				for (WebElement each : selected_Items) 
				{
					System.out.println(each.getText());
				}
	}

}
