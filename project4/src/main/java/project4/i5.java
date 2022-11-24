package project4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class i5 {

	WebDriver d;
	
	@Given("user is in dezlearn.com")
	public void user_is_in_dezlearn_com() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user gets the url and title")
	public void user_gets_the_url_and_title() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());
	    
	}

	@Then("user works on alert message")
	public void user_works_on_alert_message() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.id("s_alert1")).click();
		Alert alt =d.switchTo().alert(); 
		System.out.println(alt.getText());
		alt.accept();
	    
	}

	@Then("user captures screenshot and close the window")
	public void user_captures_screenshot_and_close_the_window() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Users\\nehad\\OneDrive\\Pictures\\Screenshots.png"));
		d.close();
	    
	}


}
