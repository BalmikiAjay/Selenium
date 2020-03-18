package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
  public WebDriver driver;
  static {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
  @Parameters("browser")
  @BeforeTest
  public void openBrowser(String browser) {
	 if(browser.equals("chrome")) {
		 driver=new ChromeDriver();
	 } 
	 else if(browser.equals("firefox")) {
		 driver=new FirefoxDriver();
	 }
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
  @AfterMethod
  public void login() {
	  FileLib f = new FileLib();
  }
  
}
