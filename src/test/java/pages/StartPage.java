package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.BaseTest;

import java.util.List;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class StartPage extends BasePage {

    private static final String MAIL = "Почта";

    @FindBy(css = "#mainmenu>.b-topbar-i li")
    private List<WebElement> menuButtons;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        clickOnMenu(MAIL);
        return new LoginPage(driver);
    }

    private void clickOnMenu(String menuButtonName) {
        for (WebElement menuButton: menuButtons) {
            if (menuButton.getText().equals(menuButtonName)){
                menuButton.click();
            }
        }
    }


}
