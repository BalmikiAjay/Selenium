package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	static {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
    }
      public static void main(String[] args) throws InterruptedException { 
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.flipkart.com/");
    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9006750338");
    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("420cuteboss9211");
    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.name("q")).sendKeys("Samsung");
         Thread.sleep(5000);
        
    }
}