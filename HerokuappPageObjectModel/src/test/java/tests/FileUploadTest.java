package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    @Description("User uploads a file")
    public void uploadFile() {
        FileUploadPage fileUpload = new FileUploadPage(driver);
        fileUpload.openFileUploadPage();
        fileUpload.uploadFile();
        fileUpload.clickUpload();
        Assert.assertTrue(fileUpload.getFileName().equals(fileUpload.getUploadedFileName()), "Upload error.");
    }
}
