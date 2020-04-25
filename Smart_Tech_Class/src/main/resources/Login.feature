Feature: Login function validation

Scenario: Sucessfull Login with valid Credentials
	Given User able to open any browser
	And Put URL and go to login page
	When User able to use click my account
	And  User able to use valid User name
	And  User able to put valid Password
	And  User able to click submit button
	Then User able to Valided Login status
	When Close the browser  