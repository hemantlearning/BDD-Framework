Feature: Validate Registration form for Multiple users
 This feature will fill the form for some students using data table

Scenario: Multiple Forms Entry Validation

   Given user opens the browser
	 And user enter the url 
	 Given user navigates to Registration page
   When user enters the Multiple students details 
   |firstname  | lastname  | email                | gender | mobile     | subject           |
   |Ahan1      | A1        | Ahan1.a@gmail.com     | male   | 9898547896 | Maths             |
   |John1      | S1        | sJohn1@gmail.com      | male   | 5487696921 | Computer Science  |
   |Smita1     | c1        | cSmita1@gmail.com     | female | 3366998855 | Maths             |
   And browser should get closed
