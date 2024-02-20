Feature: To test the login page
Scenario: Login and confirming to get into the dashhboard
Given I am on the website "https://admin-demo.nopcommerce.com/login"
When I enter the Email ID = "admin@yourstore.com" and Password = "admin"
And I Click the Login button
Then I should get "Dashboard" text