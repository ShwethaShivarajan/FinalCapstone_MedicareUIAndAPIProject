package stepDefs;

import org.openqa.selenium.WebDriver;

import Pages.AccountRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountRegisterStepDef {
	WebDriver driver = Hooks.driver;
	AccountRegisterPage AccReg = new AccountRegisterPage(driver);
	
	@When("I click on Register Here link")
	public void i_click_on_Register_Here_link() {
	 
		AccReg.clickRegister();
	}

	@When("I enter First Name {string}")
	public void i_enter_First_Name(String FirstName) {
	    AccReg.enterFirstName(FirstName);
	}

	@When("I enter Last Name {string}")
	public void i_enter_Last_Name(String LastName) {
	    AccReg.enterLastName(LastName);
	}

	@When("I enter Email")
	public void i_enter_Email() {
	    AccReg.enterEmail();
	}

	@When("I enter Contact Number {int}")
	public void i_enter_Contact_Number(int ContactNum) {
	   AccReg.enterContactNum(ContactNum);
	}

	@When("I enter Password {string}")
	public void i_enter_Password(String password) {
	   AccReg.enterPassword(password);
	}

	@When("I enter Confirm Password {string}")
	public void i_enter_Confirm_Password(String ConfirmPassword) {
	  AccReg.enterConfirmPasswordl(ConfirmPassword);
	}

	@When("I select role as user")
	public void i_select_role_as_user() {
	   AccReg.selectUserRole();
	}

	@When("I click on Next Billing button")
	public void i_click_on_Next_Billing_button() throws InterruptedException {
	   AccReg.clickNextBillingButton();
	}

	@When("I enter Address Line One {string}")
	public void i_enter_Address_Line_One(String Address1) {
	   AccReg.enterAddress1(Address1);
	}

	@When("I enter Address Line Two {string}")
	public void i_enter_Address_Line_Two(String Address2) {
	   AccReg.enterAddress2(Address2);
	}

	@When("I enter City {string}")
	public void i_enter_City(String City) {
	   AccReg.enterCity(City);
	}

	@When("I enter Postal Code {int}")
	public void i_enter_Postal_Code(int PostalCode) {
	 AccReg.enterPostalCode(PostalCode);
		
	}

	@When("I enter State {string}")
	public void i_enter_State(String State) {
	 AccReg.enterState(State);
	}

	@When("I enter Country {string}")
	public void i_enter_Country(String Country) {
	   AccReg.enterCountry(Country);
	}

	@When("I click on Next Confirm button")
	public void i_click_on_Next_Confirm_button() throws InterruptedException {
	   AccReg.clickNextConfirmButton();
	}

	@When("I click on Confirm button")
	public void i_click_on_Confirm_button() throws InterruptedException {
	  AccReg.clickConfirmButton();
	}

	@Then("I should receive a confirmation message")
	public void i_should_receive_a_confirmation_message() {
	    AccReg.verifyAccountRegisterConfirmationMessage();
	}
	
	@Given("I click on LoginHere button")
	public void i_click_on_LoginHere_button() {
	    AccReg.clickLogin();
	}

	@When("I enter registered email address and {string}")
	public void i_enter_registered_email_address_and(String Password) {
	  AccReg.enterRegisteredEmailandPw(Password);
	}
	
	@Then("I should see username as {string} {string} on the top right of the page")
	public void i_should_see_username_as_on_the_top_right_of_the_page(String firstName, String lastName) {
	   AccReg.verifyUserProfileName(firstName, lastName);
	}


}
