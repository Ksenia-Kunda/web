package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class LoginPage extends BasePage{

    @FindBy(css = "#Username")
    private WebElement loginInput;

    @FindBy(css = "#Password")
    private WebElement passwordInput;

    @FindBy(css = "div>.button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private void putLogin(String userName) {
        loginInput.sendKeys(userName);
    }

    private void putPassword(String password) {
        passwordInput.sendKeys(password);
    }

    private void submit() {
        loginButton.click();
    }

    public MailPage login(String userName, String password) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        putLogin(userName);
        putPassword(password);
        submit();
        return goToMailPage();
    }


    public MailPage goToMailPage() {
        return new MailPage(driver);
    }
}
