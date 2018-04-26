package acceptanceTests.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OwnersPage {

    public OwnersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement txtLastName;

    @FindBy(how = How.NAME, using = "findOwner")
    public WebElement btnFind;

    @FindBy(xpath = "//*[@title=\"find owners\"]")
    public WebElement btnOwners;

    public void find(String lastName)
    {
        txtLastName.sendKeys(lastName);
    }

    public void ClickFindSubmit()
    {
        btnFind.click();
    }


    public void insertLastName(String lastName)
    {
        txtLastName.sendKeys(lastName);
    }


    public void enter() {
        btnOwners.click();
    }
}
