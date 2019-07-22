package Cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("User enters username")
	public void user_enters_username() {
	  System.out.println("username is entered");
	}

	@When("User enters password")
	public void user_enters_password() {
	 System.out.println("password is entered");
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    System.out.println("clicked on login");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user is on homepage");
	}

	
	
}
