package com.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Condition;
import org.junit.Assume;

import com.pages.UserFormPages;

public class UserFormDefinitions {

    @Steps
    UserFormPages userFormPages;

    @Given("Open the application")
    public void open_the_application() {
    	userFormPages.openApplication();
    }

    @Given("fill the follwing user information {string},{string},{string},{string},{string},{string},{string}")
    public void fill_the_follwing_user_information(String address, String city, String state, String zip, String email, String phone, String dob) {
    	userFormPages.enterUserInformation(address, city, state, zip, email, phone, dob);
    }

    @Given("submit the form")
    public void submit_the_form() {
    	userFormPages.submitUserForm();
    }

    @Then("verify user is navigated to summaryPage")
    public void verify_user_is_navigated_to_summaryPage() {
    	userFormPages.NavigateToSummaryPage();
    }

    @Then("click Continue button in the summaryPage")
    public void click_Continue_button_in_the_summaryPage() {
    	userFormPages.submitSummaryPage();
    }

    @Then("verify user is navigated to successPage")
    public void verify_user_is_navigated_to_successPage() {
    	userFormPages.NavigateToSuccessPage();
    }


}
