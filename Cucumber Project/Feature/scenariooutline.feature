Feature: Check login with multiple data

Scenario Outline: Successful signin with valid data
Given I am on demowebshop login page
When I login with <email> and <password>
Then I should see the logout link


Examples:
|email                 |password |
|neetikayap@gmail.com  |neetik   |
|shruthikash@gmail.com |neetik   |


