package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownListPage;

import static constants.PagesInfo.OPTION_ONE_TEXT;
import static constants.PagesInfo.OPTION_TWO_TEXT;

public class DropdownListTest extends BaseTest {

    @Test
    @Description("Select option one")
    public void optionOneSelectTest() {
        DropdownListPage dropdownList = new DropdownListPage(driver);
        dropdownList.openDropdownPage();
        dropdownList.selectOptionOne();
        Assert.assertTrue(dropdownList.optionOneIsSelected().equals(OPTION_ONE_TEXT));
    }

    @Test
    @Description("Select option two")
    public void optionTwoSelectTest() {
        DropdownListPage dropdownList = new DropdownListPage(driver);
        dropdownList.openDropdownPage();
        dropdownList.selectOptionTwo();
        Assert.assertTrue(dropdownList.optionTwoIsSelected().equals(OPTION_TWO_TEXT));
    }
}
