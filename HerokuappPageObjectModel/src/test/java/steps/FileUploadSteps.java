package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.FileUploadPage;

public class FileUploadSteps {

    private static FileUploadPage fileUploadPage;

    @Step("User uploads an image")
    public static void uploadFile(WebDriver driver) {
        fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();
        fileUploadPage.uploadFile();
        fileUploadPage.getFileName();
        fileUploadPage.clickUpload();
    }
}
