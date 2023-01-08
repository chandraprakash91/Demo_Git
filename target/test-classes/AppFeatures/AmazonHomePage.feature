 Feature: Amazon Home Page
     In order to test Amazon Home Page of application
     As a registered user
     I want to specify the feature of home page
     
   Scenario: Home Page Top Panel Section
      Given user is on amazon home page
      Then user gets Amazon search field
      And username is also displayed next to search field
      And Amazon logo is also displayed
      And Cart link is also displayed
      
   Scenario: Amazon Todays Deals section
      Given user is on amazon home page
      When user scrolls down to Todays Deals section
      Then user gets the list of multiple products
      And user gets product and price details
      And user can see more products by clicking on carousel
      
   Scenario: Amazon Footer Link Section 
      Given user is on Amazon home page
      When user scrolls down to footer of the page
      Then user gets all Country links
      |Australia|
      |Brazil|
      |China|
      And user gets all Amazon services link
      |Amazon Business|
      |Amazon Web Services|
      And user gets all privacy policy links
      |Privacy Notice|
      |Use & Sale|   
        