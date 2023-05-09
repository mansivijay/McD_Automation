package pageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cart_PF {


	@FindBy( how = How.XPATH , using = "//button[normalize-space()='View Cart']")
	WebElement btn_View_Cart;
	@FindBy( how = How.XPATH , using = "//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[1]/button[2]")
	WebElement btn_Add;

	@FindBy(how = How.XPATH, using = "//div[@class='cart-footer']")
	WebElement btn_Pay;
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='More']")
	WebElement btn_More;

	@FindBy(how = How.XPATH, using = "//div[@class='payment-option-saved-info']")
	WebElement btn_Cash_on_Delivery;
	WebDriver driver;

	public Cart_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	}

	public void clickView_Cart() {
		btn_View_Cart.click();
	}

	public void clickAdd() {
		btn_Add.click();
	}

	public void clickPay() {
		btn_Pay.click();
	}
	public void clickMore() {
		btn_More.click();
	}
	public void clickCash_on_Delivery() {
		btn_Cash_on_Delivery.click();
	}

}	

