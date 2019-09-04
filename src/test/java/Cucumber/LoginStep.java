package Cucumber;


import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("User in home page")
	public void user_enters_username() {
		System.out.println("username in homepage");
	}

	@When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list= dt.asMaps();
		
		
		System.out.println(list.get(0).get("username"));
		System.out.println(list.get(0).get("username"));
		
		
		
		
		
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
