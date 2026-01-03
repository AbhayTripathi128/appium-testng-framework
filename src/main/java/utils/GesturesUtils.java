package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GesturesUtils {
	
	protected AndroidDriver driver;
	
	public GesturesUtils(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void scrollToText(String text) {
	    driver.findElement(
	        AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true))" +
	            ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))"
	        )
	    );
	 }
}
