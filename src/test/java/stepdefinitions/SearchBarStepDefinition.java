package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.HomePage;

public class SearchBarStepDefinition extends BasePage {
    HomePage homePage=new HomePage();

    @When("I search ‘sky’ in the search bar")
    public void iSearchSkyInTheSearchBar() throws InterruptedException {
        homePage.searchBar.click();
        Thread.sleep(2000);
    }

    @Then("I should see an editorial section.")
    public void iShouldSeeAnEditorialSection() {
        typeText(homePage.enterElementInSearchBar,"Sky");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(homePage.editorialSection.isDisplayed());
    }
}
