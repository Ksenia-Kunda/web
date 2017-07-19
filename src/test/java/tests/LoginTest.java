package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Base64;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class LoginTest extends BaseTest {

    @Parameters({ "LoginName", "Password" })
    @Test
    public void testLogin(String loginName, String password) {
        startPage.goToLoginPage().login(loginName, password);
    }


}
