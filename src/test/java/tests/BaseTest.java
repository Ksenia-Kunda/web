package tests;

import driver.ChromeDriverHandler;
import driver.DriverFactory;
import driver.FirefoxDriverHandler;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.StartPage;
import utils.CommandLineHandler;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class BaseTest {

    protected WebDriver driver;
    protected static StartPage startPage;

    @BeforeMethod
    public void initDriver() {
        CommandLineHandler handler = CommandLineHandler.getHandler();
        driver = DriverFactory.getDriver(handler.getBrowserName());
        driver.get(handler.getUrl());
        startPage = new StartPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.closeDriver();
        ChromeDriverHandler.close();
        FirefoxDriverHandler.close();
        driver = null;
    }
}
