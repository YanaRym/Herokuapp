package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.PageUrls.SORTABLE_DATA_TABLES_PAGE;
import static constants.PagesInfo.*;

public class SortableDataTablesPage extends BasePage {


    private final By FIRST_NAME = By.xpath("//table[@id='table1']/tbody/tr[2]/td[2]");
    private final By LAST_NAME = By.xpath("//table[@id='table1']/tbody/tr[2]/td[1]");
    private final By WEB = By.xpath("//tr[2]/td[@class='web-site']");
    private final By DUE = By.xpath("//tr[2]/td[@class='dues']");

    public SortableDataTablesPage(WebDriver driver) {
        super(driver);
    }

    public boolean namesMatch() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        String firstName = driver.findElement(FIRST_NAME).getText();
        String lastName = driver.findElement(LAST_NAME).getText();
        boolean lastNameIsEqual = EXPECTED_LAST_NAME.equals(lastName);
        boolean firstNameIsEqual = EXPECTED_FIRST_NAME.equals(firstName);
        return (lastNameIsEqual && firstNameIsEqual);
    }

    public boolean dataMatch() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        String due = driver.findElement(DUE).getText();
        String web = driver.findElement(WEB).getText();
        boolean dueIsEqual = EXPECTED_DUE.equals(due);
        boolean webIsEqual = EXPECTED_WEB.equals(web);
        return (dueIsEqual && webIsEqual);
    }


}
