Feature: Sales module - Invoice feature
  As a user I want to be able to create an invoice for the client

  @Dzhalsan
  Scenario: Create Invoice positive
    Given I am logged in
    Then I click on Sales button
    Then I click on Invoice button
    Then I click on Create invoice button
    Then I put Invoice name
    Then I select client in Whom field
    Then I put date in Pay until
    Then I put description
    When I select product or service
    And I click on Save Button
    Then I should see a success message







