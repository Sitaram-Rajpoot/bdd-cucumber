Feature: User Registration Functionality  
  @Sanity
  Scenario Outline: Login To Application with mulitiple set of data
    Given User is on the application login page
    When Enter user <name> and <password>
    Then Verify the <status> on the Home page

    Examples: 
      | name  |     password  | status  |
      | name1 |     password1 | success |
      | name2 |     password2 | Fail    |
