Feature: Validate Registration form for single users
 This feature will fill the form for one student using data table

  Scenario: Registration Form Entry Validation

	 Given user opens the browser
	 And user enter the url 
	 Given user navigates to Registration page
	 When user enters the single student details 
	 |Ahan | A | Ahan.a@gmail.com | male | 9898547896 | Maths |
	 And browser should get closed