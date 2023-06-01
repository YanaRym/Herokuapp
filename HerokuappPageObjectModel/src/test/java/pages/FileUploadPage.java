package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

import static constants.PageUrls.FILE_UPLOAD_PAGE;

public class FileUploadPage extends BasePage {

    private final By FILE_UPLOAD = By.id("file-upload");
    private final By UPLOAD_BUTTON = By.id("file-submit");
    private final By FILE_NAME = By.xpath("//div[@id=\"uploaded-files\"]");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(FILE_UPLOAD_PAGE);
    }

    public void uploadFile() {
        WebElement uploadInput = driver.findElement(FILE_UPLOAD);
        uploadInput.sendKeys(System.getProperty("user.dir").concat("/src/test/java/resources/Screenshot.png"));
    }

    public String getFileName() {
        File file = new File(System.getProperty("user.dir").concat("/src/test/java/resources/Screenshot.png"));
        return file.getName();
    }

    public void clickUpload() {
        WebElement uploadButton = driver.findElement(UPLOAD_BUTTON);
        uploadButton.click();
    }

    public String getUploadedFileName() {
        WebElement uploadedFileName = driver.findElement(FILE_NAME);
        return uploadedFileName.getText();
    }
}
