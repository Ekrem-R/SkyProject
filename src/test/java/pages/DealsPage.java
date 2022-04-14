package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DealsPage {
    public DealsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
