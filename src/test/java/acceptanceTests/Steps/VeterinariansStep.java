package acceptanceTests.Steps;

import acceptanceTests.Base.BaseUtil;
import acceptanceTests.pages.VeterinariansPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VeterinariansStep {

    private BaseUtil base;

    public VeterinariansStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I click the veterinarians navígation bar$")
    public void iClickTheVeterinariansNavbar() throws Throwable {
        VeterinariansPage page = new VeterinariansPage(base.Driver);
        page.enter();
    }

    @Then("^I should see a list with (\\d+) veterinarians$")
    public void iShouldSeeAListWithVeterinarians(int numberVets) throws Throwable {
        List<WebElement> rowCount = base.Driver.findElements(By.xpath("//table[@id='vets']/tbody/tr"));
        Assert.assertEquals(rowCount.size(), numberVets);
    }
}
