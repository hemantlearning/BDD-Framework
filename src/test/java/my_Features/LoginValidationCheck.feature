Feature: Login Validation
 This feature is going to check the login validation 
 scenarios. 
 
 Scenario: Login Functionality with Valid credentials
   Given user opens the browser
   And user enter the url 
   And user clicks on Login button
   When user enters username "LGUser1"
   And user enters password "Password@1"
   And user clicks on Sign in button
   Then user should get successfully logged in 
   And browser should get closed
 

 