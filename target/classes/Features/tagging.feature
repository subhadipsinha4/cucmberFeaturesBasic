Feature: test HomePage


  @Sanity
  Scenario: Home Page title test
    Given Open Browser
    When Display the homepage
    Then check the page title
    And Close Browser

  @Sanity
  Scenario: Home Page search box test
    Given Open Browser
    When Display the homepage
    When check the search box
   And Close Browser

   @EndToEnd
   Scenario: Home page Search test
     Given Open Browser
     When Display the homepage
     When Enter query in Search box
     Then Click on search icon
     Then Click any product
     Then varify the PDP
     And Close Browser