 Feature: Amazon Order Page
 In order to check of my details
 As a registered user
 I Want to specify the feature of order details page
 
 Background:
   Given a registered user exist
  Given user is on Amazon login page
  When user enters username
  And user enters password
  And user click on login button
  Then user navigates to the order
 
 
 Scenario: Check Previos Order Details
  When user clicks on Order link
  Then user checks the previous order details
  
  
 Scenario: Check open order Details
  When user clicks on Open Order link 
  Then user checks the open order details
  
  
 Scenario: Check Cancelled order Details
   When user clicks on Cancelled Order link
  Then user checks the Cancelled order details
  
  
 