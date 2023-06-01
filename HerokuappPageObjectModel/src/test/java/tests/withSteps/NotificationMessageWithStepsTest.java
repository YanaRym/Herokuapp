package tests.withSteps;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagesPage;
import steps.NotificationMessagesSteps;
import tests.BaseTest;

import static constants.PagesInfo.EXPECTED_NOTIFICATION;

public class NotificationMessageWithStepsTest extends BaseTest {

    @Test
    @Description("User gets a notification")
    public static void notificationMessageTest() {
        NotificationMessagesSteps.showNotification(driver);
        NotificationMessagesPage notificationPage = new NotificationMessagesPage(driver);
        boolean isEqual = EXPECTED_NOTIFICATION.equals(notificationPage.getNotificationText());
        Assert.assertTrue(isEqual, "Notification is different");
    }
}
