Feature: test HomePage

#  basic testing

  Scenario: Home Page title test
    Given Open Browser
    When Display the homepage
    Then check the page title
    Then check on product
    Then check product title on PDP
    And Close Browser
