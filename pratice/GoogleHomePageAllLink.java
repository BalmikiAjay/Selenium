package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageAllLink {

	static{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		//use for loop for printing all the links available in google home page
		for(int i=1;i<=Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
			driver.quit();
		}
		
	}
}
