Feature: Create a Dashboard in Trello

  Scenario: Create dashboard
    Given Web page Trello
    When I go to the webpage
    And I Log in to
    And Go to dashboard
#    And Put a name to dashboard
    And Create New dashboard
    Then The dashboard was created
