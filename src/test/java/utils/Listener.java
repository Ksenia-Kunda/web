package utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.AfficheTest;
import tests.LoginTest;

/**
 * Created by Kseniya_Kunda on 7/20/2017.
 */
public class Listener implements ITestListener {

    static Logger log = Logger.getLogger(Listener.class);


    @Override
    public void onTestStart(ITestResult iTestResult) {
        log.info("Start test: " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.info("Test result: SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.info("Test result: FAIL");
        log.info(iTestResult.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        log.info("TEST CLASS finish: " + iTestContext.getName());
    }
}
