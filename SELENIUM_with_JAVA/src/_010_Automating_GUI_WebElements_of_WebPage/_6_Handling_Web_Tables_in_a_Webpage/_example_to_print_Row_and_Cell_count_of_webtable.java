package _010_Automating_GUI_WebElements_of_WebPage._6_Handling_Web_Tables_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_print_Row_and_Cell_count_of_webtable 
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
		
		System.out.println("No of rows : "+ (rows.size()-1));
		
		
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
		System.out.println("No of columns : "+ columns.size());
		
		

		driver.quit();
   }
}
