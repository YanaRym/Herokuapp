package tests.withSteps;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;
import steps.DroppableSteps;
import tests.BaseTest;

public class DroppableWithStepsTest extends BaseTest {

    @Test
    @Description("Dragging an object and dropping it")
    public void droppableTest() {
        DroppableSteps.dragAndDropObject(driver);
        DroppablePage droppablePage = new DroppablePage(driver);
        Assert.assertTrue(droppablePage.newTextDisplayed(), "Error.");
    }
}
