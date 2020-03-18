package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthofUsername {
       static {
    	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
       }
       public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int Width1 = driver.findElement(By.id("email")).getSize().getWidth();
		int Width2 = driver.findElement(By.id("pass")).getSize().getWidth();
		if(Width1==Width2)
		{
			System.out.println("Width of the both element are equal and width is "+Width1);
		}
		else
		{
			System.out.println("Width of the both element are not equal");
		}
		driver.close();
	}
}
