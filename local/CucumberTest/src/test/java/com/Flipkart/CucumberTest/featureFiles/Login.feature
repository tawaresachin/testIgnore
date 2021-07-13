Feature: Login to account
User with correct username & password should be able to login to account

Scenario Outline: Login into account with correct user details
Given User enters Flipkart.com website url
And user opens the website login page
And user enters valid "<username>"
And user enters valid "<password>" field
When user click on login button
Then user should be successfully taken to HomePage 

Examples:
					|username  |password  |
					|9096349923|9096349923|