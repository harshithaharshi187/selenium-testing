package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath {
			public static void main(String[] args) {
				// TODO Auto-generated method stub

					System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
					
					ChromeDriver d=new ChromeDriver();

					d.get("https://demo.guru99.com/test/newtours/login.php");

						d.manage().window().maximize();

					//d.findElement(By.name(&quot;userName&quot;)).sendKeys(&quot;mercury&quot;);

					d.findElement(By.xpath("//input[@name=&#39;userName&#39;]")).sendKeys("mercury");
					//input[@name=&#39;userName&#39;]
			}

}
