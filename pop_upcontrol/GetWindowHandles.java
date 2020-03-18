package pop_upcontrol;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
   static {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
   }
     public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 System.out.println(driver.getWindowHandle());
		 driver.get("https://www.naukri.com/");
		 Set<String> allWH = driver.getWindowHandles();
		 int count = allWH.size();
		 System.out.println(count);
		 driver.quit();
		}
     
}
