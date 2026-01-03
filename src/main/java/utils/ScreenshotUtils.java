package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import io.appium.java_client.android.AndroidDriver;

public class ScreenshotUtils {
	
	public static String takeScreenshot(AndroidDriver driver, String testName) {
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenShotPath = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timeStamp + ".png";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(screenShotPath);
		
		try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return screenShotPath;
		
	}
	
	
}
