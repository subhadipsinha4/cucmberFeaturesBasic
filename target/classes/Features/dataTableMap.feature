Feature: Search actions
#data table using map//

  Scenario: Validate the search result
    Given Open Browser
    When Display the homepage
    Then Enter search query and check number of result
      |query|value|
      |card|4372|
      |game|14004|
      |*   |24710|
    Then Close Browser