package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/div[1]/div/div/input")
    public WebElement email;

    @FindBy(xpath = "//*[@id='app-component']/div/main/div/div[3]/button/span")
    public WebElement continueButton;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signinButton;
}
