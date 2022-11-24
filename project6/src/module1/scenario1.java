package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {
	WebDriver d;
	public void OPenUrl() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/");
		d.manage().window().maximize();
	}
	public void signup() {
		d.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();
		
	}
	public void register() {
		d.findElement(By.id("FirstName")).sendKeys("abcde");
		d.findElement(By.id("Surname")).sendKeys("hgdg");
		d.findElement(By.id("E_post")).sendKeys("12345");
		d.findElement(By.id("Mobile")).sendKeys("7894561235");
		d.findElement(By.id("Username")).sendKeys("kjdhrciuk");
		d.findElement(By.id("Password")).sendKeys("12345678");
		d.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
		d.findElement(By.id("submit")).click();
		
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) {
		scenario1 s1=new scenario1();
		s1.OPenUrl();
		s1.signup();
		s1.register();
		s1.close();
	}

}
