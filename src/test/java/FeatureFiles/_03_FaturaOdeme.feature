Feature: Paying Bills


  Background:

    Given Navigate To ParaBank
    When Enter username and password and click login button
    Then User should log-in successfully

  @SmokeTest
  Scenario: Account Overview
    When Click Bill Payment Service
    Then Enter payee information
    And Send Payment

