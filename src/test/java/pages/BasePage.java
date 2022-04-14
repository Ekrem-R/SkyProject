package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class BasePage {
    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public void scrollDown(WebElement link){
        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",link);

    }
    public void typeText(WebElement loc, String text) {

        loc.click();
        loc.clear();
        loc.sendKeys(text);
    }

    public void click(WebElement loc){
        loc.click();
    }
}
