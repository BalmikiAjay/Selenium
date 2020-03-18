package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(3000);
	//initialize the variable to store the expected title of the webpage
	String expectedTitle = "java";
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div/span")).click();
	//fetch the title of the web page and save it into a string variable
	String ActualTitle = driver.getTitle();
	 if (expectedTitle.equals(ActualTitle))
	 {
		 System.out.println("The correct title is display on webpage is successful");
	 }
	 else
	 {
		 System.out.println("The correct title is display on webpage is successful");
	 }
	 driver.close();
}
}
