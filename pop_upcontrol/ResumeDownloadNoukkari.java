package pop_upcontrol;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResumeDownloadNoukkari {
	static {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Firefox driver\\geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String>  itr = windowid.iterator();
		String Firstwindowid=itr.next();
		String secondwindowid =itr.next();
		String thirdwindowid =itr.next();
		String fourthwindowid =itr.next();
		
		driver.switchTo().window(secondwindowid).close();
		driver.switchTo().window(thirdwindowid).close();
		driver.switchTo().window(fourthwindowid).close();
		
		driver.switchTo().window(Firstwindowid);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[7]/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys("balmiki.ajay9211@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys("9009211ajay");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		Thread.sleep(3000);
		
		
		
	    
	}
}
