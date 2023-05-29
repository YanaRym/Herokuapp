package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.CheckboxesPage;

public class CheckboxesSteps {

    private static CheckboxesPage checkboxesPage;

    @Step("User selects the boxes")
    public static void selectCheckboxes(WebDriver driver) {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickCheckbox1();
        checkboxesPage.checkbox1IsChecked();
        checkboxesPage.clickCheckbox2();
        checkboxesPage.checkbox2IsChecked();

    }

}
