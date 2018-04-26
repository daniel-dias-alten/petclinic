Feature: VeterinariansFeature
  This feature deals with the Veterinarians functionalities of the application

  Scenario: See list of Veterinarians
    Given I click the veterinarians navígation bar
    Then I should see a list with 6 veterinarians
