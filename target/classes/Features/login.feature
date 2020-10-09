Feature: Free CRM Login Feature

#Without Examples keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page 		
#When title of login page is Cogmento CRM
#Then user enters "ravindrabarvaliya369@gmail.com" and "Rb@199010" 
#Then user clicks on login button 
#Then user is on home page


#with examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page 		
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>" 
Then user clicks on login button 
Then user is on home page	 	
Then Close the browser 
 
Examples: 
| username | password |
|ravindrabarvaliya369@gmail.com | Rb@199010 |
|Tom | test456 |