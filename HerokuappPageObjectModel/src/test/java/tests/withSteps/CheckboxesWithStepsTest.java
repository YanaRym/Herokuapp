package tests.withSteps;

import org.testng.annotations.Test;
import steps.CheckboxesSteps;
import tests.BaseTest;

public class CheckboxesWithStepsTest extends BaseTest {

    @Test
    public void checkboxesTest() {
        CheckboxesSteps.selectCheckboxes(driver);
    }
}
