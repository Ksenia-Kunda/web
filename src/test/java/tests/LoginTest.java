package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import utils.Listener;


/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
@Listeners({Listener.class})
public class LoginTest extends BaseTest {

    @Parameters({ "LoginName", "Password" })
    @Test
    @TestCaseId("1")
    @Features("login")
    @Stories("Verify the ability to login to e-mail")
    public void testLogin(String loginName, String password) {
        Assert.assertTrue(startPage.goToLoginPage().login(loginName, password).isWriteNewLetterButtonDisplayed());
    }
}
