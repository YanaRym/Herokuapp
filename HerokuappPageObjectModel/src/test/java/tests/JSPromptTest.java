package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSPromptPage;

public class JSPromptTest extends BaseTest {
    @Test
    @Description("Check JS prompt alert")
    public void jSPromptTextIsShown() {
        JSPromptPage jSPrompt = new JSPromptPage(driver);
        jSPrompt.openAlertsPage();
        jSPrompt.clickJSPrompt();
        // jSPrompt.getRandomText();
        jSPrompt.inputJSPromptText();
        Assert.assertTrue(jSPrompt.alertTextIsDisplayed(), "Alert error.");
    }
}
