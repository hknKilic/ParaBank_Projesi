Feature: AccountOverview Functionality

  Background:
    Given Navigate to parabank
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to parabank

  Scenario Account Overview
    When Click account averview
    Then Customer data should be displayed
    And Click account number

    Then Account details should be displayed
    And See in the list of activities

    Then Click any process
    And See the payment details

