package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Appium_DriverManager;

public class iOSPages {
    public iOSPages(){
        PageFactory.initElements(Appium_DriverManager.getDriver(),this);
    }
}
