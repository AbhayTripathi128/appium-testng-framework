package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataproviders.TestDataProvider;
import flows.Appflows;
import pages.CartPage;
import pages.ProductPage;

public class cartTest extends BaseClass{
	
	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void CartTest(String country, String name, String gender, String[] products) {
		
		Appflows flows = new Appflows(driver);
		
		ProductPage product = flows.loginToProductPage(country, name, gender);
		for(String productName: products) {
			flows.productToCartPage(productName);
		}
		
		CartPage cart = product.goToCart();
		
		double expectedTotal = cart.getTotalAmountvalue();
		double actualTotal = cart.getSumofProducts();
		
		Assert.assertEquals(actualTotal, expectedTotal, "total amount is not matching");
	}
}
