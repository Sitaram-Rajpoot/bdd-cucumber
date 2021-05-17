Feature: Login Feature
@Regression
Scenario: Login page Title
Given User is on Login page
When  Get the Login page Title
Then Verify Title should be "Login - My Store" 
@Smoke
Scenario: Verify Forget Password Link
Given User is on Login page 
When Verify Forget password link is visible

@Smoke
Scenario: Login with Correct Credentials
Given User is on Login page
When  User enter usernName "sitaram.rajpootsr@gmail.com" 
And User enter Password "Automation$1234"
And User Click on Sign in button 
Then Verify Account page Title 
And Account page Title should be "My account - My Store"