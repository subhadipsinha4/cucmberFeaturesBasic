Feature: Search actions

  Scenario: SRP search test
    Given Open Browser
    When Display the homepage
    Then Enter search query and check number of result
      |card|
    |game|
    |*   |
    Then Close Browser




