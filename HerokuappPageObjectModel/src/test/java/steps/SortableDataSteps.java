package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.SortableDataTablesPage;

public class SortableDataSteps {

    private static SortableDataTablesPage sortableDataTablesPage;

    @Step
    public static void dataMatch(WebDriver driver) {
        sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.namesMatch();
        sortableDataTablesPage.dataMatch();
    }
}
