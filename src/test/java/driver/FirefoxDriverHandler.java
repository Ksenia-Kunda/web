package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class FirefoxDriverHandler {

    private static final String PATH_TO_DRIVER = "\\src\\test\\java\\resources\\geckodriver.exe";

    private static WebDriver driver;
    private static volatile FirefoxDriverHandler handler;

    private FirefoxDriverHandler() {
        setLocation();
        driver = new FirefoxDriver();
    }

    public static FirefoxDriverHandler initHandler() {
        if (handler == null) {
            synchronized(FirefoxDriverHandler.class){
                if (handler == null){
                    handler = new FirefoxDriverHandler();
                    setCapabilities();
                }
            }
        }
        return handler;
    }

    public WebDriver getDriver() {
        return driver;
    }

    private static void setLocation() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + PATH_TO_DRIVER);
    }

    private static void setCapabilities() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
