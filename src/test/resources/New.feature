Feature: To validate the login functionality of facebook
Scenario: Validate with valid email and invalid password
Given To launch the webBrowser
When To launch the url of the facebook
And Enter the valid username
And Enter the invalid password
And Click the login button
And check the credentials
Then close the browser



