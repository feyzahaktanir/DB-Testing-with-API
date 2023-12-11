Feature: US004 - User Logins

  @US004TC01 @US004
  Scenario: TC01 - User should be able to access the user login page.
    Given User goes to homepage.
    * User clicks Giris Yap veya Uye Ol button in homepage.
    * User clicks Giris Yap button in homapage.
    * User verify that Giris Yap Title is visible.
    * User closes the browser.

  @US004TC02 @US004
  Scenario: TC02 - User cannot login with wrong username.
    Given User goes to log in page.
    * User "WrongUsername" enters in Username textbox.
    * User clicks Giris Yap button in login page.
    * User verifies that wrong username alert is visible.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in login page.
    * User verifies that Password page is visible.
    * User closes the browser.

  @US004TC03 @US004
  Scenario: TC03 - User cannot login with wrong password.
    Given User goes to log in page.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in login page.
    * User "WrongPassword" enters in Password textbox.
    * User clicks Giris Yap button in password page.
    * User verifies that wrong password alert is visible.
    * User closes the browser.

  @US004TC04 @US004
  Scenario: TC04 - User can login successfully with correct user informations.
    Given User goes to log in page.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in login page.
    * User "ValidPassword" enters in Password textbox.
    * User clicks Giris Yap button in password page.
    * User verifies that logged in.
    * User closes the browser.