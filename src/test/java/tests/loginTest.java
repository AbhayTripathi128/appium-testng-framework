package tests;

import listeners.TestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import flows.Appflows;
import pages.ProductPage;

@Listeners(TestListener.class)
public class loginTest extends BaseClass{
	
	
	@Test
	public void shouldBeLogin() {
		Appflows flows = new Appflows(driver);
		ProductPage product = new ProductPage(driver);
		flows.loginToProductPage();
		//Assert.assertTrue(false, "Intentional UI failure");
		Assert.assertTrue(product.isTitleDisplayed(), "Title is not displayed");
	}	
}