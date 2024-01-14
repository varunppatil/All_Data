
#//Before -> Background -> After

#Before and After all applicable for all feature files

Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site



@MobileTest @NetBanking
Scenario: Admin Page default landing page
 
 Given User is on NetBanking landing page
 When User login into application with "admin" and password 1234
 Then Home Page is displayed
 And Cards are displayed
 
 @RegressionTest @SmokeTest @Mortgage
Scenario: User Page default landing page
 
 Given User is on NetBanking landing page
 When User login into application with user and password "0953"
 Then Home Page is displayed
 And Cards are displayed

@MobileTest
Scenario Outline: Mortage User Page default landing page
Given User is on NetBanking landing page
 When User login into application with <Username> and password "<Password>"
 Then Home Page is displayed
 And Cards are displayed
 
 
 Examples:
 | Username   | Password |
 | debituser  | hello12  |
 | credituser | hello12  |
 
# For Data Driven part for practice 

@SmokeTest 
 Scenario: User Page default sign up
 Given User is on Practice landing page
 When User Signup into application
 |varun|
 |patil|
 |contact@gamil.com|
 |56156650|
 
 Then Home Page is displayed
 And Cards are displayed
 
 
 