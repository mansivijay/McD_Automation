package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class Login_PF {
	WebDriver driver;
	
	@FindBy(how =How.XPATH, using = "//div[@title =\"View Profile\"]//app-icon[@class = \"avatar__icon\"]//img")
	WebElement btn_view_profile;
	
	@FindBy(how = How.XPATH , using = "//h1[@class =\"profile-page__loginText cursor-pointer\"]")
     WebElement btn_login_signup;
	
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'cursor-pointer width-menu pr-4 title-text')]")
     WebElement btn_loginViaPassword;
    
    @FindBy(how = How.XPATH, using = "//input[@class=\"input icon-input ng-untouched ng-pristine ng-invalid\"]")
     WebElement txt_mobno;
    
    @FindBy(how = How.XPATH, using = "//input[@id='password']")
     WebElement txt_password;
    
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
     WebElement btn_login;
    
    @FindBy(how =How.XPATH, using = "//button[@class=\"app-btn primary\"]")
    WebElement btn_verify_mobile;
    
    public Login_PF(WebDriver driver) {       
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
    
    
    public void login_signup() {
        btn_login_signup.click();
    }    
    
    public void loginViaPassword() {
        btn_loginViaPassword.click();
    }
    
    public void mobno() {
		txt_mobno.click();
        txt_mobno.sendKeys("9001068452");
    }
    
    public void password() {
        txt_password.sendKeys("Mansi@123");
    }
    
    public void clickLogin() {
        btn_login.click();
    }
	public void view_profile() {
		
		btn_view_profile.click();
		
	}


	public void verify_mobile() {
		// TODO Auto-generated method stub
		btn_verify_mobile.click();
	}


	

}
