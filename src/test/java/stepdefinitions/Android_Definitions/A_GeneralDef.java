package stepdefinitions.Android_Definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AndroidPages;
import utilities.Appium_DriverManager;

public class A_GeneralDef {
    AndroidPages androidPages = new AndroidPages();

    @Given("User allows permissions.")
    public void user_allows_permissions() {
        androidPages.permissionAllow.click();
    }
    @Given("User verifies that advert is visible.")
    public void user_verifies_that_advert_is_visible() {
        androidPages.wait(15);
        Assert.assertTrue(androidPages.ad.isDisplayed());
    }
    @Given("User closes advert.")
    public void user_closes_advert() {
        androidPages.ad_close.click();
    }
    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(androidPages.homepageLogo.isDisplayed());
    }
    @Given("User closes the application.")
    public void user_closes_the_application() {
        Appium_DriverManager.quitDriver();
    }

}