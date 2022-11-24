package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By phone=By.name("phone");
	By Email=By.name("userName");
	By cont=By.name("country");
	
	POM2(WebDriver d)
	{
		this.d=d;
	}
	public void Fname()
	{
		d.findElement(Fname).sendKeys("testing123");
	}
	public void Lname()
	{
		d.findElement(Lname).sendKeys("testing");
	}
	public void Pnumber()
	{
		d.findElement(phone).sendKeys("9876545645");
	}
	public void Email()
	{
		d.findElement(Email).sendKeys("testing9001");
	}
	public void country()
	{
		d.findElement(cont).sendKeys("India");
	}
	
	
	

}
