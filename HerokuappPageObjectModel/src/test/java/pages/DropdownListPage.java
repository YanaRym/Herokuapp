package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static constants.PageUrls.DROPDOWN_LIST_PAGE;

public class DropdownListPage extends BasePage {
    private final By DROPDOWN = By.id("dropdown");

    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownPage() {
        driver.get(DROPDOWN_LIST_PAGE);
    }

    public void selectOptionOne() {
        WebElement dropdownList = driver.findElement(DROPDOWN);
        Select select = new Select(dropdownList);
        select.selectByValue("1");
    }

    public String optionOneIsSelected() {
        Select select = new Select(driver.findElement(DROPDOWN));
        return select.getFirstSelectedOption().getText();
    }

    public void selectOptionTwo() {
        Select select = new Select(driver.findElement(DROPDOWN));
        select.selectByValue("2");
    }

    public String optionTwoIsSelected() {
        Select select = new Select(driver.findElement(DROPDOWN));
        return select.getFirstSelectedOption().getText();
    }
}
