package stepDefs;

import org.openqa.selenium.WebDriver;

import Pages.MedicareHomePage;
import io.cucumber.java.en.Then;

public class HomePageStepDef {

	WebDriver driver = Hooks.driver;

	MedicareHomePage Hp = new MedicareHomePage(driver);
	
	@Then("I click on Antipyretics")
	public void i_click_on_Antipyretics() {

		Hp.clickAntipyretics();
	}
	
}
