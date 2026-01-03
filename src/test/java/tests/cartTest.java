package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import flows.Appflows;
import pages.CartPage;

public class cartTest extends BaseClass{
	
	@Test
	public void CartTest() throws Exception {
		
		Appflows flows = new Appflows(driver);
		CartPage cart = new CartPage(driver);
		flows.loginToProductPage();
		flows.productToCartPage();
		flows.goToCartPage();
		
		Assert.assertTrue(cart.isCartTitleDisplayed(), "Cart title is not displayed");
	}
	
	
}
