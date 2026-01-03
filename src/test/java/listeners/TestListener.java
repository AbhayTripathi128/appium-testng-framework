package listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener{

	private static final Logger log =
            LoggerFactory.getLogger(TestListener.class);

	@Override
    public void onTestFailure(ITestResult result) {
		log.error("TEST FAILED: {}", result.getMethod().getMethodName());
        Object testClass = result.getInstance();

        if (testClass instanceof BaseClass) {
            BaseClass base = (BaseClass) testClass;
            ScreenshotUtils.takeScreenshot(
                    base.getDriver(),
                    result.getMethod().getMethodName()
            );
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
    	log.info("STARTING TEST: {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	log.info("TEST PASSED: {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	log.error("TEST SKIPPED: {}", result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {}
	
}
