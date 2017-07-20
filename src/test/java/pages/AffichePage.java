package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Kseniya_Kunda on 7/20/2017.
 */
public class AffichePage extends BasePage {

    public AffichePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
