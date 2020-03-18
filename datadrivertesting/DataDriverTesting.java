package datadrivertesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DataDriverTesting {
	static {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	    }
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\abc\\Desktop\\datadrivertesting1.property");
		Properties ps = new Properties();
		ps.load(fis);
		String url = ps.getProperty("url");
		String username = ps.getProperty("username");
		String password = ps.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		Thread.sleep(2000);
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.quit();
	}
}
