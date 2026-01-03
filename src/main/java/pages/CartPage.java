package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class CartPage extends BasePage {

	public CartPage(AndroidDriver driver) {
		super(driver);
	}
	
	private By productPrices = By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']");
	private By totalAmount = By.id("com.androidsample.generalstore:id/totalAmountLbl");
	private By cartTitle = By.id("com.androidsample.generalstore:id/toolbar_title");
	
	
	public boolean isCartTitleDisplayed() {
	    return isDisplayed(cartTitle);
	}
	
	public String getTotalAmount() {
		return getText(totalAmount);
	}
	
	public double getSumofProducts() {
		double sum = 0.0;
		List <WebElement> prices = driver.findElements(productPrices);
		for(WebElement price : prices) {
			String amount = price.getText();
			amount = amount.replace("$", "").trim();
			sum += Double.parseDouble(amount);
		}
		return sum;
	}
	
	public double getTotalAmountvalue() {
		String total = getText(totalAmount);
		total = total.replace("$", "").trim();
		return Double.parseDouble(total);
	}
	
	
	
}
