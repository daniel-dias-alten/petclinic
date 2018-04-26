Feature: OwnersFeature
  This feature deals with the owners functionalities of the application

  Scenario: See list of Owners
    Given I click the Owners navbar
    And I click the find Owner button
    Then I should see a list with 10 owners


  Scenario: Find Owners with last name Davis
    Given I click the Owners navbar
    And I enter the lastName "Davis"
    And I click the find Owner button
    Then I should see a list with 2 owners
