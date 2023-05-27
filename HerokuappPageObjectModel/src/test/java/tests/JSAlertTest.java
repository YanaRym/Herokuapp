package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static constants.PagesInfo.JS_ALERT_TEXT;

public class JSAlertTest extends BaseTest {
    @Test
    public static void javaScriptAlertIsShown() {
        AlertsPage alertPage = new AlertsPage(driver);
        alertPage.openAlertsPage();
        alertPage.clickJSAlert();
        boolean alertIsShown = JS_ALERT_TEXT.equals(alertPage.getJSAlertText());
        Assert.assertTrue(alertIsShown, "Alert error.");
    }

}
