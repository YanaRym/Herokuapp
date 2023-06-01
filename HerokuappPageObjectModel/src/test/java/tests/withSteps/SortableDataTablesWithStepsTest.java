package tests.withSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;
import steps.SortableDataSteps;
import tests.BaseTest;

public class SortableDataTablesWithStepsTest extends BaseTest {

    @Test
    public void dataMatch() {
        SortableDataSteps.dataMatch(driver);
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        Assert.assertTrue(sortableDataTablesPage.namesMatch() && sortableDataTablesPage.dataMatch(), "Invalid data.");
    }
}
