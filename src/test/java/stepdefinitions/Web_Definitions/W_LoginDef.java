package stepdefinitions.Web_Definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebPages.HomePage;
import pages.WebPages.LoginPage;
import utilities.ConfigReader;
import utilities.Web_DriverManager;

public class W_LoginDef {

    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    public String username, password;

    @Given("User clicks Giris Yap button in homapage.")
    public void user_clicks_giris_yap_button_in_homapage() {
        loginPage.loginButton.click();
    }
    @Given("User verify that Giris Yap Title is visible.")
    public void user_verify_that_giris_yap_title_is_visible() {
        Assert.assertTrue(loginPage.loginTitle.isDisplayed());
    }
    @Given("User goes to log in page.")
    public void user_goes_to_log_in_page() {
        Web_DriverManager.getDriver().get(ConfigReader.getProperty("homepage"));
        Actions actions = new Actions(Web_DriverManager.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.wait(3);
        loginPage.loginButton.click();
    }
    @Given("User {string} enters in Username textbox.")
    public void user_enters_in_username_textbox(String string) {
        loginPage.userText.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("User clicks Giris Yap veya Uye Ol button in homepage.")
    public void user_clicks_giris_yap_veya_uye_ol_button_in_homepage() {
        Actions actions = new Actions(Web_DriverManager.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.wait(3);
    }
    @Given("User clicks Uye Ol button in homepage.")
    public void user_clicks_uye_ol_button_in_homepage() {
        homePage.signupButton.click();
    }
    @Given("User verify that Uye Ol page title is visible.")
    public void user_verify_that_uye_ol_page_title_is_visible() {
        Assert.assertTrue(homePage.signupTitle.isDisplayed());
    }
    @Given("User goes to sign up page.")
    public void user_goes_to_sign_up_page() {
        Actions actions = new Actions(Web_DriverManager.driver);
        actions.clickAndHold(homePage.loginOrSignup).perform();
        homePage.signupButton.click();
        Assert.assertTrue(homePage.signupTitle.isDisplayed());
    }

    @Given("User clicks Giris Yap button in login page.")
    public void user_clicks_giris_yap_button_in_login_page() {
        loginPage.signupButton_User.click();
    }
    @Given("User verifies that wrong username alert is visible.")
    public void user_verifies_that_wrong_username_alert_is_visible() {
        Assert.assertTrue(loginPage.wrongUser_Alert.isDisplayed());
    }
    @Given("User verifies that Password page is visible.")
    public void user_verifies_that_password_page_is_visible() {
        Assert.assertTrue(loginPage.passwordPage.isDisplayed());
    }

    @Given("User {string} enters in Password textbox.")
    public void user_enters_in_password_textbox(String string) {
        loginPage.passwordText.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks Giris Yap button in password page.")
    public void user_clicks_giris_yap_button_in_password_page() {
        loginPage.signupButton_Password.click();
    }
    @Given("User verifies that wrong password alert is visible.")
    public void user_verifies_that_wrong_password_alert_is_visible() {
        Assert.assertTrue(loginPage.wrongPassword_Alert.isDisplayed());
    }
    @Given("User verifies that logged in.")
    public void user_verifies_that_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}