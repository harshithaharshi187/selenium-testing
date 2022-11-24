package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	public void details() {
		ChromeDriver d;

	   	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   	d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	   	d.manage().window().maximize();
		d.findElement(By.id("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("uname");
		WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		
		a.sendKeys("example");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions f=new functions();
		f.details();




}
}
