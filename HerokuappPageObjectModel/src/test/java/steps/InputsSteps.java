package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.InputsPage;
import utilities.TestDataGenerator;

public class InputsSteps {

    private static InputsPage inputsPage;

    @Step("User inputs numbers")
    public static void inputNumbers(WebDriver driver) {
        inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.inputNegativeNumber();
        inputsPage.inputPositiveNumber(TestDataGenerator.getRandomNumber());
    }
}
