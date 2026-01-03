package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataproviders.TestDataProvider;
import flows.Appflows;
import pages.ProductPage;

public class productTest extends BaseClass{
	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void ProductTest(String country, String name, String gender, String[] products) throws Exception {
		
		Appflows flows = new Appflows(driver);
		ProductPage product = flows.loginToProductPage(country, name, gender);
		for(String productName: products) {
			flows.productToCartPage(productName);
		}
		
		Assert.assertTrue(product.cartCount(), "Product is not addedd to the cart");
	}
	
}

