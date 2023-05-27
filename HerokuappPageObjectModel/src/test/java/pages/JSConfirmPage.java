package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.PageUrls.ALERTS_PAGE;

public class JSConfirmPage extends BasePage {
    private final By JS_CONFIRM = By.xpath("//button[text()=\"Click for JS Confirm\"]");

    public JSConfirmPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public void clickJSConfirm() {
        WebElement jSConfirm = driver.findElement(JS_CONFIRM);
        jSConfirm.click();
    }

    public String getJSConfirmText() {
        String javaScriptConfirmText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return javaScriptConfirmText;
    }
}
