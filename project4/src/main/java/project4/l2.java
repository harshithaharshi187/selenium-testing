package project4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l2 {
	
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is in newtours application");
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user needs to enter username and password");
	}

	@Then("user clicks on sign button")
	public void user_clicks_on_sign_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user needs to click on signon button");
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is navigated to homepage");
	}


}
