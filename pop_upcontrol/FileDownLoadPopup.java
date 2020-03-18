package pop_upcontrol;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownLoadPopup {

	static {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Firefox driver\\geckodriver.exe");
	}
      
		public static void main(String[] args) throws AWTException, InterruptedException {
	    WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[4]/a[1]")).click();
		
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
}
