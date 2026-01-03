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
	
	public void loginToProductPage() {
		loginPage.openCountry("Dominica");
		loginPage.enterName("Bryan");
		loginPage.genderSelect("Female");
		loginPage.shopButtonClick();
	} 
	
	public void productToCartPage() {
		productPage.isTitleDisplayed();
		productPage.addToCartProduct("Air Jordan 1 Mid SE");
		productPage.gestures.scrollToText("PG 3");
		productPage.addToCartProduct("PG 3");
	}
	
	public void goToCartPage() {
		productPage.goToCart();
		String total = cartPage.getTotalAmount();
		System.out.println(total);
		
	}
	
}
	
