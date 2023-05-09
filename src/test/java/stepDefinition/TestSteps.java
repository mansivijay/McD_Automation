//package stepDefinition;
//
//
//import static org.junit.Assert.assertTrue;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TestSteps {
//	//String baseUrl = "https://www.mcdelivery.co.in/home/family-meals";
//	String baseUrl = "https://www.mcdelivery.co.in/";
//	String expectedTitle = "McDonald's - Order McDonald's Burger & Wraps online|McDelivery";
//	String actualTitle = null;
//	WebDriver driver;
//
//	@Given("^user is on McDelivery homepage$")
//	public void user_is_on_McDelivery_homepage() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(baseUrl);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
//		Thread.sleep(1000); 
//		
//	}
//	
//	// Test Steps for login
//	@When("^user click on Login/ Sign Up$")
//	   public void user_click_on_Login_Sign_Up() throws Throwable {
//	  	   driver.findElement(By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]")).click();
//	 	   driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div")).click();
//	       driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/div/label")).click();
//
//
//	}
//	   @And("^user enters valid credential$")
//	   public void user_enters_valid_credential() throws Throwable {
//		      
//			      driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input")).sendKeys("7709070676");
//			      Thread.sleep(1000); 
//		          driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Papa@98");
//		          Thread.sleep(1000); 
//			      driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button")).click();
//			      Thread.sleep(2000); 
//	   }	
//	   
//	//Test steps for Location
//
//	@When("^user clicks on the change button$")
//	public void user_clicks_on_the_change_button() throws Throwable {
//	      //select now button
//	//driver.findElement(By.xpath("/html/body/app-root/div/div/app-home-page/app-header/div[1]/div/div/div[1]/div[3]/app-nudge/div/div[3]/button[2]")).click();
//	
//		//change button	
//    try { 
//	WebElement button = driver.findElement(By.xpath("//div[contains(@class,'text-font search-box')]//button[contains(@class,'btn change-btn')][normalize-space()='Change']"));button.click();
//	button.click();
//    }
//    catch(org.openqa.selenium.StaleElementReferenceException ex)
//    {
//    	WebElement button = driver.findElement(By.xpath("//div[contains(@class,'text-font search-box')]//button[contains(@class,'btn change-btn')][normalize-space()='Change']"));button.click();
//    } 
//	  Thread.sleep(2000); 
//	}
//
//	@Then("^user navigates to address selection page$")
//	public void user_navigates_to_address_selection_page() throws Throwable {
//		driver.navigate().to("https://www.mcdelivery.co.in/serviciability/locateme/home");
//		Thread.sleep(2000);
//	}
//
//	@Then("^user enters the \"([^\"]*)\" in Search building, locality, street address bar$")
//	public void user_enters_the_in_Search_building_locality_street_address_bar(String address) throws Throwable {
//		driver.findElement(By.xpath("//input[@id='menu-search']")).sendKeys(address);
//		driver.findElement(By.xpath("//div[contains(text(),'Medical Square Bus Stop')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='building']")).sendKeys("55");
//		driver.findElement(By.xpath("//p[@class='activeOption']")).click();
//	}
//	
//	@Then("^user clicks on save and select address$")
//	public void user_clicks_on_save_and_select_address() throws Throwable {
//	    driver.findElement(By.xpath("//button[normalize-space()='Save and Select Address']")).click();
//	    Thread.sleep(5000);
//	    
//	}
//
//	// Test Steps for Play store icons
//	@When("^user clicks on App Store icon image$")
//	public void user_clicks_on_App_Store_icon_image() throws Throwable {
//		driver.findElement(By.xpath("//img[contains(@src,'https://images.mcdelivery.co.in/hardcastle-restaurants-pvt-ltd/image/upload/v1591261952/NewWebsiteResource2020/Assets/Img/Appstore.svg')]")).click();
//		Thread.sleep(2000);
//	}
//	
//	
//	@Then("^check the title and verify the App Store site in new window$")
//	public void check_the_title_and_verify_the_App_Store_site_in_new_window() throws Throwable {
//		
//		Thread.sleep(5000);
//	   
//		//Get handles of the windows
//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
// 
//        // Here we will check if child window has other child windows and will fetch the heading of the child window
//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                String title = driver.getTitle();
//                System.out.println("Page title 2 = " + title);
//                driver.close();
//            }
//        }
//        driver.switchTo().window(mainWindowHandle);
//	}
//	
//	
//	@When("^user clicks on Google Play icon image$")
//	public void user_clicks_on_Google_Play_icon_image() throws Throwable {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//img[contains(@src,'https://images.mcdelivery.co.in/hardcastle-restaurants-pvt-ltd/image/upload/v1591261944/NewWebsiteResource2020/Assets/Img/Playstore.svg')]")).click();
//	}
//
//	@Then("^check the title and verify the Google Play site in new window$")
//	public void check_the_title_and_verify_the_Google_Play_site_in_new_window() throws Throwable {
//		
//		Thread.sleep(5000);
//		
//		//Get handles of the windows
//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
// 
//        // Here we will check if child window has other child windows and will fetch the heading of the child window
//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                String title1 = driver.getTitle();
//                System.out.println("Page title 3 = " + title1);
//                driver.close();
//            }
//        }
//        driver.switchTo().window(mainWindowHandle);
//        Thread.sleep(1000);
//	}
//	
//	// Test Steps for Search
//	@When("^user click from the Item List$")
//	public void user_click_from_the_Item_List() throws Throwable 
//	{		
//		WebElement ItemList = driver.findElement(By.xpath("//div[@class='col-2-menu col-height']"));
//		List<WebElement> categoryList = ItemList.findElements(By.tagName("div"));
//		java.util.Iterator<WebElement> listOfCategory = categoryList.iterator() ;
//		Thread.sleep(2000);
//		
////		if(driver.findElement(By.xpath("//span[normalize-space()='Trending']")).isSelected())
////		{
//		while(listOfCategory.hasNext()) 
//			{
//			    WebElement category = listOfCategory.next() ;
//			    category.click();
////			    System.out.println(category.getText() + " is Selected");
//			    Thread.sleep(2000);
//			}
//		}
//		
////		else 
////		{
////			
////		}
////	}
//			
//	@When("^user click on Search and enters \"([^\"]*)\"$")
//	public void user_click_on_Search_and_enters(String Keyword) throws Throwable 
//	{
//		driver.findElement(By.xpath("//input[@id='menu-search']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='menu-search']")).sendKeys(Keyword);
//		Thread.sleep(2000);
//	}
//
//
//	@When("^user click on Calories Toggle Button$")
//	public void user_click_on_Calories_Toggle_Button() throws Throwable
//	{
//		driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='calorie-filter']//span[@class='slider round ']")).click();
//		assertTrue(driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='calorie-filter']//span[@class='slider round ']")).isEnabled());
//		driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='calorie-filter']//span[@class='slider round ']")).click();
//		System.out.println("Calorie Toggle Button is Switched ON");
//		Thread.sleep(2000);
//
//		assertTrue(driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='calorie-filter']//span[contains(@class,'slider round')]")).isEnabled());
//		driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='calorie-filter']//span[contains(@class,'slider round')]")).click();
//		System.out.println("Calorie Toggle Button is Switched OFF");
//		Thread.sleep(2000);
//	}
//
//
//	@When("^user click on Veg Only Toggle Button$")
//	public void user_click_on_Veg_Only_Toggle_Button() throws Throwable 
//	{
//		assertTrue(driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")).isEnabled());
//		driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")).click();
//		System.out.println("Veg Only Toggle Button is SWITCHED ON");
//		Thread.sleep(2000);
//
//
//		assertTrue(driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")).isEnabled());
//		driver.findElement(By.xpath("//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")).click();
//		System.out.println("Veg Only Toggle Button is SWITCHED OFF");
//		Thread.sleep(2000);
//	}
//
//
//	    
//	
//
//
//
//	
//	// Test Steps for Customization
//	 
//	 @When("^click on Add\\+ button$")
//	    public void click_on_Add_button() throws Throwable {
//		
//	        driver.findElement(By.xpath("//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-search-items/div/div[@class='menu-popup cursor-pointer']/div[@class='content-section']/div/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]")).click();
//	        //driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/app-home-page[1]/div[1]/div[4]/app-menu-popup[1]/div[1]/div[1]/div[1]/div[2]/app-menu-items[1]/div[1]/app-menu-item[2]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]/button[1]")).click();
//	        Thread.sleep(2000);
//	    }
//	    
//	    @Then("^customization list should be displayed$")
//	    public void customization_list_should_be_displayed() throws Throwable {
//	        
//	        String mainWindowHandle = driver.getWindowHandle();
//	        Set<String> allWindowHandles = driver.getWindowHandles();
//	        Iterator<String> iterator = allWindowHandles.iterator();
//	        
//	        while (iterator.hasNext()) {
//	            
//	            String childWindow = iterator.next();
//	            if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
//	                driver.switchTo().window(childWindow);
//	                String title = driver.getTitle();
//	                System.out.println("Page title = " + title);
//	            }
//	            //driver.switchTo().window(mainWindowHandle);
//	            
//	        }
//	        Thread.sleep(2000);
//	        
//	        //String text = get.Title();
//	        //String text = driver.findElement(By.id("modal-basic-title,'Customize your McVeggie Burger'")).getText().trim();
//	        //System.out.println("Page title = " + title);
//	        //Assert.assertEquals("Customize your McVeggie Burger",text);
//	    }
//
//	 
//
//	    @Then("^user should be able to customize items$")
//	    public void user_should_be_able_to_customize_items() throws Throwable {
//	        
//	        driver.findElement(By.xpath("//label[@for='00']")).click();
//	        
//	        Thread.sleep(3000);
//	        
//	    }
//	    @And("^Add to cart$")
//	    public void add_to_cart() throws Throwable {
//	        
//	        //driver.findElement(By.linkText("Add to Cart")).click();
//	        driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
//	        Thread.sleep(2000);
//	    }
//
//	 // Test Steps for Cart
//	 
//	    @Then("^user click on View Cart$")
//	    public void user_click_on_View_Cart() throws Throwable {
//	    driver.findElement(By.xpath("//button[normalize-space()='View Cart']")).click();
//	    //pay
//	    //driver.findElement(By.xpath("//div[@class='cart-footer']")).click();
//
//	     Thread.sleep(1000);
//	    }
//	    @And("^user click on \\+ to add item$")
//	    public void user_click_on_to_add_item() throws Throwable {
//	    driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
//	    Thread.sleep(1000);
//	    }
//
//	    @And("^user click on pay button$")
//	    public void user_click_on_pay_button() throws Throwable {
//	    driver.findElement(By.xpath("//div[@class='cart-footer']")).click();
//	    driver.findElement(By.xpath("//div[normalize-space()='More']")).click();
//	    driver.findElement(By.xpath("//div[@class='payment-option-saved-info']")).click();
//	    Thread.sleep(2000);
//	    }
//  
//	    @Then("^user closes the window$")
//	    public void user_closes_the_window() throws Throwable {
//	    driver.close();
//	    }
//
//}
//	 
//	