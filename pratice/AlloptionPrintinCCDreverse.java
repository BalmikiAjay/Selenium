package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlloptionPrintinCCDreverse {
     static{
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
     public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/hotel.html");
		WebElement AllSelected = driver.findElement(By.id("ccd"));
		Select s = new Select(AllSelected);
		List<WebElement> allOptions = s.getOptions();
		
		for(int i=allOptions.size()-1;i>=0;i--)
		{
		   String AllText = allOptions.get(i).getText();
			System.out.println(AllText);
		}
		driver.close();
	}
}
