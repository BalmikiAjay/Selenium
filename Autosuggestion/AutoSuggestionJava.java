package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionJava {
   static
       {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
    }
      public static void main(String[] args) throws InterruptedException { 
        	 //open the driver
    	 WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	driver.findElement(By.name("q")).sendKeys("java");
    	Thread.sleep(3000);
    	List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
    	 int count=allSuggestion.size();
    	 System.out.println(count);
    	 for(int i=0;i<count;i++)
    	 {
    		 String text = allSuggestion.get(i).getText();
    		 System.out.println(text);
    	 }
    	 allSuggestion.get(0).click();
    	 String ExpectedTitle="javatpoint"; 
    	 String ActualTitle = driver.getTitle();
    	 if(ExpectedTitle.equals(ActualTitle))
    	 {
    		 System.out.println("Title are matching");
    	 }
    	 else
    	 {
    		 System.out.println("Title are not matching");
    	 }
    	 driver.close();
    	}
      
}

