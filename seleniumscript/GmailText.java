package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailText {
     public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		 WebElement Gmail= driver.findElement(By.linkText("Gmail"));
		System.out.println(Gmail.getText());
		System.out.println(Gmail.getAttribute("data-pid"));
	   driver.close();
	}
     
}
