package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckXaxis {
	
	static{
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
     }
     public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");


	    int Xais2 = driver.findElement(By.name("reg_email__")).getLocation().getX();
	    int Xais3= driver.findElement(By.name("reg_passwd__")).getLocation().getX();
	   
		if(Xais2==Xais3)
	    {
	    	System.out.println("arrange properly");
	    }
	    else
	    {
	    	System.out.println("not properly arrange");
	    }
	     
	     driver.close();
	}
}