package stepdefinitions.Web_Definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebPages.HomePage;
import utilities.ConfigReader;
import utilities.Web_DriverManager;

public class W_GeneralDef {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Web_DriverManager.driver);

    @Given("User goes to homepage.")
    public void user_goes_to_homepage() {
        Web_DriverManager.getDriver().get(ConfigReader.getProperty("homepage"));
    }

    @Given("User verifies that hepsiburada logo is visible.")
    public void user_verifies_that_hepsiburada_logo_is_visible() {
        Assert.assertTrue(homePage.hbLogo.isDisplayed());
    }

    @Given("User closes the browser.")
    public void user_closes_the_browser() {
        Web_DriverManager.quitDriver();
    }
}
