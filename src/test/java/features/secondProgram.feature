Feature: Application Login



@MobileTest @NetBanking
Scenario: User Page default login 3
  Given User is on NetBanking page
  When User log in to application with jimbo111 and password 110953111 combination
  Then Home Page is displayed
  And Cards are displayed  

@SmokeTest @RegressionTest @Mortgage
Scenario Outline: User Page default login
  Given User is on NetBanking page
  When User log in to application with <Username> and password "<Password>" combination
  Then Home Page is displayed
  And Cards are displayed
  
Examples:
 | Username | Password |
 | debitUser22 | hello1222 |
 | creditUser22 | lpo21223 |
 
 
 	
 	
 