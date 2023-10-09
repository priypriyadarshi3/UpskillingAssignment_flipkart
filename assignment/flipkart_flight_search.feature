Feature: Flipkart Flight Search

  Scenario: Search for round-trip flights
    Given I navigate to flipkart.com
    When I select round trip
    And I select departure date
    And I select return date
    And I select departure location "<fromLocation>"
    And I select arrival location "<toLocation>"
    And I click on search
    Then I validate the total price for flights