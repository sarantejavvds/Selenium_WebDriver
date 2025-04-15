package _practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2d_data_inputs {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//store into two dimension for login data
		String login[][]= {
				{"Admin","Qedge123!@#"},
				{"Test","Qedge123!@#"},
				{"Admin","Qedge"},
				{"Admin","Qedge123!@#"},
				{"",""},
				{"Admin",""},
				{"","Qedge123!@#"},
				{"Admin1","Qedge123!@#"}};
		for(int i=0;i<login.length;i++)
		{
			driver.navigate().to("http://orangehrm.qedgetech.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(login[i][0]);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(login[i][1]);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(5000);
			String Expected ="dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected))
			{
				System.out.println("login success   "+Expected+"     "+Actual+"  "+"Test pass");
			}
			else
			{
				//capture error message
				String error_mess = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
				System.out.println(error_mess+"    "+Expected+"  "+Actual+"   "+"Teat Fail");
			}
		}

	}

}
