package handlingmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionFacebook {
	static {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	    }
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("balmiki.kumar9211");
		driver.findElement(By.id("pass")).sendKeys("***********");
		WebElement WE = driver.findElement(By.id("loginbutton"));
		Actions a = new Actions(driver);
		a.doubleClick(WE).perform();
		}
}
