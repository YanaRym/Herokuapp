package tests.withSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import steps.FileUploadSteps;
import tests.BaseTest;

public class FileUploadWithStepsTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        FileUploadSteps.uploadFile(driver);
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        Assert.assertTrue(fileUploadPage.getFileName().equals(fileUploadPage.getUploadedFileName()), "Upload error.");
    }
}
