package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class sendkeys {

	       public static void main(String[] args) {
                 // TODO Auto-generated method stub

	    	   	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	    	   	ChromeDriver d=new ChromeDriver();

	    	   	d.get("https://demo.guru99.com/test/newtours/login.php");

	    	   	d.manage().window().maximize();

	    	   	d.findElement(By.linkText("REGISTER")).click();

	    	   	d.findElement(By.name("firstName")).sendKeys("abcde");

	    	   	d.findElement(By.name("country")).sendKeys("INDIA");

	       }
	       
}