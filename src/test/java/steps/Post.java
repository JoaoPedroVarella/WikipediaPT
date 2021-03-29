package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Post extends Base{
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Given("^that you access wikipedia in portugues$")
    public void thatYouAccessWikipediaInPortugues() {
        base.driver.get(base.url);
    }

    @When("^search for \"([^\"]*)\"$")
    public void searchFor(String arg0) {
        base.driver.findElement(By.id("searchInput")).sendKeys(arg0 + Keys.ENTER);
    }

    @Then("^displays the expression \"([^\"]*)\" in the title of the tab$")
    public void displaysTheExpressionInTheTitleOfTheTab(String arg0) {
        assertTrue(base.driver.getTitle().contains(arg0));
    }
}
