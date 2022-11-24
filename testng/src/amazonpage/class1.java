package amazonpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	WebDriver d;
  @BeforeTest
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize() ;
	 }
  @Test(priority=1)
  public void title() {
	  System.out.println("d.getTitle()");
  }
}
