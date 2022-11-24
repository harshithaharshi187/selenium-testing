Feature: working on web application

  Scenario Outline: Dezlearn.com
    Given user is in dezlearn.com
    When user gets the url and title
    Then user works on alert message
    And user captures screenshot and close the window
