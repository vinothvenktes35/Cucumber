package com.testautomation.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SFE_URL_StepDef {

	@Given("user is on the browser")
	public void user_is_on_the_browser() {
	    System.out.println("user is on the browser");
	}

	@When("user enters URL")
	public void user_enters_url() {
		System.out.println("user enters URL");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		System.out.println("clicks on search button");
	}

	@Then("user should navigate to the Homepage of the application")
	public void user_should_navigate_to_the_homepage_of_the_application() {
		System.out.println("user should navigate to the Homepage of the application");
	}
	
}
