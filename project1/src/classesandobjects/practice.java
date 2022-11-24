package classesandobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("abcdefg");
		d.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("hjgdjwabsdxugdsujg");
		d.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("uirfhieurfhezjlful");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='submit']")).click();
	}

}
