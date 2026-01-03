package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import flows.Appflows;
import junit.framework.Assert;
import pages.ProductPage;

public class loginTest extends BaseClass{
	
		
	@Test
	public void shouldBeLogin() {
		Appflows flows = new Appflows(driver);
		ProductPage product = new ProductPage(driver);
		flows.loginToProductPage();
		
		Assert.assertTrue( "Title is not displayed", product.isTitleDisplayed());
	}	
}