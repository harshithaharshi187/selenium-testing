package package1;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.server.Response.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dropdownelements {
			public static void main(String[] args) throws IOException {

				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
				ChromeDriver d=new ChromeDriver();

				d.get("https://www.amazon.in/?&amp;ext_vrnc=hi&amp;tag=googinhydr1-21&amp;ref=pd_sl_5u6aec078l_b&amp;adgrpid=61818596627&amp;hvpone=&amp;hvptwo=&amp;hvadid=617656843083&amp;hvpos=&amp;hvnetw=g&amp;hvrand=5604606814826176791&amp;hvqmt=b&amp;hvdev=c&amp;hvdvcmdl=&amp;hvlocint=&amp;hvlocphy=1007743&amp;hvtargid=kwd-317094055422&amp;hydadcr=15412_2322995&amp;gclid=EAIaIQobChMIu_XNr4uU-wIVv51LBR2v1Q6lEAAYASAAEgLqhPD_BwE");
				d.manage().window().maximize();
				System.out.println(d.getTitle());
				System.out.println(d.getCurrentUrl());
				WebElement drop=d.findElement(By.id("searchDropdownBox"));

				List<WebElement>drop1=drop.findElements(By.tagName("option"));
				System.out.println(drop1.size());
				for(int i=0;i<drop1.size();i++)
				{	
					System.out.println(drop1.get(i).getText());

				}
				File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);

				FileUtils.copyFile(a,new File("C:\\Users\\Public\\Downloads.png"));

			}
}