package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestDataGenerator;

import static constants.PageUrls.ALERTS_PAGE;

public class JSPromptPage extends BasePage {

    private final By JS_PROMPT = By.xpath("//button[text()=\"Click for JS Prompt\"]");

    public JSPromptPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public void clickJSPrompt() {
        WebElement jSPrompt = driver.findElement(JS_PROMPT);
        jSPrompt.click();
    }

   /* public String getRandomText() {
        String randomText = TestDataGenerator.getRandomAlertText();
        return randomText;
    }

    public void inputJSPromptText() {
        driver.switchTo().alert().sendKeys(getRandomText());
        driver.switchTo().alert().accept();
    }

    public boolean alertTextIsDisplayed() {
        WebElement result = driver.findElement(By.xpath("//p[contains(text(), '" + getRandomText() + "')]"));
        return result.isDisplayed();
    } */

    public void inputJSPromptText() {
        driver.switchTo().alert().sendKeys("Check");
        driver.switchTo().alert().accept();
    }

    public boolean alertTextIsDisplayed() {
        WebElement result = driver.findElement(By.xpath("//p[contains(text(), 'Check')]"));
        return result.isDisplayed();
    }
}
