package driver;

import org.openqa.selenium.WebDriver;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                driver = ChromeDriverHandler.initHandler().getDriver();
                break;
            case "firefox":
                driver = FirefoxDriverHandler.initHandler().getDriver();
                break;
            default:
                System.out.println("Browser name is not correct. Firefox is chosen as a default browser.");
                driver = FirefoxDriverHandler.initHandler().getDriver();
                break;
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }


}
