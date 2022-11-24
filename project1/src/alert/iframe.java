package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/frames");
		d.manage().window().maximize();
		
		d.switchTo().frame("frame1");
		d.findElement(By.id("u_5_6")).click();
		WebElement text=d.findElement(By.id("processing"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		
	}

}
