package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginSteps {
	
	@Given("user is on Amazon landing page")
	public void user_is_on_amazon_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Successfully LogIn in Amazon App");
	   System.out.println("Type Valid UserName");
	   System.out.println("Type Valide Password");
	   //starting
	   //Secondn file
	   System.out.println("Select item");
	   System.out.println("Add To Cart");
	}

	@Given("Sign in button is present on screen")
	public void sign_in_button_is_present_on_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can displayed login screen")
	public void user_can_displayed_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters {string} in username feild")
	public void user_enters_in_username_feild(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters {string} in password feild")
	public void user_enters_in_password_feild(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("title of home page is {string}")
	public void title_of_home_page_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Sign in button is not Present")
	public void sign_in_button_is_not_present() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
