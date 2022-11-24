package module1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class linkscount {
	static WebElement d;
	public void links(){
		scenario1 a1=new scenario1();
	}
		WebElement link=d.findElement(By.id("navColor01"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		system.out.println(links.size());
			for(int i=0;i<links.size();i++) {
				System.out.println(links.get(i).getText());
				links.get(i).click();
				Thread.sleep(2000);
				d.navigate().back();
				link=d.findElement(By.id("navColor01"));
				links=link.findElements(By.tagName("ul"));
			
		}
		
	
	public static void main(String[] args) {
		scenario1 s1=new scenario1();
		d=s1.OPenUrl();
		links();
		s1.OPenUrl();
		s1.signup();
		s1.register();
		s1.close();
	}


}
