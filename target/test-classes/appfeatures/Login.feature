Feature: Login to Salesforce Lightning Custom Automation Practice Application

  @Smoke
  Scenario: Login to Custom Automation Practice Application with Valid Credential
    Given Open Browser and Enter Custom Automation Practice Application Url
    When Enter the "userName" and "passWord"
    And Click on Sign in button
    Then Verify Title Once User Logged in Successfully on the application

  @Regression
  Scenario: Login to Custom Automation Practice Application with Valid Credential
    Given Open Browser and Enter Custom Automation Practice Application Url
    When Enter the "userName" and "passWord"
    And Click on Sign in button
    Then Verify Title Once User Logged in Successfully on the application

    
    @Smoke
    Scenario Outline: 
    Given user enter application 
    And enter user name and password 
    Then Verify User Login message for valid and in valid credential
    
    Examples: 
    |username|password|
    |username1|password1|
    |username2|password2|