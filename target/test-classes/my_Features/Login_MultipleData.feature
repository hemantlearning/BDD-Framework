Feature: Login Validation
 This feature is going to check the login validation 
 scenarios. With different combination of scenarios it will be checked 

 Scenario Outline: Login Functionality with multiple data values
   Given user opens the browser
   And user enter the url 
   And user clicks on Login button
   When user enters username from DataTable "<username>"
   And user enters password from DataTable "<password>"
   And user clicks on Sign in button
   Then user should get successfully logged in 
   And browser should get closed
 
 Examples:
 | username      | password     |
 | LGUser1       | Password@1   |
 | LGUser2       | Password@   |
 | LGUser1       |  Password1  |
 | LGUser2       | Password@2   |
 
 
 