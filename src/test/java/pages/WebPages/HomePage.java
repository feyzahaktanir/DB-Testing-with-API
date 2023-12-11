package pages.WebPages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Web_DriverManager;

public class HomePage {

    public HomePage (){
        PageFactory.initElements(Web_DriverManager.getDriver(),this);
    }

    @FindBy (xpath = "//a[@title=\"Hepsiburada\"]")
    public WebElement hbLogo;

    //Cookies definitions ---------------------------------------------------------

    //@homepage
    @FindBy(id = "onetrust-group-container")
    public WebElement cookiesField;
    @FindBy(xpath = "//a[text()=\"Çerez Politikası\"]")
    public WebElement cookiePolicy;
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookieAccept;
    @FindBy(id = "onetrust-pc-btn-handler")
    public WebElement cookieSettings;
    @FindBy(id = "ot-pc-title")
    public WebElement cookieSettingsTitle;
    @FindBy(xpath = "//a[@class=\"privacy-notice-link\"]")
    public WebElement cookieMoreInfo;
    @FindBy(id = "accept-recommended-btn-handler")
    public WebElement cookieAcceptAll;
    @FindBy(xpath = "//button[@aria-controls=\"ot-desc-id-C0004\"]")
    public WebElement cookieNotNecessary;
    @FindBy(id = "ot-desc-id-C0004")
    public WebElement cookieNotNecessaryTrue;
    @FindBy(id = "ot-group-id-C0004")
    public WebElement cookieNotNecessaryButton;
    @FindBy(xpath = "//button[@aria-labelledby=\"ot-header-id-C0001\"]")
    public WebElement cookieNecessary;
    @FindBy(id = "ot-desc-id-C0001")
    public WebElement cookieNecessaryTrue;
    @FindBy(xpath = "//button[text()=\"Çerez ayarlarımı kaydet\"]")
    public WebElement cookieSettingsAccept;
    @FindBy(id = "close-pc-btn-handler")
    public WebElement cookieSettingsClose;

    //@cookiespolicypage
    @FindBy(xpath = "//h2[text()=\"Çerez Politikası\"]")
    public WebElement cookiePolicyTitle;

    //-----------------------------------------------------------------------------



    //Wait Class ------------------------------------------------------------------
    public void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------



    //Connection Privacy Error ----------------------------------------------------
    @FindBy(id = "details-button")
    public WebElement AdvancedButton;
    @FindBy(id = "proceed-link")
    public WebElement ProceedtoSite;

    public void connectionPrivacy(){
        try {
            if(AdvancedButton.isDisplayed()){
                AdvancedButton.click();
                ProceedtoSite.click();
            }
        } catch (NoSuchElementException ex){
            if ( !(ex instanceof NoSuchElementException) ) {throw ex; }
        }
    }
    //-----------------------------------------------------------------------------



    //WindowHandle Class ----------------------------------------------------------
    public void otherWindow ( WebElement webElement) {
        String originalWindow = Web_DriverManager.driver.getWindowHandle();
        //assert Driver.driver.getWindowHandles().size() == 1;
        Assert.assertEquals(1, Web_DriverManager.driver.getWindowHandles().size());
        webElement.click(); //buton üzerinden geçiş classı

        for (String windowHandle : Web_DriverManager.driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                Web_DriverManager.driver.switchTo().window(windowHandle);
                break;
            }
        }
        Assert.assertEquals(2, Web_DriverManager.driver.getWindowHandles().size());
    }
    //-----------------------------------------------------------------------------



    //WindowHandle Back Class -----------------------------------------------------
    public  void closeWindow (){
        String originalWindow = Web_DriverManager.driver.getWindowHandle();
        Assert.assertEquals(2, Web_DriverManager.driver.getWindowHandles().size());
        String prevWindow = "";
        for (String windowHandle : Web_DriverManager.driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                prevWindow = windowHandle;
            }
        }
        Web_DriverManager.closeDriver();

        Web_DriverManager.driver.switchTo().window(prevWindow);
        Assert.assertEquals(1, Web_DriverManager.driver.getWindowHandles().size());
    }
    //-----------------------------------------------------------------------------



    //Sign Up Locations -----------------------------------------------------------
    @FindBy(xpath = "//div[@id=\"myAccount\"]")
    public WebElement loginOrSignup;
    @FindBy(xpath = "//a[@id=\"register\"]")
    public WebElement signupButton;
    @FindBy(xpath = "//button[@id=\"btnSignUpSubmit\"]")
    public WebElement signupTitle;
//    @FindBy()
//    public WebElement cookiePolicyTitle;
//    @FindBy()
//    public WebElement cookiePolicyTitle;
    //TODO: yarım kaldı tamamlanacak.

    //-----------------------------------------------------------------------------



    //Login Locations -----------------------------------------------------------


    //-----------------------------------------------------------------------------
}