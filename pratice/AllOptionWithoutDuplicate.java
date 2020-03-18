package pratice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionWithoutDuplicate {
        public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/abc/Desktop/hotel.html");
			WebElement MTRListbox=driver.findElement(By.id("mtr"));
			Select s= new Select(MTRListbox);
			List<WebElement> alloptions = s.getOptions();
			TreeSet<String> allText=new TreeSet<String>(); 
			for(WebElement option:alloptions) {
				
				String text=option.getText();
				if(allText.add(text)==true)
					System.out.println(text);
				}
			driver.close();
		}
}
