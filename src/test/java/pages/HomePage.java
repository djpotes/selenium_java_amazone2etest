package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class to manipulate Home page
 */
public class HomePage {

    private WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    WebElement txtSearch;

    @FindBy(id = "nav-search-submit-button")
    WebElement btnSearch;

    @FindBy(id = "search")
    WebElement result;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Search items
     * @param value
     */
    public void search(String value){
        txtSearch.sendKeys(value);
        btnSearch.click();
    }

}
