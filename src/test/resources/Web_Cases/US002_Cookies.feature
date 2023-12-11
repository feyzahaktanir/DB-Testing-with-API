Feature: US002 - User can accept or reject cookies.

  @US002TC01 @US002 @jenkins
  Scenario: TC01 - User should be able to access the cookie policy.
    Given User goes to homepage.
    * User verifies that Cookies popup is visible.
    * User accesses the cookie policy.
    * User verify access to cookie policy page.
    * User closes the browser.

  @US002TC02 @US002 @jenkins
  Scenario: TC02 - User changes and saves cookie settings.
    Given User goes to homepage.
    * User clicks cookies setting.
    * User verifies that Cookies Settings popup is visible.
    * User clicks Hedefleme Amacli Tanimlama Bilgileri cookie button.
    * User turns on Hedefleme Amacli Tanimlama Bilgileri cookie.
    * User verify that Tumunu Kabul et button is not visible.
    * User clicks Hedefleme Amacli Tanimlama Bilgileri cookie button.
    * User turns off Hedefleme Amacli Tanimlama Bilgileri cookie.
    * User clicks Cerez Ayarlarimi Kaydet button in cookie settings.
    * User verify that Cookies Settings popup is not visible.
    * User verify that Cookies popup is not visible.
    * User closes the browser.

  @US002TC03 @US002 @jenkins
  Scenario: TC03 - User accepts all cookies.
    Given User goes to homepage.
    * User clicks cookies setting.
    * User clicks Tumunu Kabul Et button in cookie settings.
    * User verify that Cookies Settings popup is not visible.
    * User verify that Cookies popup is not visible.
    * User closes the browser.

  @US002TC04 @US002 @jenkins
  Scenario: TC04 -  User accesses actions on cookie settings.
    Given User goes to homepage.
    * User clicks cookies setting.
    * User clicks Daha Fazla Bilgi button in cookie settings.
    * User verify cookies policy page in new tab.
    * User closes cookies policy tab.
    * User clicks on Hedefleme Amacli Tanimlama Bilgileri field.
    * User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been opened.
    * User clicks on Hedefleme Amacli Tanimlama Bilgileri field.
    * User verify that Hedefleme Amacli Tanimlama Bilgileri field detail has been closed.
    * User clicks on Zorunlu Tanimlama Bilgileri field.
    * User verify that Zorunlu Tanimlama Bilgileri field detail has been opened.
    * User clicks on Zorunlu Tanimlama Bilgileri field.
    * User verify that Zorunlu Tanimlama Bilgileri field detail has been closed.
    * User closes the browser.

  @US002TC05 @US002 @jenkins
  Scenario: TC05 -  User closes cookie settings popup.
    Given User goes to homepage.
    * User clicks cookies setting.
    * User clicks cookie settings close button.
    * User verify that Cookies Settings popup is visible.
    * User verify that Cookies popup is visible.
    * User closes the browser.

  @US002TC06 @US002 @jenkins
  Scenario: TC06 -  User accepts cookies.
    Given User goes to homepage.
    * User clicks Kabul Et button in cookies popup.
    * User verify that Cookies popup is not visible.
    * User closes the browser.