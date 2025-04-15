package _010_Automating_GUI_WebElements_of_WebPage._6_Handling_Web_Tables_in_a_Webpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_print_Tabular_Data_in_a_WebPage 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/tools/forex");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement webtable = driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows= webtable.findElements(By.tagName("tr"));
		
		System.out.println("No of rows : "+(rows.size()-1));
		
		
		
		for (WebElement each : rows)
		{
			
			List<WebElement> cols = each.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) 
			{
				
				System.out.print("\t"+ "||" +eachcell.getText()+ "\t"+ "||");
			}
			System.out.println();
		
	    }

		driver.quit();
   }
}
