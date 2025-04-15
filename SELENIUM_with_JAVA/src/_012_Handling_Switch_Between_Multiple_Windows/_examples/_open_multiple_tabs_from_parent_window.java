package _012_Handling_Switch_Between_Multiple_Windows._examples;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class _open_multiple_tabs_from_parent_window
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://gmail.com");
		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebDriverWait wait_for_element = new WebDriverWait(driver, 10);

		new WebDriverWait(driver, 20).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		String parent_window_id = driver.getWindowHandle();
		System.out.println("Main window id : " + parent_window_id);
		System.out.println("Main Page Name : " + driver.getTitle());

		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + all_links.size());

		driver.switchTo().window(parent_window_id);

		for (WebElement each_link : all_links)
		{
			wait_for_element.until(ExpectedConditions.elementToBeClickable(each_link));

			
			Set<String> windows_before_click = driver.getWindowHandles();

			each_link.click();

			

			new WebDriverWait(driver, 10)
					.until(driver_ -> driver.getWindowHandles().size() > windows_before_click.size());

			
			Set<String> windows_after_click = driver.getWindowHandles();
			windows_after_click.removeAll(windows_before_click);

			String new_tab = windows_after_click.iterator().next();

			driver.switchTo().window(new_tab);
			System.out.println("New Tab Title: " + driver.getTitle());

			driver.switchTo().window(parent_window_id);
		}

		System.out.println("At last, Current Page Name : " + driver.getTitle());

		Set<String> all_tabs = driver.getWindowHandles();
		System.out.println("all window tabs id's : " + all_tabs);

		driver.quit();
	}

}
