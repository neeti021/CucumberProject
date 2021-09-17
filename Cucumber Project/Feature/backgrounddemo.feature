Feature: Check title

Background: driver installed
Given I am on the home page of demowebshop

Scenario: Verify title of demowebshop
Then I should see that title contains "shop"

Scenario: Check the source of demowebshop
Then I should see that source contains "shop"

