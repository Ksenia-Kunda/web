package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class ChromeDriverHandler {

    private static final String PATH_TO_DRIVER = "\\src\\test\\java\\resources\\chromedriver.exe";

    private static WebDriver driver;
    private static volatile ChromeDriverHandler handler;

    private ChromeDriverHandler() {
        setLocation();
        driver = new ChromeDriver();
    }

    public static ChromeDriverHandler initHandler() {
        if (handler == null) {
            synchronized(ChromeDriverHandler.class){
                if (handler == null){
                    handler = new ChromeDriverHandler();
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
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + PATH_TO_DRIVER);
    }

    private static void setCapabilities() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
