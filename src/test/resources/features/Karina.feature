Feature: Verify if user is able to accept payment

  Background:
    Given  user logs in Cashwise account

    Scenario:Verify accept payment method
      Given user clicks on Accept payment button
      Then  user click on Payment method drop-down box
      Then user clicks on bank method
      And user clicks to which check
      And user have to create new check
      Then user enters  details into all the valid fields
      And user clicks to save button
      Then user clicks to created check
      And user write comment
      And click to save button
