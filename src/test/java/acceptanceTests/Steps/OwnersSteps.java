package acceptanceTests.Steps;

import acceptanceTests.Base.BaseUtil;
import acceptanceTests.pages.OwnersPage;
import acceptanceTests.pages.VeterinariansPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OwnersSteps {

    private BaseUtil base;
    private OwnersPage page;

    public OwnersSteps(BaseUtil base) {
        this.base = base;
        this.page = new OwnersPage(base.Driver);
    }

    @And("^I click the Owners navbar$")
    public void iClickTheOwnersNavbar() throws Throwable {
        this.page.enter();
    }

    @And("^I click the find Owner button$")
    public void iClickTheButton() throws Throwable {
        this.page.ClickFindSubmit();
    }

    @Then("^I should see a list with (\\d+) owners$")
    public void iShouldSeeAListWithOwners(int numberOwners) throws Throwable {
        List<WebElement> rowCount = base.Driver.findElements(By.xpath("//table[@id='owners']/tbody/tr"));
        Assert.assertEquals(rowCount.size(), numberOwners);
    }


    @And("^I enter the lastName \"([^\"]*)\"$")
    public void iEnterTheLastName(String lastName) throws Throwable {
        System.out.println(lastName);
        this.page.insertLastName(lastName);
    }

    @Then("^I should see the owner details info$")
    public void iShouldSeeTheOwnerDetailsInfo() throws Throwable {
        Assert.assertTrue(base.Driver.findElement(By.id("owner-info")).isDisplayed());
    }

    @Then("^I should see a warning message with the message \"([^\"]*)\"$")
    public void iShouldSeeAWarningMessageWithTheMessage(String message) throws Throwable {
        Assert.assertTrue(base.Driver.findElement(By.id("errors")).findElement(By.xpath("//div[@class='alert alert-warning']/p")).getText().equals(message));
    }


}
