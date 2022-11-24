package amazonpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		d.get(baseurl);
		d.manage().window().maximize();
		POM1 a1=new POM1(d);
		a1.uname();
		a1.pass();
		a1.signon();
	}

}
