package tests.withSteps;

import org.testng.annotations.Test;
import steps.DropdownSteps;
import tests.BaseTest;

public class DropdownListWithStepsTest extends BaseTest {

    @Test
    public void dropdownListTest() {
        DropdownSteps.selectOptionOneAndTwo(driver);
    }
}
