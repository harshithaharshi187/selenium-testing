package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1 {
	WebDriver d;
	By username=By.name("username");
	By password=By.name("password");
	By signon=By.name("submit");
	
	POM1(WebDriver d)
	{
		this.d=d;
	}
	
	public void uname() {
		d.findElement(username).sendKeys("Admin");
	}
	public void pass() {
		d.findElement(password).sendKeys("admin123");
	}
	public void signon() {
		d.findElement(signon);
	}

}
