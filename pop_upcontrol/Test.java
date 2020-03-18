package pop_upcontrol;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {


	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String>windowid=driver.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String Firstwindowid=itr.next();
		String secondwindowid =itr.next();
		String thirdwindowid =itr.next();
		String fourthwindowid =itr.next();
		
		driver.switchTo().window(secondwindowid).close();
		driver.switchTo().window(thirdwindowid).close();
		driver.switchTo().window(fourthwindowid).close();
		
	   
		driver.switchTo().window(Firstwindowid);
		
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys("krlefin@gmail.com");//give your username
		driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys("mylefin141"); //give your password
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
		
     
		
		WebElement Mynk = driver.findElement(By.xpath("//div[.='My Naukri']"));
		Actions action = new Actions(driver);
		action.moveToElement(Mynk).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Edit Profile\"]")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//i[@title=\"Click here to download your resume\"]")).click();
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
	
	
	
	
	
	

