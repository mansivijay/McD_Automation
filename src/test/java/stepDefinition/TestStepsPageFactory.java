package stepDefinition;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import pageFactory.Cart_PF;
import pageFactory.Customization_PF;
import pageFactory.Location_PF;
import pageFactory.Login_PF;
import pageFactory.PlayStore_PF;
import pageFactory.Search_PF;

public class TestStepsPageFactory

{
	Login_PF login;
	Location_PF location;
	PlayStore_PF playstore;
	Customization_PF customize;
	Search_PF search;
	Cart_PF cart;

	String baseUrl = "https://www.mcdelivery.co.in/";
	String expectedTitle = "McDonald's - Order McDonald's Burger & Wraps online|McDelivery";
	String actualTitle = null;
	WebDriver driver = null;

	@Given("^user is on McDelivery homepage$")
	public void user_is_on_McDelivery_homepage() throws Throwable {
		ConfigFileReader configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		Thread.sleep(1000);

	}
//	@When("^user click on View Profile$")
//	public void user_click_on_View_Profile() throws Throwable{
//		login = new Login_PF(driver);
//		login.view_profile();
//		Thread.sleep(2000);
//	}
//	
//	// Test Steps for login
//	@Then("^user click on Login/ Sign Up$")
//	public void user_click_on_Login_Sign_Up() throws Throwable {
//
//		login = new Login_PF(driver);
//		login.login_signup();
//		Thread.sleep(2000);
//	}
//	@Then("^user enters mobile number$")
//	public void user_enters_mobile_number() throws Throwable{
//		login = new Login_PF(driver);
//		login.mobno();
//		Thread.sleep(2000);
//		
//	}
//	@And("^user click on Verify Mobile$")
//	public void user_click_on_Verify_Mobile() throws Throwable{
//		login = new Login_PF(driver);
//		login.verify_mobile();
//		Thread.sleep(2000);
//		throw new PendingException();
//	}
	
//
//	@And("^user enters valid credential$")
//	public void user_enters_valid_credential() throws Throwable {
//
//		login.mobno(); 
//		login.password();
//		login.clickLogin();
//		Thread.sleep(2000);
//
//	}
//
//	// Location
//	
//	
//	@When("^user clicks on the change button$")
//	public void user_clicks_on_the_okay_or_change_button() throws Throwable {
//		try
//		{ 
//			WebElement button = driver.findElement(By.xpath("//div[contains(@class,'text-font search-box')]//button[contains(@class,'btn change-btn')][normalize-space()='Change']"));button.click();
//			button.click();
//		}
//		catch(org.openqa.selenium.StaleElementReferenceException ex)
//		{
//			WebElement button = driver.findElement(By.xpath("//div[contains(@class,'text-font search-box')]//button[contains(@class,'btn change-btn')][normalize-space()='Change']"));button.click();
//		} 
//		Thread.sleep(2000); 
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
//		location = new Location_PF(driver);
//		location.enterAddress();
//		location.clickAddress();
//		Thread.sleep(3000);
//		location.clickDone();
//		Thread.sleep(1000);
//		location.enterHouseNo();
//		location.clickHome();
//
//	}
//
//	@Then("^user clicks on save and select address$")
//	public void user_clicks_on_save_and_select_address() throws Throwable {
//
//		location.clickSave();
//		Thread.sleep(2000);
//
//	}
//
//
//	//Play store
//	@When("^user clicks on App Store icon image$")
//	public void user_clicks_on_App_Store_icon_image() throws Throwable {
//
//		Thread.sleep(5000);
//		playstore = new PlayStore_PF(driver);
//		playstore.click_App_Store();
//		Thread.sleep(5000);
//	}
//
//
//	@Then("^check the title and verify the App Store site in new window$")
//	public void check_the_title_and_verify_the_App_Store_site_in_new_window() throws Throwable {
//
//		Thread.sleep(5000);
//		playstore.check_and_verify_the_title_and_the_App_Store_site_in_new_window();
//		Thread.sleep(5000);
//	}
//
//
//	@When("^user clicks on Google Play icon image$")
//	public void user_clicks_on_Google_Play_icon_image() throws Throwable {
//
//		playstore.click_Google_Play();
//		Thread.sleep(5000);
//	}
//
//	@Then("^check the title and verify the Google Play site in new window$")
//	public void check_the_title_and_verify_the_Google_Play_site_in_new_window() throws Throwable {
//
//		Thread.sleep(3000);
//		playstore.check_and_verify_the_title_and_the_Google_Play_site_in_new_window();
//		Thread.sleep(2000);
//		
//	}
//
	//Search
//
//	@When("^user click from the Item List$")
//	public void user_click_from_the_Item_List() throws Throwable
//	{
//		search = new Search_PF(driver);
//		search.ItemList(driver);
//		Thread.sleep(2000);
//
//	}
//
//
	@And("^user click on Search and enters \"([^\"]*)\"$")
	public void user_click_on_Search_and_enters(String Keyword) throws Throwable
	{
		search.enterKeyword(Keyword);
		Thread.sleep(2000);
	}
//
//	@When("^user click on Calories Toggle Button$")
//	public void user_click_on_Calories_Toggle_Button() throws Throwable
//	{
//		search.Calories_Toggle_Button(driver);
//		Thread.sleep(2000);
//	}
//
//	@When("^user click on Veg Only Toggle Button$")
//	public void user_click_on_Veg_Only_Toggle_Button() throws Throwable
//	{
//		search.Veg_Only_Toggle_Button(driver);
//		Thread.sleep(1000);
//	}
//
//	//customization
//	@When("^click on Add\\+ button$")
//	public void click_on_Add_button() throws Throwable {
//
//		customize = new Customization_PF(driver);
//		customize.Add();
//		System.out.println("Mc Aloo tikki burger is added");
//		Thread.sleep(2000);    
//	}
//
//	@Then("^customization list should be displayed$")
//	public void customization_list_should_be_displayed() throws Throwable {
//
//		String mainWindowHandle = driver.getWindowHandle();
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		Iterator<String> iterator = allWindowHandles.iterator();
//
//		while (iterator.hasNext()) {
//
//			String childWindow = iterator.next();
//			if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
//				driver.switchTo().window(childWindow);
//				String title = driver.getTitle();
//				System.out.println("Page title = " + title);
//			}
//		
//		}
//		Thread.sleep(2000);
//
//	
//	}
//
//
//
//	@Then("^user should be able to customize items$")
//	public void user_should_be_able_to_customize_items() throws Throwable {
//
//		customize.customize_items();
//		System.out.println("Customization is done");
//		Thread.sleep(3000);
//
//	}
//
//	@And("^Add to cart$")
//	public void add_to_cart() throws Throwable {
//
//		customize.Add_to_cart();
//		System.out.println("Customized items is added to the cart");
//		Thread.sleep(2000);
//	}
//
//	//Cart
//	@Then("^user click on View Cart$")
//	public void user_click_on_View_Cart() throws Throwable {
//		cart = new Cart_PF(driver);
//		cart.clickView_Cart();
//			Thread.sleep(1000);
//	}
//	@And("^user click on \\+ to add item$")
//	public void user_click_on_to_add_item() throws Throwable {
//		cart.clickAdd();
//	Thread.sleep(1000);
//	}
//
//	@And("^user click on pay button$")
//	public void user_click_on_pay_button() throws Throwable {
//		cart.clickPay();
//		cart.clickMore();
//		cart.clickCash_on_Delivery();
//		Thread.sleep(2000);
//	}
//
//	@Then("^user closes the window$")
//	public void user_closes_the_window() throws Throwable {
//		driver.close();
//	}
}