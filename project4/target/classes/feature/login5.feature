Feature: webapplication

  Scenario: working on amazon page
    Given user open amazon website
    When user need to click register link
    Then user need to get country names from dropdown
    And user navigates back to homepage
    And user closes the page
