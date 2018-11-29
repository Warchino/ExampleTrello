Feature: Create a Dashboard in Trello

  Scenario: Create dashboard

    Given I am on the Home page Trello
    When I Log in
    And I create a dashboard with a title
    Then I should see the dashboard
