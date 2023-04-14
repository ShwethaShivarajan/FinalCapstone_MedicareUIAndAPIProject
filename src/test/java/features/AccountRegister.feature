Feature: Account registration flow

  Background: 
    Given I have launched the application
    And I navigate to login page

  @bat
  Scenario Outline: Validate account registration of user and verify username on homepage
    When I click on Register Here link
    And I enter First Name "<First Name>"
    And I enter Last Name "<Last Name>"
    And I enter Email
    And I enter Contact Number <Contact Number>
    And I enter Password "<Password>"
    And I enter Confirm Password "<Confirm Password>"
    And I select role as user
    And I click on Next Billing button
    And I enter Address Line One "<Address Line One>"
    And I enter Address Line Two "<Address Line Two>"
    And I enter City "<City>"
    And I enter Postal Code <Postal Code>
    And I enter State "<State>"
    And I enter Country "<Country>"
    And I click on Next Confirm button
    And I click on Confirm button
    Then I should receive a confirmation message
    And I click on LoginHere button
    When I enter registered email address and "<Password>"
    And I click on Login button
    Then I should land on the home page
    Then I should see username as "<First Name>" "<Last Name>" on the top right of the page

    Examples: 
      | First Name | Last Name | Contact Number | Password | Confirm Password | Address Line One    | Address Line Two | City      | Postal Code | State     | Country |
      | John       | Smith     |        89748579 |    12345 |            12345 | 123 A main, MG road | Chruch street    | Bengaluru |      564525 | Karnataka | India   |
