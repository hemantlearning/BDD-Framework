package project_Stepdefinition;


import io.cucumber.java.en.*;
import pages_Methods.Books_Methods;
import project_Base.Base_Class;

public class LoginValidationSteps 
{
	
	Books_Methods methods = new Books_Methods();
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		methods.openBrowser();
	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		methods.enterUrl();
	}


	@Given("user clicks on Login button")
	public void user_clicks_on_login_button() {
		methods.navigateToBookStoreApp();
		methods.clickOnLoginOption();
	}


	@When("user enters username {string}")
	public void user_enters_username(String uname) {
		methods.EnterUserName(uname);
	}

	@When("user enters password {string}")
	public void user_enters_password(String upass) {
		methods.EnterPassword(upass);
	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		methods.clickOnSignInButton();
	}


	@Then("user should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		methods.validateLogin();
	}


	@Then("browser should get closed")
	public void browser_should_get_closed() {
		methods.closeBrowser();
	}
	
}