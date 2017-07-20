package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import utils.Listener;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
@Listeners({Listener.class})
public class AfficheTest extends BaseTest{

    @Test
    @TestCaseId("2")
    @Features("affiche")
    @Stories("Verify the ability to open affiche page")
    public void TestAfficheSection() {
        Assert.assertEquals(startPage.goToAffichePage().getPageTitle(), "Афиша Минска: развлечения, мероприятия, куда сходить?");
    }
}
