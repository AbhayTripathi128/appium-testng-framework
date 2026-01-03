package utils;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class WaitUtils {
	
	private WebDriverWait wait;

    public WaitUtils(AndroidDriver driver, int Timeout) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
    }
	
	public WebElement waitForElementVisible(By Locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	public WebElement waitForElementClickable(By Locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
	
}
