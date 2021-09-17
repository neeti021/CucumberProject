Feature: datatable demo

Scenario: Succesful Login with valid credentials
Given user is on demowebshoptricentis login page
When User enters email and password
 |neetikayap@gmail.com|neetik|
Then user should view logout
