package pop_upcontrol;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
         static{
        	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
         }
         public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.services.irctc.co.in/homebody.html");
			driver.findElement(By.id("button")).click();
			Alert a = driver.switchTo().alert();
			String Text = a.getText();
			System.out.println(Text);
			a.accept();
			driver.close();
		}
}
