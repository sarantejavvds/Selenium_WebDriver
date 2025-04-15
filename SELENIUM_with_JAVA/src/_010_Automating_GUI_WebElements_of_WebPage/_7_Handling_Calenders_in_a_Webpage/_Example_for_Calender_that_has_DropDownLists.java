package _010_Automating_GUI_WebElements_of_WebPage._7_Handling_Calenders_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _Example_for_Calender_that_has_DropDownLists 
{

	public static void main(String[] args) 
	{
		String Date_of_Birth_Input = "7-May-2000";
		
		String Date_of_Birth_Array[] = Date_of_Birth_Input.split("-");
		
		String date_value, month_value, year_value;
		
		date_value = Date_of_Birth_Array[0];
		month_value = Date_of_Birth_Array[1];
		year_value = Date_of_Birth_Array[2];
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://flights.qedgetech.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).click();

		Select month_ListBox = new Select(driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])[1]")));
		
		month_ListBox.selectByVisibleText(month_value);
		
		Select year_ListBox = new Select(driver.findElement(By.xpath("(//select[@class='ui-datepicker-year'])[1]")));
		
		year_ListBox.selectByVisibleText(year_value);
		
		WebElement Web_Table_of_Days = driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]"));
		
		
		List<WebElement> days_rows = Web_Table_of_Days.findElements(By.tagName("tr"));
		
		for(WebElement each_day_row : days_rows)
		{
			List<WebElement> columns_data = each_day_row.findElements(By.tagName("td"));
			
			for (WebElement each_cell : columns_data) 
			{
				if(each_cell.getText().equals(date_value))
				{
					each_cell.click();
				}	
			}	
		}
		
		
	}

}