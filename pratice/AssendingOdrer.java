package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssendingOdrer {
  	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/hotel.html");
		WebElement NTRListbox = driver.findElement(By.id("ntr"));
		Select s = new Select(NTRListbox);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String> allText = new ArrayList<String>();
		
		for(WebElement option:allOptions)
		{
			String Text = option.getText();
			allText.add(Text);
		}
		Collections.sort(allText);
		for(String Text1: allText) {
			System.out.println(Text1);
		}
		driver.close();		
	}
}
