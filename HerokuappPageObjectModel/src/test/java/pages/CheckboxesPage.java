package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.PageUrls.CHECKBOXES_PAGE;

public class CheckboxesPage extends BasePage {
    private final By CHECKBOX1 = By.xpath("(//input)[1]");
    private final By CHECKBOX2 = By.xpath("(//input)[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(CHECKBOXES_PAGE);
    }

    public void clickCheckbox1() {
        driver.findElement(CHECKBOX1).click();
    }

    public boolean checkbox1IsChecked() {
        WebElement checkbox1IsSelected = driver.findElement(CHECKBOX1);
        return (checkbox1IsSelected.isSelected());
    }

    public void clickCheckbox2() {
        driver.findElement(CHECKBOX2).click();
    }

    public boolean checkbox2IsChecked() {
        WebElement checkbox2IsSelected = driver.findElement(CHECKBOX2);
        return (checkbox2IsSelected.isSelected());
    }
}
