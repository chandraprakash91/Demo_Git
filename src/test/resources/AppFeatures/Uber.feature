 @All
 Feature: Uber Booking Feature
 
 @Smoke
 Scenario: Booking cab Sedan
 Given User wants to select a car type "sedan" from uber app
 When User selects car "sedan" and pickup point "Banglore" and drop location "Pune"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD
  
  @Regression
 Scenario: Booking cab SUV
 Given User wants to select a car type "suv" from uber app
 When User selects car "sedan" and pickup point "Banglore" and drop location "Hydrabad"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD
  
  @Prod
 Scenario: Booking cab Mini
 Given User wants to select a car type "mini" from uber app
 When User selects car "sedan" and pickup point "Pune" and drop location "Mumbai"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD