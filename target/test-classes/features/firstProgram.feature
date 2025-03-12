Feature: Application Login

#Scenario: Admin Page default login
  #Given User is on NetBanking page
  #When User log in to application with "admin" and password "1234"
  #Then Home Page is display
  #And Cards are displayd


#Scenario: User Page default login
  #Given User is on NetBanking page
  #When User log in to application with "user" and password "0953"
  #Then Home Page is display
  #And Cards are displayd
  #

Background:
  Given setup the entries in database
  When launch the browser from config variables
  And hit the home page url of banking site
  
@RegressionTest
Scenario: User Page default login 2
  Given User is on NetBanking page
  When User log in to application with "user222" and password 110953 combination
  Then Home Page is displayed
  And Cards are displayed  

@MobileTest
Scenario: User Page default login 3
  Given User is on NetBanking page
  When User log in to application with jimbo and password 110953 combination
  Then Home Page is displayed
  And Cards are displayed  

@SmokeTest @RegressionTest  
Scenario Outline: User Page default login
  Given User is on NetBanking page
  When User log in to application with <Username> and password "<Password>" combination
  Then Home Page is displayed
  And Cards are displayed
  
Examples:
 | Username | Password |
 | debitUser | hello12 |
 | creditUser | lpo213 |
 
 
 @SmokeTest
 Scenario: User Page default Sign up
 	Given User is on Practice Landing page
 	When User Signup into application
 	| rahul  |
 	| shetty |
 	| contact@email.com |
 	| 123435123 |
  Then Home Page is displayed
  And Cards are displayed
 	
 	
 