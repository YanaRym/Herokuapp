package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;


public class CheckboxesClassicalPomTest extends BaseTest {

    @Test
    @Description("Box one is unchecked")
    public void checkBox1UncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.checkbox1IsChecked(), "Checkbox 1 is selected");
    }

    @Test
    @Description("Box one is checked")
    public void checkBox1CheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickCheckbox1();
        Assert.assertTrue(checkboxesPage.checkbox1IsChecked(), "Checkbox 1 isn't selected");
    }

    @Test
    @Description("Box two is checked")
    public void checkBox2CheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.checkbox2IsChecked(), "Checkbox 2 isn't selected");
    }

    @Test
    @Description("Box two is unchecked")
    public void checkbox2UncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickCheckbox2();
        Assert.assertFalse(checkboxesPage.checkbox2IsChecked(), "Checkbox 2 is selected");
    }
}
