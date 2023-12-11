package stepdefinitions.Web_Definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebPages.HomePage;
import utilities.Web_DriverManager;

public class W_CookiesDef {
    HomePage homePage = new HomePage();

    @Given("User verifies that Cookies popup is visible.")
    public void user_verifies_that_cookies_popup_is_visible() {
        Assert.assertTrue(homePage.cookiesField.isDisplayed());
    }
    @Given("User accesses the cookie policy.")
    public void user_accesses_the_cookie_policy() {
        try {
            homePage.cookiePolicy.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookiePolicy);
        }
    }
    @Given("User verify access to cookie policy page.")
    public void user_verify_access_to_cookie_policy_page() {
        Assert.assertTrue(homePage.cookiePolicyTitle.isDisplayed());
    }

    @Given("User clicks cookies setting.")
    public void user_clicks_cookies_setting() {
        try {
            homePage.cookieSettings.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieSettings);
        }
        homePage.wait(5);
    }
    @Given("User verifies that Cookies Settings popup is visible.")
    public void user_verifies_that_cookies_settings_popup_is_visible() {homePage.wait(5);
        Assert.assertTrue(homePage.cookieSettingsTitle.isDisplayed());
    }
    @Given("User clicks Daha Fazla Bilgi button in cookie settings.")
    public void user_clicks_daha_fazla_bilgi_button_in_cookie_settings() {
        homePage.otherWindow(homePage.cookieMoreInfo);
    }
    @Given("User verify cookies policy page in new tab.")
    public void user_verify_cookies_policy_page_in_new_tab() {
        Assert.assertTrue(homePage.cookiePolicyTitle.isDisplayed());
    }
    @Given("User closes cookies policy tab.")
    public void user_closes_cookies_policy_tab() {
        homePage.closeWindow();
    }
    @Given("User clicks on Hedefleme Amacli Tanimlama Bilgileri field.")
    public void user_clicks_on_hedefleme_amacli_tanimlama_bilgileri_field() {
        try {
            homePage.cookieNotNecessary.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNotNecessary);
        }
        homePage.wait(3);
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_hedefleme_amacli_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertFalse(homePage.cookieNotNecessaryTrue.isDisplayed());
    }
    @Given("User clicks Hedefleme Amacli Tanimlama Bilgileri cookie button.")
    public void user_clicks_hedefleme_amacli_tanimlama_bilgileri_cookie_button() {
        try {
            homePage.cookieNotNecessaryButton.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNotNecessaryButton);
        }
        homePage.wait(3);
    }
    @Given("User turns on Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_on_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertTrue(homePage.cookieNotNecessaryButton.isSelected());
    }
    @Given("User turns off Hedefleme Amacli Tanimlama Bilgileri cookie.")
    public void user_turns_off_hedefleme_amacli_tanimlama_bilgileri_cookie() {
        Assert.assertFalse(homePage.cookieNotNecessaryButton.isSelected());
    }
    @Given("User clicks on Zorunlu Tanimlama Bilgileri field.")
    public void user_clicks_on_zorunlu_tanimlama_bilgileri_field() {
        try {
            homePage.cookieNecessary.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieNecessary);
        }
        homePage.wait(3);
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been opened.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_opened() {
        Assert.assertTrue(homePage.cookieNecessaryTrue.isDisplayed());
    }
    @Given("User verify that Tumunu Kabul et button is not visible.")
    public void user_verify_that_tumunu_kabul_et_button_is_not_visible() {
        Assert.assertFalse(homePage.cookieAcceptAll.isDisplayed());
    }
    @Given("User verify that Zorunlu Tanimlama Bilgileri field detail has been closed.")
    public void user_verify_that_zorunlu_tanimlama_bilgileri_field_detail_has_been_closed() {
        Assert.assertFalse(homePage.cookieNecessaryTrue.isDisplayed());
    }
    @Given("User clicks Cerez Ayarlarimi Kaydet button in cookie settings.")
    public void user_clicks_cerez_ayarlarimi_kaydet_button_in_cookie_settings() {
        homePage.cookieSettingsAccept.click();
        homePage.wait(3);
    }
    @Given("User clicks Tumunu Kabul Et button in cookie settings.")
    public void user_clicks_tumunu_kabul_et_button_in_cookie_settings() {
        homePage.cookieAcceptAll.click();
        homePage.wait(3);
    }
    @Given("User verify that Cookies Settings popup is not visible.")
    public void user_verify_that_cookies_settings_popup_is_not_visible() {
        Assert.assertFalse(homePage.cookieSettingsTitle.isDisplayed());
    }
    @Given("User verify that Cookies popup is not visible.")
    public void user_verify_that_cookies_popup_is_not_visible() {
        homePage.wait(3);
        Assert.assertFalse(homePage.cookiesField.isDisplayed());
    }
    @Given("User clicks cookie settings close button.")
    public void user_clicks_cookie_settings_close_button() {
        homePage.cookieSettingsClose.click();
    }
    @Given("User verify that Cookies Settings popup is visible.")
    public void user_verify_that_cookies_settings_popup_is_visible() {
        Assert.assertTrue(homePage.cookieSettingsTitle.isDisplayed());
    }
    @Given("User verify that Cookies popup is visible.")
    public void user_verify_that_cookies_popup_is_visible() {
        Assert.assertTrue(homePage.cookiesField.isDisplayed());
    }
    @Given("User clicks Kabul Et button in cookies popup.")
    public void user_clicks_kabul_et_button_in_cookies_popup() {
        try {
            homePage.cookieAccept.click();
        }
        catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) Web_DriverManager.driver;
            executor.executeScript("arguments[0].click();", homePage.cookieAccept);
        }
    }
}