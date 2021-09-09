package project_Stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages_Methods.Registration_Methods;

public class Datatable_MUser_Steps 
{

	Registration_Methods methods = new Registration_Methods();
	@When("user enters the Multiple students details")
	public void user_enters_the_multiple_students_details(DataTable values) {
		
		List<Map<String, String>> userdata =values.asMaps(String.class, String.class);
		
		for(Map<String,String> e : userdata) {
			methods.userEntersRegistrationDetails(e.get("firstname"), e.get("lastname"), 
					e.get("email"), e.get("gender"), e.get("mobile"), e.get("subject"));
		}
		
		
	}

}
