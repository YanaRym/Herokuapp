package tests;


import jdk.jfr.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputsPage;
import utilities.TestDataGenerator;


public class InputsClassicalPomTest extends BaseTest {

    @Test
    @Description("Input negative number")
    public void inputNegativeTest() {
        InputsPage inputPage = new InputsPage(driver);
        inputPage.openInputsPage();
        inputPage.inputNegativeNumber();
    }

    @Test(dataProvider = "testData")
    @Description("Input positive number")
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
