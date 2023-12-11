package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Appium_DriverManager;

public class AndroidPages {
    public AndroidPages(){
        PageFactory.initElements(Appium_DriverManager.getDriver(),this);
    }
    @FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permissionAllow;
    @FindBy(id = "com.pozitron.hepsiburada:id/image_message_of_day")
    public WebElement homepageLogo;


    //Advertise Locates------------------------------------------------------------
    @FindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_modal")
    public WebElement ad;
    @FindBy(id = "com.pozitron.hepsiburada:id/com_braze_inappmessage_modal_close_button")
    public WebElement ad_close;
    //-----------------------------------------------------------------------------


    //Wait Class ------------------------------------------------------------------
    public void wait(int seconds){
        try { Thread.sleep(seconds*1000);;}
        catch (InterruptedException e) { e.printStackTrace(); }
    }
    //-----------------------------------------------------------------------------
}
