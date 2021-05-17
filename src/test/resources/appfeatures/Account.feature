@Smoke
Feature: Account page

  Background: 
    When User already logged in to the application successfully
      | userName                    | passWord        |
      | sitaram.rajpootsr@gmail.com | Automation$1234 |


  Scenario: Account page Title
    Given User is on Account page
    When Get the Account page Title
    Then Verify Account page Title should be "My account - My Store"
