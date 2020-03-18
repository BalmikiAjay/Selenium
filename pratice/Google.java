package pratice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
  static {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
  }
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String current = driver.getCurrentUrl();
		System.out.println(current);
}
}
