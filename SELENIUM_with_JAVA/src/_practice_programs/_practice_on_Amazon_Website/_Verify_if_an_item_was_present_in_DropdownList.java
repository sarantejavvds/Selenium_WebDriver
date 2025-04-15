package _practice_programs._practice_on_Amazon_Website;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _Verify_if_an_item_was_present_in_DropdownList
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String Expected_Item = "Furniture";
		boolean is_Item_Present = false;
		
		Select All_Items_dropdownlist = new Select(driver.findElement(By.id("searchDropdownBox")));

		System.out.println("Is the DropdownListbox can select Mutiple Items? : " + All_Items_dropdownlist.isMultiple());
		
		//get collection of items in listbox
		List<WebElement> every_item_list = All_Items_dropdownlist.getOptions();
		System.out.println("Number of items in Listbox : " + every_item_list.size());
		
		for(WebElement each_item : every_item_list) 
		{
			//get each item text
			String Actual_Items = each_item.getText();
			
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				 is_Item_Present = true;
				break;
			}
		}
		
		if(is_Item_Present)
		{
			System.out.println(Expected_Item+"   "+"Item Found in Listbox");
		}
		else
		{
			System.out.println(Expected_Item+"   "+"Item Not Found in Listbox");
		}
		
		driver.quit();
	}

}
