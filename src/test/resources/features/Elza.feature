Feature: verify that user should not be able to create a new account
with incorrect credentials


  Scenario Outline: verify LogIn functionality
    Given user go on "https://cashwise.us/main"
    When user clicks on SignIn button
    Then user clicks on email line and delete previous users credential
    Then user add correct "<email>"
    Then user clicks on password line and delete previous users credential
    Then user insert correct "<password>"
    And user clicks on SignIn2 button

    Examples:
      | email           | password  |
      | 77777@gmail.com | 123456789 |


  Scenario: user should not be able create a new account without adding at sign for email
    When user clicks on account button
    Then user clicks on Create account button
    Then user add "Maria"
    Then user write "HoHo"
    Then user add "777gmail.com" with inccorect credential
    Then user add phoneNum "9999999999"
    Then user add pass "12345678"
    And user confirm "12345678"
    And user clicks on save button
    And user should not be able to create account, must see "Please enter a valid email address"


  Scenario: user should not be able create a new account with password length less than at least 6 digits
    Then user add "7778@gmail.com" with correct credentials
    Then user add 5 digits "12345"
    And user confirm 5 digits "12345"
    And user clicks on save button
    And user should not be able to create account, must see note "Password must be at least 6 characters"


  Scenario: user should be able create accountant account with all correct credentials
    Then user again add pass "12345678"
    And user again confirm "12345678"
    And user choose accountant from a check box
    And user clicks on save button
    And user should be able to create accountant profile and see the notification "Account successfully created"

  Scenario: user should be able create any account with all correct credentials
    And user choose admin from a check box
    And user clicks on save button
    And user should be able to create cashier profile and see the notification "Account successfully created"