package pages;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(AndroidDriver driver) {
		super(driver);
	}
	
	private By nameField = By.id("com.androidsample.generalstore:id/nameField");
	private By dropDown = By.id("com.androidsample.generalstore:id/spinnerCountry");
	private By femaleOption = By.id("com.androidsample.generalstore:id/radioFemale");
	private By shopButton = By.id("com.androidsample.generalstore:id/btnLetsShop");
	
	
	
	public void enterName(String name) {
	   type(nameField, name);
	    driver.hideKeyboard();
	}
	
	public void openCountry(String country) {
		click(dropDown);
		gestures.scrollToText(country);
		click(By.xpath("//android.widget.TextView[contains(@text,'" + country + "')]"));
	}
	
	public void genderSelect(String gender) {
		if(gender.equalsIgnoreCase("Female")) {
			click(femaleOption);
		}
		else {
			click(By.id("com.androidsample.generalstore:id/radioMale"));
			
		}
	}
	
	public ProductPage shopButtonClick() {
	    click(shopButton);
	    return new ProductPage(driver);
	}
	
	
	
}
