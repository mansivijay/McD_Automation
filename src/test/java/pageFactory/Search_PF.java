package pageFactory;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search_PF 
{
	WebDriver driver;


	@FindBy(how = How.XPATH, using = "//div[@class='col-2-menu col-height']")
	WebElement ItemList;

	@FindBy(how=How.XPATH, using = "//input[@class=\"input bg-white-version\"]")
	WebElement txt_searchfrommenu;

	@FindBy(how = How.XPATH, using = "//div[@class='toggle-section']//div[@class='calorie-filter']//span[@class='slider round ']")
	WebElement btn_Calories_Toggle_Button_ON;

	@FindBy(how = How.XPATH, using = "//div[@class='toggle-section']//div[@class='calorie-filter']//span[contains(@class,'slider round')]")
	WebElement btn_Calories_Toggle_Button_OFF;

	@FindBy(how = How.XPATH, using = "//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")
	WebElement btn_Veg_Only_Toggle_Button_ON;

	@FindBy(how = How.XPATH, using = "//div[@class='toggle-section']//div[@class='veg-filter']//span[contains(@class,'slider round')]")
	WebElement	btn_Veg_Only_Toggle_Button_OFF;

	public Search_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	public void ItemList(WebDriver driver) throws InterruptedException {
//		WebElement ItemList = driver.findElement(By.xpath("//div[@class='col-2-menu col-height']"));
//		List<WebElement> categoryList = ItemList.findElements(By.tagName("div"));
//		java.util.Iterator<WebElement> listOfCategory = categoryList.iterator();
//		Thread.sleep(2000); 
//
//		//if(driver.findElement(By.xpath("//span[normalize-space()='Trending']")).isSelected())
//		//{
//		while(listOfCategory.hasNext()) 
//		{
//			WebElement category = listOfCategory.next();
//			category.click();
//			//System.out.println(category.getText() + " is Selected");
//			Thread.sleep(2000);
//		}
//	}


		public void enterKeyword(String keyword) {
			txt_searchfrommenu.click();
			txt_searchfrommenu.sendKeys(keyword);
		}


		public void Calories_Toggle_Button(WebDriver driver) throws InterruptedException {
			btn_Calories_Toggle_Button_OFF.click();
			Thread.sleep(2000);
			btn_Calories_Toggle_Button_ON.click();
		}
		public void Veg_Only_Toggle_Button(WebDriver driver) throws InterruptedException {
			btn_Veg_Only_Toggle_Button_OFF.click();
			Thread.sleep(2000);
			btn_Veg_Only_Toggle_Button_ON.click();
		}
	}
