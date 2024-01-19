Feature: Create Account Functionality

  Background:
    Given  user logs in Cashwise account


  Scenario:  User creates a new account with valid  credentials
    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And the user enters new account details into all the valid fields
      | Field            | Value               |
      | Name             | John                |
      | Surname          | Doe                 |
      | Email            | john.de@example.com |
      | Phone Number     | 345678900           |
      | Password         | SecurePassword123   |
      | Confirm Password | SecurePassword123   |

    And the user clicks on the Create button


  Scenario: User creates a new  account with invalid email

    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And And the user enters new account details into all the valid fields1
      | Field            | Value             |
      | Name             | Adel             |
      | Surname          | as             |
      | Phone Number     | 1234007890        |
      | Password         | Adel123 |
      | Confirm Password | Adel123 |
      | Role             | Admin             |

    And the user enters an invalid email "bella@gmai.aaa"
    And   the user clicks on the Create button


  Scenario: User creates a new account with invalid phone number

    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And And the user enters new account details into all the valid fields
      | Field            | Value              |
      | Name             | Selena             |
      | Surname          | G                  |
      | Email            | selena@example.com |
      | Password         | Selena123          |
      | Confirm Password | Selena123          |
      | Role             | Admin              |

    And the user enters an invalid phone number with only zeros "0000000000"
    And the user clicks on the Create button


  Scenario: Validate whether the 'Confirm Password  fields in the 'Create Account'
  page are following  'Confirm Password'  Complexity Standarts

    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And user enter valid fields and invalid confirm password
      | Field            | Value               |
      | Name             | Jojo                |
      | Surname          | dm                  |
      | Email            | assn.de@example.com |
      | Phone Number     | 345278900           |
      | Password         | SecurePassword123   |
      | Confirm Password | SecurePassword000   |

    And the user clicks on the Create button

  Scenario: Validate whether the  Mandatory fields in the  'Create Account' page are following Complexity Standart

    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And user enter only Mandatory valid fields
      | Field        | Value                    |
      | Email        | mandatory.de@example.com |
      | Phone Number | 315278900                |
      | Password     | Mandatory123             |

    And the user clicks on the Create button


  Scenario: Validate whether the user can create account with all 'Accountant ' options on the Role radio button
    When the user clicks on the Admin Codewise drop menu
    And the user selects the Create Account option
    And the user enters new account details into all the valid fields
      | Field            | Value                |
      | Name             | Snoop                |
      | Surname          | Dog                  |
      | Email            | snoop.de@example.com |
      | Phone Number     | 343648900            |
      | Password         | SecurePassword000    |
      | Confirm Password | SecurePassword000    |
    Then user clicks  on Accountant options on the Role radio button
    And the user clicks on the Create button