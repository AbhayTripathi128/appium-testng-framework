package flows;

import io.appium.java_client.android.AndroidDriver;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class Appflows {
	
	private LoginPage loginPage;
	private ProductPage productPage;	
	private CartPage cartPage;
	
	public Appflows(AndroidDriver driver) {
		this.loginPage = new LoginPage(driver);
		this.productPage = new ProductPage(driver);
		this.cartPage = new CartPage(driver);
		
	}
	
	public ProductPage loginToProductPage(String country, String name, String gender) {
		loginPage.openCountry(country);
		loginPage.enterName(name);
		loginPage.genderSelect(gender);
		return loginPage.shopButtonClick();
	} 
	
	public void productToCartPage(String productName) {
		productPage.isTitleDisplayed();
		productPage.gestures.scrollToText(productName);
		productPage.addToCartProduct(productName);
	}
	
	public void goToCartPage() {
		productPage.goToCart();
		String total = cartPage.getTotalAmount();
		System.out.println(total);
		
	}
	
}
	
