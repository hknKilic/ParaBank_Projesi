Feature: Login Feature
  @SmokeTest @Regression
  Scenario: Login with valid username and password
    Given Navigate To ParaBank
    When Enter username and password and click login button
    Then User should log-in successfully