package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;

public class DroppableTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppable();
        droppablePage.dragAndDrop();
        Assert.assertTrue(droppablePage.newTextDisplayed(), "Error.");
    }
}
