Feature: Credit Load Application

  Background:

    Given Navigate To ParaBank in Register
    Then Enter Data in Text Box
    And User should login successfully
  @Regression
  Scenario: Credit Load Application
    Given Navigate to Request Loan Page
    Then Enter Load Amount, Down Payment, Select Accunt ID and Submit
    And User Loan Request Result should be succesfully displayed