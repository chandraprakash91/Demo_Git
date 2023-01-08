 Feature:  User Registration
 
 Scenario: user registration with different data
  Given User is on registration page
  When  user enters following user details
    | naveen | automation | nav@gmail.com | 9999 | Bangalore |
    | tom | peter | tom@gmail.com | 9889 | London |
    | lisa | desouza | lisa@gmail.com | 5574 | SFO |   
  Then user registration should be successful
  
 Scenario: user registration with different data with columns
  Given User is on registration page
  When  user enters following user details with columns
    | firstname | lastname | email | phone | city | 
    | naveen | automation | nav@gmail.com | 9999 | Bangalore |
    | tom | peter | tom@gmail.com | 9889 | London |
    | lisa | desouza | lisa@gmail.com | 5574 | SFO |   
  Then user registration should be successful
    