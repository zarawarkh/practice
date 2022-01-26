package com.syntax.stepDefinitions;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {

	LoginPage login;

	@Test
	@Given("^OrangeHRM logo is displayed$")
	public void orangehrm_logo_is_displayed() {
		login = new LoginPage();
		Assert.assertTrue(login.logo.isDisplayed());
		
		System.out.println("print statement");
		System.out.println("print statement");
		System.out.println("print statement");
		System.out.println("print statement");
	}

	@Test
	@When("^I enter \"(.*)\" and \"(.*)\"$")
	public void i_enter_and(String value1, String value2) {
		CommonMethods.enterValue(login.username, value1);
		CommonMethods.enterValue(login.password, value2);
	}

	@Test
	@When("^I click on login button$")
	public void i_click_on_login_button() {
		CommonMethods.click(login.btnLogin);
	}

	@Test
	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() {

	}
	
	@Test
	@Then("^I see error message \"(.*)\"$")
	public void i_see_error_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
