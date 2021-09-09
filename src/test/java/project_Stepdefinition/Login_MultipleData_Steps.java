package project_Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_Methods.Books_Methods;

public class Login_MultipleData_Steps 
{
	Books_Methods methods = new Books_Methods();


	@When("user enters username from DataTable {string}")
	public void user_enters_username_from_data_table(String uname) {
		methods.EnterUserName(uname);
	}
	
	
	@When("user enters password from DataTable {string}")
	public void user_enters_password_from_data_table(String upass) {
		methods.EnterPassword(upass);
	}


}
