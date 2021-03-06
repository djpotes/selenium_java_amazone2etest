package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Class to manipulate Search results page
 */
public class SearchResultPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Next']")
    WebElement btnNextPage;

    @FindBy(xpath = "//div[@data-component-type='s-search-result']//img")
    List<WebElement> itemsList;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Navigate to a page
     * @param pageNumber Number of page to navitgate
     */
    public void navigateToPage(int pageNumber) {
        if (pageNumber >= 2) {
            for (int i = 1; i <= pageNumber - 1;i++) {
                this.clickNextPage();
            }
        }
    }

    /**
     * Click not Next page button
     */
    private void clickNextPage(){
        btnNextPage.click();
    }

    /**
     * Click to an item
     * @param index Element number
     */
    public void clickItem(int index) {
        itemsList.get(index - 1).click();
    }
}
