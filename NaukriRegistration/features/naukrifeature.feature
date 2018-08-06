Feature: fresher registration functionality

Scenario: fresher registration functionality
Given user want to access 'https://my.naukri.com/account/createaccount?othersrcp=11496&wExp=N'
When user open google chrome
Then display the homepage of 'https://my.naukri.com/account/register/basicdetails'
And user will enter 'Name'
And user will enter 'Email ID' 
And user will enter 'Create Password' 
And user will enter 'Mobile number'
And user will select 'Current location' 
And user will 'Upload Resume'
And user click on 'Register Now'
Then user should see 'https://my.naukri.com/account/register/education'
And user will choose 'Highest Qualification'
And user will choose 'Board'
And user will choose 'Year of Passing'
And user will choose 'Medium'
And user will choose 'Percentage'
And user will choose 'Skills'
And user click on 'Continue'
Then user should see 'https://my.naukri.com/account/register/profilecompletion'
And user click on 'Skip this step'
Then user should see 'https://www.naukri.com/free-job-alerts?src=DRES'
