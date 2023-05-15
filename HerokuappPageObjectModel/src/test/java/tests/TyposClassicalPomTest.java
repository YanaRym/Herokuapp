package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;


public class TyposClassicalPomTest extends BaseTest {

    @Test
    public void typosTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.textHasTypo(typosPage.getText()), "The sentence contains a typo.");
    }

}
