Feature: Search Page

#data driven testing, create table and passing the value
#Scenario Outline and Examples keys word use

   Scenario Outline: test Search page funcanality is working or not
      Given Open Browser
      When Display the homepage
      Then Enter search "<query>"
      Then chcek the search page
#    Then click product from search page
#    Then chcek the product in PDP
      And Close Browser
      Examples:
         | query |
         | *     |
         | card  |
         | game  |
