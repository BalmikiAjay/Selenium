package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOptioninCCd {
      static{
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
      }
      public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/hotel.html");
		WebElement CCDListbox = driver.findElement(By.id("ccd"));
		Select s = new Select(CCDListbox);
		List<WebElement> AllOptions = s.getOptions();
		
		for(int i=0;i<AllOptions.size();i++)
		{
			s.selectByIndex(i);
		}
		List<WebElement> AllaSelectedOptions = s.getAllSelectedOptions();
		
		for(int i=0;i<AllaSelectedOptions.size();i++)
		{
			System.out.println(AllaSelectedOptions.get(i).getText());
		}
		driver.close();
	}
}
