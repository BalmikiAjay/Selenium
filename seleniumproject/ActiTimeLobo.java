package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLobo {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean isdisplayed = driver.findElement(By.xpath("//*[@id=\\\\\\\"logoContainer\\\\\\\"]/div[1]/div")).isDisplayed();
		//checking condition is true or false
		if(isdisplayed)
		{
			System.out.println("lobo is displayed");
		}
		else
		{
			System.out.println("lobo is not Displayed");
		}
		driver.close();
		}
}