Feature: Free CRM Create Contacts


Scenario Outline: Free CRM Create a new contact Scenario

Given user is already on Login Page 		
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>" 
Then user clicks on login button 
Then user is on home page	
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>" 	
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| ravindrabarvaliya369@gmail.com |  Rb@199010 | Tom 	  | Peter    | Manager  |
	| ravindrabarvaliya369@gmail.com |  Rb@199010 | David 	  | Dsouza   | Director |