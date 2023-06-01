package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.NotificationMessagesPage;

public class NotificationMessagesSteps {

    private static NotificationMessagesPage notificationMessagesPage;

    @Step
    public static void showNotification(WebDriver driver) {
        notificationMessagesPage = new NotificationMessagesPage(driver);
        notificationMessagesPage.openNotificationMessagesPage();
        notificationMessagesPage.clickHereButton();
    }
}
