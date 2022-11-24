package project4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class i6 {
	WebDriver d;
	
	@Given("user open amazon website")
	
	public void user_open_amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/register.php");
	    d.manage().window().maximize();
	    d.getTitle();
	    d.getCurrentUrl();
	    
	}

	@When("user need to click register link")
	public void user_need_to_click_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.id(""));
	}

	@Then("user need to get country names from dropdown")
	public void user_need_to_get_country_names_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream f=new FileInputStream("");
		XSSFWorkbook wb=new XSSFworkbook(f);
		Row r=null;
		Cell c=null;
	    WebElement a=d.findElement(By.name(""));
	    List<WebElement>c1=a.findElements(By.tagName("option"));
	    System.out.println(c1.size());
	    for(int i=0;i<c1.size();i++) {
	    	System.out.println(c1.get(i).getText());
	    	r=wb.createRow(i);
	    	r.createCell(0).setCellValue(i+1);
	    	r.createCell(0).setCellValue(c1.get(i).getText());
	    	c1.get(i).click();
	    	if(!c1.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("fail");
	    	}
	    	else {
	    		r.createCell(1).setCellValue("pass");
	    	}
	    }
	    FileOutputStream f1=new FileOutputStream("");
	    wb.write(f1);
	    f1.close();
	    
	}

	@And("user navigates back to homepage")
	public void user_navigates_back_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("user closes the page")
	public void user_closes_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}


}
