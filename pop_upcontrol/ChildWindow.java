package pop_upcontrol;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
     static {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
     public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//get the window handle of all the browser
		Set<String> allWH = driver.getWindowHandles();
		//count the no of browser opened by naukri.com
		int count = allWH.size();
		System.out.println(count);
		driver.quit();
		}
}
