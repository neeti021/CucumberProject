Feature: Verify Login

@smoke
Scenario: Successful Login with valid credentials
Given User is on login page
When User enters email and password and clicks Login button
Then user should see logout link

@regression
Scenario: Unsuccessful login with invalid credentials
Given User lands on login page
When User enters incorrect email and/or password and clicks Login button
Then User should see a message "Invalid Credentials"

