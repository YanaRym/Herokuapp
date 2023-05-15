package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;


public class CheckboxesClassicalPomTest extends BaseTest {

    @Test
    public void checkBox1UncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.checkbox1IsChecked(), "Checkbox 1 is selected");
    }

    @Test
    public void checkBox1CheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickCheckbox1();
        Assert.assertTrue(checkboxesPage.checkbox1IsChecked(), "Checkbox 1 isn't selected");
    }

    @Test
    public void checkBox2CheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.checkbox2IsChecked(), "Checkbox 2 isn't selected");
    }

    @Test
    public void checkbox2UncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickCheckbox2();
        Assert.assertFalse(checkboxesPage.checkbox2IsChecked(), "Checkbox 2 is selected");
    }
}
