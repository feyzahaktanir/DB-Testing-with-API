Feature: US001 - Homepage Accessibility

  @US001TC01 @US001 @jenkins
  Scenario: TC01 - Homepage must be accessible.
    Given User goes to homepage.
    * User verifies that hepsiburada logo is visible.
    * User closes the browser.