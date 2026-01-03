package pages;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage extends BasePage{
	
	public ProductPage(AndroidDriver driver) {
		super(driver);
	}
	
	private By titleTest = By.id("com.androidsample.generalstore:id/toolbar_title");
	private By cartIcon = By.id("com.androidsample.generalstore:id/appbar_btn_cart");
	private By cartCount = By.id("com.androidsample.generalstore:id/counterText");
	
	
	public boolean isTitleDisplayed() {
	    return isDisplayed(titleTest);
	}
	
	
	public void addToCartProduct(String Product) {
		click(By.xpath(
		        "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName' " +
		                "and @text='" + Product + "']" +
		                "/following-sibling::android.widget.LinearLayout" +
		                "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"
		            ));
	}
	
	public boolean cartCount() {
		return isDisplayed(cartCount);
	}
	
	public void goToCart() {
		click(cartIcon);
	}
	
}
