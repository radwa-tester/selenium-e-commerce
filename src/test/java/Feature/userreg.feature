Feature: User Registration
check that user can register in e-commerce website.
Scenario Outline:

User Registration
Given user in homepage
When user click on register
And user entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
Then user is now registered successfully 
Examples:
 	 | firstname | lastname | email | password |
 	 | ramy6 | mohamed | ramy6@gmail.com | 12345678 |
 	 | bbb | ahmed | test@gmail.com | 87654321 |
 	 