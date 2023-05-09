package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location_PF {

	public WebDriver driver;

	
	
	
	// change button
	@FindBy(css =".text-font .change-btn")
	WebElement btn_change;

	// write address in search bar
	@FindBy(xpath = "//input[@id='menu-search']")
	WebElement txt_address;

	// button of entered address
	@FindBy(xpath = "//div[contains(text(),'Medical Square Bus Stop')]")
	WebElement btn_address;

	// Done button
	@FindBy(xpath = "//button[normalize-space()='Done']")
	WebElement btn_done;

	// writing house number
	@FindBy(xpath = "//input[@id='building']")
	WebElement txt_houseno;

	// home button
	@FindBy(xpath = "//p[@class='activeOption']")
	WebElement btn_home;

	// save button
	@FindBy(xpath = "//button[normalize-space()='Save and Select Address']")
	WebElement btn_save;
	

	public Location_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void change() {
		btn_change.click();
	}
	
	public void enterAddress() {
		txt_address.sendKeys("Medical Square Nagpur Bus Stop");
	}

	public void clickAddress() {
		btn_address.click();
	}

	public void clickDone() {
		btn_done.click();
	}

	public void enterHouseNo() {
		txt_houseno.sendKeys("55");
	}

	public void clickHome() {
		btn_home.click();
	}

	public void clickSave() {
		btn_save.click();
	}

}
