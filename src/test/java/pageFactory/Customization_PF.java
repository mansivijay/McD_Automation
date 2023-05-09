package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Customization_PF {
	 
	
	    @FindBy(how = How.ID , using = "menu-search")
	    WebElement txt_search;
	    
	    @FindBy(how = How.ID , using = "menu-search")
	    WebElement txt_selectItem;
	    
	    @FindBy(how = How.XPATH, using = "//body/app-root/div[contains(@class,'aahaar')]/div[@id='aahaar-wrapper']/app-home-page/div[@id='home-page-wrapper']/div[@class='menu-section']/app-search-items/div/div[@class='menu-popup cursor-pointer']/div[@class='content-section']/div/app-menu-items/div[@class='cursor-pointer items']/app-menu-item[1]/div[1]/div[1]/div[1]/app-price-section[1]/div[1]/div[1]")
	    WebElement btn_Add;
	    
	    @FindBy(how = How.XPATH, using = "//label[@for='00']")
	    WebElement btn_customize_items;
	    
	    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Add to Cart']")
	    WebElement btn_Add_to_cart;
	    
	    WebDriver driver;
	    
	    public Customization_PF(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	     public void search() {
	         txt_search.click();
	     }
	     
	    public void selectItem() {
	        txt_selectItem.sendKeys("Burger");
	    }    
	    
	    public void Add() {
	        btn_Add.click();
	    }
	    
	    public void customize_items() {
	        btn_customize_items.click();
	    }
	    
	    public void Add_to_cart() {
	        btn_Add_to_cart.click();
	    }
	}