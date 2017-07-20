package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class StartPage extends BasePage {

    private static final String MAIL = "Почта";
    private static final String SECTIONS = "Разделы";
    private static final String AFFICHE = "Афиша";

    @FindBy(css = "#mainmenu>.b-topbar-i li")
    private List<WebElement> menuButtons;

    @FindBy(css = ".b-topbar-more-list>li")
    private List<WebElement> sections;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        clickOnMenu(MAIL);
        return new LoginPage(driver);
    }

    public AffichePage goToAffichePage() {
        clickOnMenu(SECTIONS);
        choseSection(AFFICHE);
        return new AffichePage(driver);
    }

    private void choseSection(String sectionName) {
        for (WebElement section: sections) {
            if (section.getText().equals(sectionName)){
                section.click();
                break;
            }
        }
    }

    private void clickOnMenu(String menuButtonName) {
        for (WebElement menuButton: menuButtons) {
            if (menuButton.getText().equals(menuButtonName)){
                menuButton.click();
                break;
            }
        }
    }


}
