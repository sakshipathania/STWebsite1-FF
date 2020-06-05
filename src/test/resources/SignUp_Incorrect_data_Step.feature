@SignUp_Incorrect_data_Step
Feature:  Sign up with incorrect data
Scenario: Test Sign up with Incorrect Data

Given user is already on sign up page
Then user enter incorrect data in the sign sig up form
Then form is error message is displayed and form is not submitted
Then enter new email to sign up
Then User enter firstname and lastname to sign up
Then user enter password and confirm password to sign up
Then user enter captcha to sign up
Then check checkbox to sign up
Then user click on sign up button to sign up
Then user is on pricing page
Then user go to free ppts page
Then user download a free product
Then user delete the new account created
