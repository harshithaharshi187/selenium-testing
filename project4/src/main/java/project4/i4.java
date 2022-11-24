package project4;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class i4 {
	WebDriver d;
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.getTitle();
		d.getCurrentUrl();
		d.manage().window().maximize();	  
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() throws IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\nehad\\eclipse-workspace\\project4\\src\\main\\java\\project4\\p1.properties");
		Properties p1=new Properties();
		p1.load(f1);
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	   
	}

	@Then("user need to click on login button")
	public void user_clicks_on_sign_button() {
		
		d.findElement(By.name("submit")).click();
	   
	}

	@And("user navigates to homepage")
	public void user_navigated_to_home_page() {
		d.close();
	    
	}


}
