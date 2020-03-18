package seleniumproject;

import org.openqa.selenium.WebDriver;

public class GetTitle {
      static void test(WebDriver driver) {
    	  //enter the url
    	  driver.get("http://www.qspiders.com//");  
    	  //get the title and print it in the console
    	  String Title=driver.getTitle();
    	  System.out.println(Title);
    	  //close the browser
    	  driver.quit();
      }
	}