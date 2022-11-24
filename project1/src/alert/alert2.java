package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	WebDriver d;

	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		

	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void url() {
		System.out.println(d.getCurrentUrl());
		
	}
	public void confirmation() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement text=d.findElement(By.id("confirmResult"));
		System.out.println(text.getText());
		
	}
	public void close() {
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alert2 a=new alert2();
		a.opening_browser();
		a.title();
		a.url();
		a.confirmation();
		a.close();
	}

}
