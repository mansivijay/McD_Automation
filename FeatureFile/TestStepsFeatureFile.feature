Feature: All Features of MacD website 

Scenario Outline: Verification of McDelivery Website 

	Given user is on McDelivery homepage 
	When user click on Login/ Sign Up 
	And user enters valid credential 
	
	When user clicks on the change or confirm or okay button 
	Then user navigates to address selection page 
	Then user enters the "<address>" in Search building, locality, street address bar 
	Then user clicks on save and select address 
	
	When user clicks on App Store icon image 
	Then check the title and verify the App Store site in new window 
	When user clicks on Google Play icon image 
	Then check the title and verify the Google Play site in new window 
	
	When user click from the Item List 
	When user click on Search and enters "<keyword>" 
	When user click on Calories Toggle Button 
	When user click on Veg Only Toggle Button 
		
	When  click on Add+ button
	Then  customization list should be displayed
	Then  user should be able to customize items
	And  Add to cart
	
	Then  user click on View Cart 
	And  user click on + to add item 
	And  user click on pay button 
	Then  user closes the window 
		
	Examples: 
		| address |	keyword |
		| Medical Square Nagpur Bus Stop | Burger |
				