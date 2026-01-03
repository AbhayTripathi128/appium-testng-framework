package base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	
	public AndroidDriver driver;
	protected static final String APP_PACKAGE = "com.androidsample.generalstore";
	
	public AndroidDriver getDriver() {
	    return driver;
	}
	
	@BeforeClass
	public void serviceStart() throws MalformedURLException, URISyntaxException {
		
		UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Pixel");
			options.setApp("D://Softwares//eclipse//workspace//appiumFramework//src//main//java//resources//General-Store.apk");
		
		
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
	}
	@BeforeMethod(alwaysRun = true)
	public void resetAppBeforeTest() {
	    if (driver != null) {
	        driver.terminateApp(APP_PACKAGE);
	        driver.activateApp(APP_PACKAGE);
	    }
	}
	
}
