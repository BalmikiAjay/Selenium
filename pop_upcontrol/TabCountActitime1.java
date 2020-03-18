package pop_upcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCountActitime1 {
	 static {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.getWindowHandle();
			driver.findElement(By.xpath("//a[.=\"actiTIME Inc.\"]")).click();
	}
}








