package acceptanceTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Karthik on 10/25/2016.
 */
public class VeterinariansPage {

    public VeterinariansPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@title=\"veterinarians\"]")
    public WebElement btnVets;


    public void enter()
    {
        btnVets.click();
    }


}
