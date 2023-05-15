package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.PageUrls.TYPOS_PAGE;
import static constants.PagesInfo.CORRECT_TEXT;

public class TyposPage extends BasePage {

    protected final By TEXT = By.xpath("//p[contains(text(), *)][2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(TYPOS_PAGE);
    }

    public String getText() {
        String text = driver.findElement(TEXT).getText();
        return (text);
    }

    public boolean textHasTypo(String text) {
        boolean isCorrect = CORRECT_TEXT.equals(text);
        return (isCorrect);
    }
}
