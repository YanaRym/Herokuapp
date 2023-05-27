package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.PageUrls.ALERTS_PAGE;

public class AlertsPage extends BasePage {

    private final By JS_ALERT = By.xpath("//button[text()=\"Click for JS Alert\"]");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public void clickJSAlert() {
        WebElement jSAlert = driver.findElement(JS_ALERT);
        jSAlert.click();
    }

    public String getJSAlertText() {
        String javaScriptAlertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return javaScriptAlertText;
    }
}
