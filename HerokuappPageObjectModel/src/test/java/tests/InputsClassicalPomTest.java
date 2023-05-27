package tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputsPage;
import utilities.TestDataGenerator;


public class InputsClassicalPomTest extends BaseTest {

    @Test
    public void inputNegativeTest() {
        InputsPage inputPage = new InputsPage(driver);
        inputPage.openInputsPage();
        inputPage.inputNegativeNumber();
    }

    @Test(dataProvider = "testData")
    public void inputPositiveTest(int randomNumber) {
        InputsPage inputPage = new InputsPage(driver);
        inputPage.openInputsPage();
        inputPage.inputPositiveNumber(randomNumber);
    }

    @DataProvider(name = "testData")
    public Object[][] inputForTask() {
        return new Object[][]{
                {TestDataGenerator.getRandomNumber(),}
        };
    }
}
