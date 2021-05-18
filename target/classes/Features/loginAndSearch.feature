Feature: login and search
#  data driven using scenario outline and data table using test case

 Scenario Outline: Login and perform the search action
    Given Open browser
    When Go to home page click on login
    Then Login as username and password
    |email|password|
    |subhadipsinha4@yahoo.com|A@123456|
    Then Enter "<query>" and search box and click on search icon
    Then validate the search "<result>"
    And Close browser
   Examples:
     |query|result|
     |card |4374  |
     |game |14033 |
