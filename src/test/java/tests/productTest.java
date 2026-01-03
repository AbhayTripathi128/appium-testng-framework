package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import flows.Appflows;
import pages.ProductPage;

public class productTest extends BaseClass{
	@Test
	public void ProductTest() throws Exception {
		
		Appflows flows = new Appflows(driver);
		ProductPage product = new ProductPage(driver);
		flows.loginToProductPage();
		flows.productToCartPage();
		
		Assert.assertTrue(product.cartCount(), "Product is not addedd to the cart");
	}
	
}
