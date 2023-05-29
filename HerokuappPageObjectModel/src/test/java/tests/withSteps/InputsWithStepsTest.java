package tests.withSteps;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import steps.InputsSteps;
import tests.BaseTest;

public class InputsWithStepsTest extends BaseTest {

    @Test
    @Description("User inputs positive and negative numbers")
    public void inputPositiveAndNegativeNumbers() {
        InputsSteps.inputNumbers(driver);
    }
}
