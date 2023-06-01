package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Screenshoter {

    public static void takeScreenshot(WebDriver driver) {
        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        byte[] screenshotInBytes = takeScreenshot.getScreenshotAs(OutputType.BYTES);
        try {
            Files.write(Paths.get("src/test/java/resources/screenshots/screenshot.png"), screenshotInBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
