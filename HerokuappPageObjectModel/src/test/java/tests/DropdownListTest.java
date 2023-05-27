package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownListPage;

import static constants.PagesInfo.OPTION_ONE_TEXT;
import static constants.PagesInfo.OPTION_TWO_TEXT;

public class DropdownListTest extends BaseTest {

    @Test
    public void optionOneSelectTest() {
        DropdownListPage dropdownList = new DropdownListPage(driver);
        dropdownList.openDropdownPage();
        dropdownList.selectOptionOne();
        Assert.assertTrue(dropdownList.optionOneIsSelected().equals(OPTION_ONE_TEXT));
    }

    @Test
    public void optionTwoSelectTest() {
        DropdownListPage dropdownList = new DropdownListPage(driver);
        dropdownList.openDropdownPage();
        dropdownList.selectOptionTwo();
        Assert.assertTrue(dropdownList.optionTwoIsSelected().equals(OPTION_TWO_TEXT));
    }
}
