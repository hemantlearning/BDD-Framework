package project_Stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_Methods.Registration_Methods;

public class DataTable_SUser_Steps 
{
	Registration_Methods methods = new Registration_Methods();
	@Given("user navigates to Registration page")
	public void user_navigates_to_registration_page() {
		methods.navigateToRegistrationPage();
	}
	@When("user enters the single student details")
	public void user_enters_the_single_student_details(DataTable values) {
		List<String> u = values.asList();
		methods.userEntersRegistrationDetails(u.get(0), u.get(1),u.get(2),u.get(3),u.get(4),u.get(5));
		
	}



}
