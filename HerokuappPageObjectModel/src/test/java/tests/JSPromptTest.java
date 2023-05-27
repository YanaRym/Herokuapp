package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSPromptPage;

public class JSPromptTest extends BaseTest {
    @Test
    public void jSPromptTextIsShown() {
        JSPromptPage jSPrompt = new JSPromptPage(driver);
        jSPrompt.openAlertsPage();
        jSPrompt.clickJSPrompt();
        // jSPrompt.getRandomText();
        jSPrompt.inputJSPromptText();
        Assert.assertTrue(jSPrompt.alertTextIsDisplayed(), "Alert error.");
    }
}
