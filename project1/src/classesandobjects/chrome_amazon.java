package classesandobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_amazon {
	WebDriver d;
	public void open_chrome() {
		
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	   	d=new ChromeDriver();
	   	d.get("https://www.amazon.com/");
	   	d.manage().window().maximize();
	}
	public void getTitle() {
		System.out.println(d.getTitle());
	}
	public void get_Current_Url() {
		System.out.println(d.getCurrentUrl());
		
	}
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i).getText());
		}
	}
	
	public void screenshot() throws Throwable {
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Public\\Downloads.png"));
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		chrome_amazon ca=new chrome_amazon();
		ca.open_chrome();
		ca.getTitle();
		ca.get_Current_Url();
		ca.drop();
		ca.screenshot();
		ca.close();

	}

}
