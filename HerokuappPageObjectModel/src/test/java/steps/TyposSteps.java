package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.TyposPage;

public class TyposSteps {

    private static TyposPage typosPage;

    @Step
    public static void hasTypo(WebDriver driver) {
        typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        typosPage.getText();
    }
}
