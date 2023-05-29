package tests;


import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;


public class SortableDataTablesBusinessPomTest extends BaseTest {

    @Test
    @Description("Name and surname are correct")
    public static void namesMatchTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        Assert.assertTrue(sortableDataTablesPage.namesMatch(), "Invalid data.");
    }

    @Test
    @Description("Due and website are correct")
    public static void dueWebMatchTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        Assert.assertTrue(sortableDataTablesPage.dataMatch(), "Invalid data.");
    }
}
