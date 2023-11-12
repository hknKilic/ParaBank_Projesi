Feature: User can update contact information

  Background:

    Given Navigate To ParaBank
    When Enter username and password and click login button
    Then User should log-in successfully


  @SmokeTest
  Scenario: Updating profile contact information

    Given Navigate To ParaBank
    When Enter click  UpdataContactInfoButton
    Then Enter  in Text Box
    And clicks the UPDATA PROFILE button
    And User should Updata successfully
