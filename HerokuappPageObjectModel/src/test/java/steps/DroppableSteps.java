package steps;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DroppablePage;
import utilities.AllureTool;

public class DroppableSteps {

    private static DroppablePage droppablePage;

    @Step("User drags an object and drops it")
    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] dragAndDropObject(WebDriver driver) {
        droppablePage = new DroppablePage(driver);
        droppablePage.openDroppable();
        droppablePage.dragAndDrop();
        AllureTool allureTool = new AllureTool();
        return allureTool.makeScreenshot(driver);
    }
}
