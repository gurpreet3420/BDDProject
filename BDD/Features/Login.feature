#Author: your.email@your.domain.com

@SmokeTest
Feature: Login page validation

@PositiveScenario
Scenario: Login with valid credentials

Given User is at the login page
When User enter the valid username and password
And User hit login button
Then User should be redirected to the homepage


@NegativeScenario
Scenario: Login with invalid credentials

Given User is at the login page
When User enter the invalid username and password
And User hit login button
Then User should be redirected to the homepage