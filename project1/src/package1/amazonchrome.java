package package1;

import org.openqa.selenium.chrome.ChromeDriver;


public class amazonchrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		
		d.close();
	}

}
