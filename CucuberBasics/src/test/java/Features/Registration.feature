#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login into apllication

  @Admin
  Scenario: Register new User as admin
    Given Should launch url "http://newtours.demoaut.com/"
    When Should click on Register button
    And Verifyng register page open succesfully
    And Should enter all details into text box
      | firstName      | Ran                       |
      | lastName       | Vijay                     |
      | phone          |                9795922207 |
      | email          | ranvijaysngh143@gmail.com |
      | address        | Plot No 74                |
      | userName       | rvsingh                   |
      | passord        | 54218Ran                  |
      | confirmPassord | 54218Ran                  |
    And Should Click on Submit button
    Then Verifying user succsessfully register
    And Should click on sign in link
    And Should enter "rvsingh" and "54218Ran"
    And Should Click on Submit button from login page
    Then Verifying user succsessfully login
    And Should click on Sign Off button
    
    @User
  Scenario: Register new User as user
    Given Should launch url "http://newtours.demoaut.com/"
    When Should click on Register button
    And Verifyng register page open succesfully
    And Should enter all details into text box
      | firstName      | Shyam                       |
      | lastName       | Singh                     |
      | phone          |                8299751146 |
      | email          | ranvi@gmail.com |
      | address        | Plot No 79                |
      | userName       | shyam                   |
      | passord        | 532415Ra                  |
      | confirmPassord | 532415Ra                  |
    And Should Click on Submit button
    Then Verifying user succsessfully register
    And Should click on sign in link
    And Should enter "shyam" and "532415Ra"
    And Should Click on Submit button from login page
    Then Verifying user succsessfully login
    And Should click on Sign Off button
