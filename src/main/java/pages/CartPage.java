package pages;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class CartPage extends BasePage {

	public CartPage(AndroidDriver driver) {
		super(driver);
	}
	
	private By totalAmount = By.id("com.androidsample.generalstore:id/totalAmountLbl");
	private By cartTitle = By.id("com.androidsample.generalstore:id/toolbar_title");
	
	
	public boolean isCartTitleDisplayed() {
	    return isDisplayed(cartTitle);
	}
	
	public String getTotalAmount() {
		return getText(totalAmount);
	}
	
	
}
