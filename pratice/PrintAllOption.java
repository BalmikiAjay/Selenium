package pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//this should be your path to Html code that you saved.
		driver.get("file:///C:/Users/abc/Desktop/hotel.html");
		WebElement htmllistBox = driver.findElement(By.id("ntr"));
		Select s=new Select(htmllistBox);
		List<WebElement> alloptions = s.getOptions();
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
		}
		driver.close();
	}
}
