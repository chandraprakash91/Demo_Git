Feature: Login Feature

Scenario Outline: LOgin fail - possible combinations
 Given user is on application landing page
 When user is on Sign in button
 Then user is displayed login screen
 When user enters "<UserName>" is username field
 And user enters "<Password>" is password field
 And user clicks Sign in button
 Then user gets login failed error message
 
   Examples: 
     | UserName          |    Password       |
     | incorrectusername |     123456        |
     | naveenautomation  | incorrectpassword |
     | incorrectusername | incorrectpassword |
