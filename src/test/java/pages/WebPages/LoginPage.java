package pages.WebPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Web_DriverManager;

public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Web_DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "")
    public WebElement wrongUser_Alert;
    @FindBy(xpath = "")
    public WebElement wrongPassword_Alert;
    @FindBy(xpath = "")
    public WebElement signupButton_User;
    @FindBy(xpath = "")
    public WebElement signupButton_Password;
    @FindBy(xpath = "")
    public WebElement passwordPage;
    @FindBy(xpath = "")
    public WebElement passwordText;
    @FindBy(xpath = "")
    public WebElement userText;
    @FindBy(xpath = "//a[@id=\"login\"]")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@id=\"btnLogin\"]")
    public WebElement loginTitle;

}