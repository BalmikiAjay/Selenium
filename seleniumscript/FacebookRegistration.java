package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {
      static
      {
    	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
      }
      public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("firstname")).sendKeys("Ajay");
		  driver.findElement(By.name("lastname")).sendKeys("Kumar");
		  driver.findElement(By.name("reg_email__")).sendKeys("Ajay.kumar123@gmail.com");
		  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Ajay.kumar123@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		  driver.findElement(By.id("day")).sendKeys("11");
		  driver.findElement(By.id("month")).sendKeys("04");
		  driver.findElement(By.id("year")).sendKeys("2001");
		  driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[2]")).submit();
	}
}
