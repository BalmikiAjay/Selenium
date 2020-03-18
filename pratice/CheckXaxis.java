package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckXaxis {
     static {
    	 System.setProperty("webdriver.chrome.driver","G:\\Selenium\\SeleniumProject\\driver\\chromedriver.exe");
     }
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    int Yaxis1 = driver.findElement(By.id("email")).getLocation().getY();
	   int Yaxis2 = driver.findElement(By.id("pass")).getLocation().getY();
	   if(Yaxis1 == Yaxis2 )
	   {
		   System.out.println("Both text box are same axis = "+Yaxis1 );
	   }
	   else
	   {
		   System.out.println("Both text box are not same axis = "+Yaxis1 +Yaxis2);
	   }
	   driver.close();
	}
}
