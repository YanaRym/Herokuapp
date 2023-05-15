package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;


public class SortableDataTablesBusinessPomTest extends BaseTest {

    @Test
    public static void namesMatchTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        Assert.assertTrue(sortableDataTablesPage.namesMatch(), "Invalid data.");
    }

    @Test
    public static void dueWebMatchTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        Assert.assertTrue(sortableDataTablesPage.dataMatch(), "Invalid data.");
    }
}
