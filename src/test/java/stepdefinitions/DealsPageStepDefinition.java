package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.HomePage;
import utilities.Driver;
import java.util.List;

public class DealsPageStepDefinition extends BasePage {
    HomePage homePage=new HomePage();
    WebDriver driver;
    @When("I navigate to ‘Deals’ on home page")
    public void iNavigateToDealsOnHomePage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(homePage.deals);


    }



    @Then("the user should be on the {string}")
    public void theUserShouldBeOnThe(String arg0) {
        String expected="Latest Sky TV deals for new customers | Sky.com";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);
    }


    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        homePage.deals.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I see a list of deals with a price to it \\(see Snapshot B)")
    public void iSeeAListOfDealsWithAPriceToItSeeSnapshotB() {

        List<WebElement> allPrices=Driver.getDriver().findElements(By.xpath("//div/div/span[1]"));
        for(WebElement price:allPrices){

            System.out.print(price.getText());
        }
        System.out.println();
        String[] actual1= allPrices.get(0).getText().split(",");
        System.out.println(actual1[1]);

        String[] actual2= allPrices.get(1).getText().split(",");
        System.out.println(actual2[1]);

        String[] actual3= allPrices.get(2).getText().split(",");
        System.out.println(actual3[1]);

        String expected1="£26";
        String expected2="£46";
        String expected3="£38";
        Assert.assertEquals(expected1,actual1[1].toString().trim());
        Assert.assertEquals(expected2,actual2[1].toString().trim());
        Assert.assertEquals(expected3,actual3[1].toString().trim());

        // 2. Way
//        List<WebElement> allPrices = Driver.getDriver().findElements(By.xpath("//span[contains(@id,'price.offer')]"));
//        System.out.println(allPrices.size());
//        ArrayList<String> Expected = new ArrayList<String>();
//        Expected.add("£26");
//        Expected.add("£46");
//        Expected.add("£38");
//        Expected.add("£32");
//        Expected.add("£26");
//        List<String> allActualValues = new ArrayList<>();
//        for (WebElement price : allPrices) {
//
//            String[] actualValues = price.getText().split(",");
//            for (int i = 0; i < 2; i++) {
//
//                if (i == 1) {
//                    System.out.println("value" + i + "=" + actualValues[i].trim());
//                    allActualValues.add(actualValues[i].trim());
//                }
//            }
//        }
//        System.out.println(allActualValues);
//        Assert.assertEquals(allActualValues,Expected);
//
//    }



    }



}
