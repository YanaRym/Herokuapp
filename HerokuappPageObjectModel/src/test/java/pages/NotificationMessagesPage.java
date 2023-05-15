package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.PageUrls.NOTIFICATION_MESSAGES_PAGE;

public class NotificationMessagesPage extends BasePageFactory {
    @FindBy(linkText = "Click here")
    private WebElement clickHereButton;

    @FindBy(xpath = "//div[contains(text(), 'Action')]")
    private WebElement notification;

    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagesPage() {
        driver.get(NOTIFICATION_MESSAGES_PAGE);
    }

    public void clickHereButton() {
        clickHereButton.click();
    }

    public String getNotificationText() {
        return (notification.getText());
    }
}
