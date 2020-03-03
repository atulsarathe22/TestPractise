Feature: To test the login functionality


  Scenario: to verify whether user is able to login with valid credentials
    Given user is on login page
    When he enters 'admin' and 'password'
    Then he should be able to login