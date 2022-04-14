package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.HomePage;
import utilities.Driver;

public class LoginStepDefinition extends BasePage {
    HomePage homePage=new HomePage();

    @When("I try to sign in with invalid credentials as {string}")
    public void iTryToSignInWithInvalidCredentialsAs(String arg0) {
        homePage.signinButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement frame=Driver.getDriver().findElement(By.xpath("//iframe[@title='iFrame containing Sky Sign-In application']"));
        Driver.getDriver().switchTo().frame(frame);
        Driver.getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys(arg0);
        Driver.getDriver().findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/button/span")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("I should see a box with the text ‘Create your My Sky password’")
    public void iShouldSeeABoxWithTheTextCreateYourMySkyPassword() {
        String expected="Create your My Sky password";
        String actual=Driver.getDriver().findElement(By.xpath("/html/body/div/div/div/main/div/h1")).getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
}
