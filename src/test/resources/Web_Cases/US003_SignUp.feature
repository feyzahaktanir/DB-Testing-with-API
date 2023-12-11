Feature: US003 - User Sign Up

  @US003TC01 @US003
  Scenario: TC01 - User should be able to access the user sign up page.
    Given User goes to homepage.
    * User clicks Giris Yap veya Uye Ol button in homepage.
    * User clicks Uye Ol button in homepage.
    * User verify that Uye Ol page title is visible.
    * User closes the browser.

  @US003TC02 @US003
  Scenario: TC02 - User must verify email that fill for signup.
    Given User goes to homepage.
    * User goes to sign up page.
    * User closes the browser.


  @US003TC03 @US003
  Scenario: TC03 - User cannot signup with miss informations.
    Given User goes to homepage.
    * User goes to sign up page.
    * User closes the browser.