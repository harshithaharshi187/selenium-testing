package project4;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario2 {
	WebDriver d;
	@Given("user opens amazon page")
	public void user_opens_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    
	}

	@When("page is opened")
	public void page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	}

	@Then("capture all the links")
	public void capture_all_the_links() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement w=d.findElement(By.id("nav-main"));
	    List<WebElement>lw=d.findElements(By.tagName("a"));
	    System.out.println(lw.size());
	    
	}

	@Then("get url get title")
	public void get_url_get_title() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());
	}

	@And("store in the excel sheet and close the browser")
	public void store_in_the_excel_sheet_and_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    FileInputStream f=new FileInputStream("");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("sheet1");
	    for(int i=0;i<lw.size();i++) {
	    	System.out.println(lw.get(i).getText());
	    	lw.get(i).click();
	    	String title=d.getTitle();
	    	String url=d.getCurrentUrl();
	    	Thread.sleep(2000);
	    	d.navigate().back();
	    	w=d.findElement(By.id("nav-main"));
	 	    lw=d.findElements(By.tagName("a"));
	 	    
	    }
	    Rows r=nul1;
	    Cell c=null;
	    //r=ws.createRow(i);
	    
	}


}
