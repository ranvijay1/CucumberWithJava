Feature: Login feature file

  Scenario: Login with user and password
    Given Should launch url "http://newtours.demoaut.com/" to do login
    When Should click on Sign on button button in main page
    And Should enter "rvsingh" and "54218Ran" in login page
    And Should Click on Submit button from login page for login
    Then Verifying user succsessfully logged in
    And Should click on Sign Off button to signout
