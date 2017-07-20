package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class MailPage extends BasePage {

    @FindBy(css = ".mail-ComposeButton-Text")
    private WebElement writeNewLetterButton;

    public MailPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isWriteNewLetterButtonDisplayed() {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(writeNewLetterButton));
        return writeNewLetterButton.isDisplayed();
    }


}
