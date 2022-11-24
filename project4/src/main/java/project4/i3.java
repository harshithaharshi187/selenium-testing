package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class i3 {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	}

	@When("user selects some dropdown")
	public void user_selects_some_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	}

	@Then("user clicks on button")
	public void user_clicks_on_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    d.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user navigated to homepage");
	    d.close();
	}

}
