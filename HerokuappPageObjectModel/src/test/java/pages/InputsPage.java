package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestDataGenerator;

import static constants.PageUrls.INPUTS_PAGE;

public class InputsPage extends BasePage {

    private final By INPUT_FIELD = By.cssSelector("[type='number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(INPUTS_PAGE);
    }

    public void inputNegativeNumber() {
        WebElement inputsField = driver.findElement(INPUT_FIELD);
        int number = TestDataGenerator.getRandomNumber();
        for (int i = 0; i < number; i++) {
            inputsField.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public void inputPositiveNumber() {
        WebElement inputsField = driver.findElement(INPUT_FIELD);
        int number = TestDataGenerator.getRandomNumber();
        for (int i = 0; i < number; i++) {
            inputsField.sendKeys(Keys.ARROW_UP);
        }
    }
}
