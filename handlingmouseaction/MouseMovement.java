package handlingmouseaction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
    static {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
    }
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement we = driver.findElement(By.id("navbarDocumentation"));
		
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		
		
	}
}
