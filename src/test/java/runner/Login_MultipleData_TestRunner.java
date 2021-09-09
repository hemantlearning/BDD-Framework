package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import project_Utilities.All_Constants;

@RunWith(Cucumber.class)
@CucumberOptions(
					features="C:\\Users\\Hemant Rathod\\eclipse-workspace\\BDD_project\\src\\test\\java\\my_Features\\Login_MultipleData.feature",
					glue="project_Stepdefinition",
					dryRun=false,
					monochrome=true,
					//tags="@Datatabletest",
					plugin = {"pretty","html:target/cucumber-reports/index.html",
							            "json:target/JSON-reports/index.json",
							            "junit:target/XML-reports/index.xml"}
				
		)
public class Login_MultipleData_TestRunner {
  
}
