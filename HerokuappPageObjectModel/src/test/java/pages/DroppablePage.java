package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.PageUrls.DROPPABLE_PAGE;

public class DroppablePage extends BasePage {
    private final By IFRAME = By.className("demo-frame");
    private final By DROPPABLE = By.id("droppable");
    private final By DRAGGABLE = By.id("draggable");

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public void openDroppable() {
        driver.get(DROPPABLE_PAGE);
    }

    public void dragAndDrop() {
        WebElement iframe = driver.findElement(IFRAME);
        driver.switchTo().frame(iframe);
        WebElement draggable = driver.findElement(DRAGGABLE);
        WebElement droppable = driver.findElement(DROPPABLE);
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(draggable, droppable)
                .build()
                .perform();
    }

    public boolean newTextDisplayed() {
        WebElement newText = driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]"));
        return newText.isDisplayed();
    }
}
