package _010_Automating_GUI_WebElements_of_WebPage._6_Handling_Web_Tables_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_print_Specific_columns_Data_from_a_WebTable 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/time-table");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement trains_table = driver.findElement(By.className("timetable_table__4hbNj"));
		
		List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
		
		/* Specific Columns Data*/
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String train_number = cols.get(0).getText();
			String train_name = cols.get(1).getText();
			System.out.println(train_number+"  "+train_name);
		}
		
		System.out.println("-----------------|||||||||||||--------------------------");
		/* Entire Table Data */
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
				String data = element.getText();
				System.out.print("\t" + data + "\t" );
			}
			
			System.out.println();
		}
		
		driver.quit();
	}

}
