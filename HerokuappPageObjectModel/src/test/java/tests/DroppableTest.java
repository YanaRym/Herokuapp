package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;

public class DroppableTest extends BaseTest {

    @Test
    @Description("Drag and drop an object")
    public void dragAndDropTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppable();
        droppablePage.dragAndDrop();
        Assert.assertTrue(droppablePage.newTextDisplayed(), "Error.");
    }
}
