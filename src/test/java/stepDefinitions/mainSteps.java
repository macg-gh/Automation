package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
//	@Given("User is on NetBanking page")
//	public void user_is_on_net_banking_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("User landed on netbanking page");
//	}
	// example showing the method name can be different if the annotation matches
	@Given("User is on NetBanking page")
	public void getLandingPage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed on netbanking page");
	}	
//	@When("User log in to application with {string} and password {string}")
//	public void user_log_in_to_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User name is " + username + "and password is " + password);
//	}

//	@When("User log in to application with {string} and password {string}")
//	public void user_log_in_to_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User name is " + username + "and password is " + password);
//	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	//@When("User log in to application with {string} and password {string} combination")	
	@When("^User log in to application with (.+) and password (.+) combination$")
	public void user_log_in_to_application_with_and_password_combination(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User name is " + username + " and password is " + password);
	}
	
	
	@Given("User is on Practice Landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User name is on practice landing page");
		Assert.assertTrue(false);
	}
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	    //driver.findElement(sendKeys(data.get(0))
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));		
	}

	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("******************************");
		System.out.println("Completed setup, entries are ready");
	}

	@When("launch the browser from config variables")
	public void launch_browser() {
		System.out.println("Browser has been launched from config vars");
	}
	
	@Then("hit the home page url of banking site")
	public void hit_url() {
		System.out.println("Home page has been reached");
	}
	
	
}
