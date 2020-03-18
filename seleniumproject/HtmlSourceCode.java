package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode {
    static {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
    }
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver(); 
		//Maximize the browser
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	//get the html source code of google web page
    	String HtmlSourceCode=driver.getPageSource();
    	System.out.println(HtmlSourceCode);
    	//close the browser using method quit
    	driver.quit();
	}
}
