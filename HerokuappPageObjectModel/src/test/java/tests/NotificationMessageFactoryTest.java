package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagesPage;

import java.util.concurrent.TimeUnit;

import static constants.PagesInfo.EXPECTED_NOTIFICATION;

public class NotificationMessageFactoryTest extends BaseTest {

    @Test
    @Description("The correct notification is shown")
    public static void successMessageIsShownTest() {
        NotificationMessagesPage notificationPage = new NotificationMessagesPage(driver);
        notificationPage.openNotificationMessagesPage();
        notificationPage.clickHereButton();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        boolean isEqual = EXPECTED_NOTIFICATION.equals(notificationPage.getNotificationText());
        Assert.assertTrue(isEqual, "Notification is different");
    }
}
