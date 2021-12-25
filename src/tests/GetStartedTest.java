package tests;

import lib.CoreTestCase;
import lib.Platform;
import org.junit.Test;
import ui.WelcomePageObject;

public class GetStartedTest extends CoreTestCase
{

    @Test
    public void testPastThrowWelcome()
    {
        if (Platform.getInstance().isAndroid()) {
            return;
        }
        WelcomePageObject WelcomePage = new WelcomePageObject(driver);

        WelcomePage.waitForLearnMoreLink();
        WelcomePage.clickNextButton();

        WelcomePage.waitForNewWayToExploreText();
        WelcomePage.clickNextButton();

        WelcomePage.waitForAddOrEditPreferredLangText();
        WelcomePage.clickNextButton();

        WelcomePage.waitForLearnMoreAboutDataCollectedText();
        WelcomePage.clickGetStartedButton();
    }
}
