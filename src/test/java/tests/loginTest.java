package tests;

import listeners.TestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import dataproviders.TestDataProvider;
import flows.Appflows;
import pages.ProductPage;

@Listeners(TestListener.class)
public class loginTest extends BaseClass{
	
	
	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void shouldBeLogin(String country, String name, String gender, String[] products) {	
		
		Appflows flows = new Appflows(driver);
		ProductPage product = flows.loginToProductPage(country, name, gender);

		Assert.assertTrue(product.isTitleDisplayed(), "Title is not displayed");
	}	
}


