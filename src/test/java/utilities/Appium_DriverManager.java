package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.util.concurrent.TimeUnit;

public class Appium_DriverManager{
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null)
            if (ConfigReader.getProperty("platform").equalsIgnoreCase("android")) {
                UiAutomator2Options options = new UiAutomator2Options()
                        .setPlatformName(ConfigReader.getProperty("platformName"))
                        .setPlatformVersion(ConfigReader.getProperty("platformVersion"))
                        .setDeviceName(ConfigReader.getProperty("deviceName"))
                        .setAutomationName("UiAutomator2")
                        //.setAppPackage(ConfigReader.getProperty("appPackage"))
                        //.setAppActivity(ConfigReader.getProperty("appActivity"))
                        .setApp(ConfigReader.getProperty("app"))
                        .setUdid(ConfigReader.getProperty("udid"))
                        .setSkipUnlock(Boolean.parseBoolean(ConfigReader.getProperty("skipUnlock")))
                        .setNoReset(Boolean.parseBoolean(ConfigReader.getProperty("noReset")))
                        .setFullReset(Boolean.parseBoolean(ConfigReader.getProperty("fullReset")));
                options.setCapability("enableMultiWindows", Boolean.parseBoolean(ConfigReader.getProperty("enableMultiWindows")));

                driver = new AndroidDriver(options);
            }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        //for accept alerts
//        HashMap<String, Object> appAlerts = new HashMap<String, Object>();
//        appAlerts.put("autoAcceptAlerts", "true"); //to accept all alerts
//        //for dismiss alerts
//        HashMap<String, Object> appAlerts = new HashMap<String, Object>();
//        appAlerts.put("autoDismissAlerts", "true"); //to dismiss all alerts
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
