package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {
      public static void main(String[] args) throws InterruptedException {
       			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    			driver.manage().window().maximize();
    			driver.get("file:///C:/Users/abc/Desktop/hotel.html");
    			WebElement NtrListBox = driver.findElement(By.id("ntr"));
       			Select s= new Select(NtrListBox);
    			s.selectByIndex(0);
    			s.selectByValue("v");
    			s.selectByVisibleText("dosa");
    			Thread.sleep(3000);
    			driver.close();
	}
}
