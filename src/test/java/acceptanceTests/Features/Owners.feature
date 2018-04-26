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


  Scenario: Find Owner with last name Franklin
    Given I click the Owners navbar
    And I enter the lastName "Franklin"
    And I click the find Owner button
    Then I should see the owner details info


  Scenario: Not Find Owner with last name Dias
    Given I click the Owners navbar
    And I enter the lastName "Dias"
    And I click the find Owner button
    Then I should see a warning message with the message "No owner found"


  Scenario: Not Find Owner with last name Dias
    Given I click the Owners navbar
    And I enter the lastName "Dias"
    And I click the find Owner button
    Then I should see a warning message with the message "No owner found"
