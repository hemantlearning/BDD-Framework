package project_Stepdefinition;

import io.cucumber.java.en.When;
import pages_Methods.Registration_Methods;

public class Excel_Reg_MU_Steps 
{

	Registration_Methods methods = new Registration_Methods();
	@When("user enters the Multiple students details from excel {string} and {string}")
	public void user_enters_the_multiple_students_details_from_excel_and(String filename, String sheetname) throws Exception {
		methods.collectExcelDataAndTransfer(filename, sheetname);
		
	}

}
