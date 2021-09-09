Feature: Validate Registration form for Multiple users
 This feature will fill the form for some students using data table

Scenario: Multiple Forms Entry Validation

   Given user opens the browser
	 And user enter the url 
	 Given user navigates to Registration page
   When user enters the Multiple students details from excel "ExcelDataMU.xlsx" and "data1"
   And browser should get closed
