package pop_upcontrol;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriUpload {
   	static {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
    }
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String Firstwindowid=itr.next();
		String secondwindowid =itr.next();
		String thirdwindowid =itr.next();
		
		driver.switchTo().window(secondwindowid).close();
		driver.switchTo().window(thirdwindowid).close();
	    driver.switchTo().window(Firstwindowid);
	    
	    driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
	    driver.findElement(By.name("email")).sendKeys("balmiki.ajay9211@gmail.com");
	    driver.findElement(By.name("PASSWORD")).sendKeys("9009211ajay");
	    driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	    
	     WebElement Mynaukri = driver.findElement(By.xpath("//div[.='My Naukri']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(Mynaukri).perform();
	    driver.findElement(By.linkText("Edit Profile")).click();
	    driver.findElement(By.xpath("//input[@id=\"attachCV\"]")).sendKeys("C:\\Users\\abc\\Downloads\\BALMIKI RESUME.doc");
	    
	    Thread.sleep(3000);
	    driver.quit();
	    
	}
}
