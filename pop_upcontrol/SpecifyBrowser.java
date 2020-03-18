package pop_upcontrol;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecifyBrowser {
	 static {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
	 public static void main(String[] args, Object etitle) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		for(String WH:allWh) {
			driver.switchTo().window(WH);
			String actualtitle = driver.getTitle();
			
			if(actualtitle.equals(etitle))
				driver.close();
		}
	}
}
