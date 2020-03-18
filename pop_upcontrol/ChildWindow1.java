package pop_upcontrol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow1 {
	 static {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
     }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String WH1 = driver.getWindowHandle();
		System.out.println(WH1);
		Thread.sleep(3000);
		driver.get("https://www.naukri.com/");
		 String WH2 = driver.getWindowHandle();
		 System.out.println(WH2);
		 driver.quit();
	}
}
