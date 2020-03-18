package pop_upcontrol;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlesofBrowser {
	 static {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		for(String WH:allWh)
		{
			driver.switchTo().window(WH);
			String title = driver.getTitle();
			System.out.println(title);
					}
		driver.quit();
	}
}
