
package pop_upcontrol;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDownloadPopup {
	static {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Firefox driver\\geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.partialLinkText("3.141")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_LEFT);
		rb.keyRelease(KeyEvent.VK_LEFT);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
	}
}
