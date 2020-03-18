package pop_upcontrol;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultiWindowHandle {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> parent = driver.getWindowHandles();
		System.out.println("Parent window id is "+parent);
		int count = parent.size();
		System.out.println("Total window is "+count);
		for(String Child:parent)
		{
			if(!parent.equals(Child))
			{
				driver.switchTo().window(Child);
				System.out.println("Child window title is "+driver.getTitle());
				driver.close();
			}
		}
		
	}

}
