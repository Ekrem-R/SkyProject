package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
  @Before
  public void setUp() {
       System.out.println("calling driver");
       Driver.getDriver().manage().window().maximize();
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      Driver.getDriver().switchTo().frame("sp_message_iframe_474555");
      Driver.getDriver().findElement(By.xpath("//*[@id='notice']/div[3]/button[2]")).click();
      Driver.getDriver().switchTo().defaultContent();


   }

   @After
  public void tearDown(Scenario scenario) {
      final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

       if (scenario.isFailed()) {
          scenario.attach(screenshot, "image/png", "ScreenShot ");

      }
       Driver.closeDriver();
   }
}
