Feature: HomePage
#search using single word query
  Scenario: Home Page search test
    Given Open Browser
    When Display the homepage
    Then Enter search "card"
    Then chcek the search page
    And Close Browser