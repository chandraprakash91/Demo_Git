Feature: login page
   In order to test login page
   As a Registered user
   I want to specify the login condition
   
  #Scenario: Amazon Login Page
   #Given user is on Amazon landing page
   #Given Sign in button is present on screen
   #When user clicks on sign in button
   #Then user can see login screen
   #When user enters "naveen@gmail.com" in username feild
   #When user enters "test@123" in password feild
   #When user clicks signin button
   #Then user is on home page
   #Then title of home page is "Amazon" 
   
   
 Scenario: Amazon Login Page
   Given user is on Amazon landing page
   And   Sign in button is present on screen
   When  user clicks on sign in button
   Then  user can displayed login screen
   When  user enters "naveen@gmail.com" in username feild
   And   user enters "test@123" in password feild
   And   user clicks sign in button
   Then  user is on home page
    And  title of home page is "Amazon" 
    But  Sign in button is not Present