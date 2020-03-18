package seleniumproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	 static
     {
  	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
  }
    public static void main(String[] args) throws InterruptedException { 
      	 //open the driver
  	 WebDriver driver = new ChromeDriver();
  	 driver.get("https://demo.actitime.com/login.do");
  	 driver.manage().window().maximize();
  	 driver.findElement(By.name("username")).sendKeys("admin");
  	 driver.findElement(By.name("pwd")).sendKeys("manager");
  	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
  	 Thread.sleep(3000);
  	 System.out.println(driver.getTitle());
  	 driver.findElement(By.id("logoutLink")).click();
  	 driver.close();
  }
    }

