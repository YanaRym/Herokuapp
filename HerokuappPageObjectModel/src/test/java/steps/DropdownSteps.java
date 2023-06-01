package steps;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DropdownListPage;
import utilities.AllureTool;

public class DropdownSteps {

    private static DropdownListPage dropdownListPage;

    @Step("User selects different options")
    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] selectOptionOneAndTwo(WebDriver driver){
        dropdownListPage = new DropdownListPage(driver);
        dropdownListPage.openDropdownPage();
        dropdownListPage.selectOptionOne();
        dropdownListPage.optionOneIsSelected();
        dropdownListPage.selectOptionTwo();
        dropdownListPage.optionTwoIsSelected();
        AllureTool allureTool = new AllureTool();
        return allureTool.makeScreenshot(driver);
    }
}
