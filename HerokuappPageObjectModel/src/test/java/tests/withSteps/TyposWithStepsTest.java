package tests.withSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;
import steps.TyposSteps;
import tests.BaseTest;

public class TyposWithStepsTest extends BaseTest {

    @Test
    public void hasTypos() {
        TyposSteps.hasTypo(driver);
        TyposPage typosPage = new TyposPage(driver);
        Assert.assertTrue(typosPage.textHasTypo(typosPage.getText()), "The sentence contains a typo.");
    }
}
