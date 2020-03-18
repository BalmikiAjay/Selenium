package pop_upcontrol;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopupInGoogle {

	static {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Firefox driver\\geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		
	
	}
}

