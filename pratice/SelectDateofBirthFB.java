package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateofBirthFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement daylistbox = driver.findElement(By.id("day"));
		Select s=new Select(daylistbox);
		s.selectByIndex(5);
		
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select s1=new Select(monthlistbox);
		s1.selectByValue("10");
		
		WebElement yearlistbox = driver.findElement(By.id("year"));
		Select s2=new Select(yearlistbox);
		s2.selectByVisibleText("1996");
		
		Thread.sleep(3000);
		driver.close();
	}
}