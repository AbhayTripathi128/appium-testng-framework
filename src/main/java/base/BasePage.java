package base;
import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import io.appium.java_client.android.AndroidDriver;
import utils.GesturesUtils;
import utils.WaitUtils;

public class BasePage {
	
	protected AndroidDriver driver;
	protected WaitUtils wait;	
	public GesturesUtils gestures;
    protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	public BasePage(AndroidDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver, 10);
		this.gestures = new GesturesUtils(driver);
	}
	
	protected void click(By locator) {
		log.info("Clicking on element: {}", locator);
		wait.waitForElementClickable(locator).click();
	}
	
	protected void type(By locator, String text) {
		 log.info("Typing '{}' into element: {}", text, locator);
		wait.waitForElementVisible(locator).sendKeys(text);
		driver.hideKeyboard();
	}
	
	protected String getText(By locator) {
		return wait.waitForElementVisible(locator).getText();
	}
	
	protected boolean isDisplayed(By locator) {
		return wait.waitForElementVisible(locator).isDisplayed();
	}	
}
