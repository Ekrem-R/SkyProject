package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Deals')]")
    public WebElement deals;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/button[2]")
    public WebElement acceptCookies;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signinButton;

    @FindBy(xpath = "//header/div[@id='masthead-navigation']/div[1]/div[1]/div[2]/button[1]/*[1]")
    public WebElement searchBar;

    @FindBy(xpath = "//header/div[@id='masthead-navigation']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement enterElementInSearchBar;

    @FindBy(xpath = "//div[@id='search-results-container']")
    public WebElement editorialSection;


}
