Feature: Creating A New Account

  Background:

    Given Navigate To ParaBank in Register
    Then Enter Data in Text Box
    And User should login successfully
    
  @SmokeTest 
  Scenario: Open New Account
    Given Click to WebElement
      |openNewAccount|
    Then Select Account Type and Account ID
      |accountType|0|
      |accountID|0|

    And Click to WebElement
      |submitButton|
    And Verify Openning succesfully
      |accountOpenedBox|Account Opened!|
