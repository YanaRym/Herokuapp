package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSConfirmPage;

import static constants.PagesInfo.JS_CONFIRM_TEXT;

public class JSConfirmTest extends BaseTest {

    @Test
    @Description("Check JS confirm alert")
    public void javaScriptConfirmAlertIsShown() {
        JSConfirmPage jSConfirm = new JSConfirmPage(driver);
        jSConfirm.openAlertsPage();
        jSConfirm.clickJSConfirm();
        boolean jSConfirmAlertIsShown = JS_CONFIRM_TEXT.equals(jSConfirm.getJSConfirmText());
        Assert.assertTrue(jSConfirmAlertIsShown, "Alert error.");
    }
}
