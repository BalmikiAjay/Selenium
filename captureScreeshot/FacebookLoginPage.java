package captureScreeshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
    
		static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balmiki");
		
		//write the code for take screenshot
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File scrfile = ts.getScreenshotAs(OutputType.FILE);
		File Destfile = new File("./Screenshots/fbLogin.png");
		FileUtils.copyFile(scrfile,Destfile);
		 driver.close();
	}
	
	
}
