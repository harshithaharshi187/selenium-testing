package internalfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\nehad\\eclipse-workspace\\project2\\src\\internalfiles\\p1.properties");
		Properties p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//fetching url from propertylist using getproperty
		d.get(p1.getProperty("url"));
		d.manage().window().maximize();
		
		d.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		System.out.println(p1.getProperty("password"));
		
		d.findElement(By.name("submit")).click();
		d.close();
		
	}

}
