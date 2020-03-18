package captureScreeshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPage {
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//write the code for take screenshot
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File sorcefile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sorcefile,new File("./Screenshots/Actitime.png"));
		//closeing the all tab
		driver.close();
	}
}
