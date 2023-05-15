package tests;


import org.testng.annotations.Test;
import pages.InputsPage;


public class InputsClassicalPomTest extends BaseTest {

    @Test
    public void inputNegativeTest() {
        InputsPage inputPage = new InputsPage(driver);
        inputPage.openInputsPage();
        inputPage.inputNegativeNumber();
    }

    @Test
    public void inputPositiveTest() {
        InputsPage inputPage = new InputsPage(driver);
        inputPage.openInputsPage();
        inputPage.inputPositiveNumber();
    }
}
