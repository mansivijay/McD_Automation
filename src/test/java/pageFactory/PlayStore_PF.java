package pageFactory;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayStore_PF {
public WebDriver driver;
	
	@FindBy(xpath = "//img[contains(@src,'https://images.mcdelivery.co.in/hardcastle-restaurants-pvt-ltd/image/upload/v1591261952/NewWebsiteResource2020/Assets/Img/Appstore.svg')]")
	WebElement img_App_Store;
	
	@FindBy(xpath = "//img[contains(@src,'https://images.mcdelivery.co.in/hardcastle-restaurants-pvt-ltd/image/upload/v1591261944/NewWebsiteResource2020/Assets/Img/Playstore.svg')]")
	WebElement img_Google_Play;
	
	
	public PlayStore_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_App_Store() {
		img_App_Store.click();
	}
	
	public void check_and_verify_the_title_and_the_App_Store_site_in_new_window() {
		
	
		//Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				String title = driver.getTitle();
				System.out.println("Page title 2 = " + title);
				driver.close();
			
			}
		}
		driver.switchTo().window(mainWindowHandle);
	}
	
	
	public void click_Google_Play() {
		img_Google_Play.click();
	}	

	public void check_and_verify_the_title_and_the_Google_Play_site_in_new_window() 
	{
		//Get handles of the windows
				String mainWindowHandle = driver.getWindowHandle();
				Set<String> allWindowHandles = driver.getWindowHandles();
				Iterator<String> iterator = allWindowHandles.iterator();

				// Here we will check if child window has other child windows and will fetch the heading of the child window
				while (iterator.hasNext()) {
					String ChildWindow = iterator.next();
					if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
						driver.switchTo().window(ChildWindow);
						String title1 = driver.getTitle();
						System.out.println("Page title 3 = " + title1);
						driver.close();
					}
				}
				driver.switchTo().window(mainWindowHandle);
	}
}
