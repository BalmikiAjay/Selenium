package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static {
	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	}
	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();  
		    driver.get("file:///C:/Users/abc/Desktop/selenium.html");
		    driver.findElement(By.cssSelector("a[id='d1']")).click();
		    driver.navigate().back();
		    driver.findElement(By.cssSelector("a[name='n1']")).click();
		    driver.navigate().back();
		    driver.findElement(By.cssSelector("a[class='c1']")).click();
		    driver.navigate().back();
		    driver.findElement(By.cssSelector("a[href='http://www.qspiders.com//']")).click();
		    driver.navigate().back();
		    driver.quit();  
	}

}
