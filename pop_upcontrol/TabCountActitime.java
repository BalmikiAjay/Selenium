package pop_upcontrol;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCountActitime {
         	 static {
        	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
         }
         	 public static void main(String[] args) {
         		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
				Set<String> allwh = driver.getWindowHandles();
				int count = allwh.size();
				System.out.println(count);
	     		driver.close();
			}
         
         	 
     }

