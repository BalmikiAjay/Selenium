package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
        public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();  
			 driver.get("https://www.facebook.com/");
			 //this line for the enter the email id 
			 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("enter the email id");
			 //this code for the enter the password...
			 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("enter the password");
			 //this code for click button of login...
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 driver.quit();
			}
}
