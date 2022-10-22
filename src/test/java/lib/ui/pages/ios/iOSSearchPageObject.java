package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ISearchPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSSearchPageObject extends MainPageObject implements ISearchPageObject {
    final static String SEARCH_INPUT = "xpath://XCUIElementTypeSearchField[@value='Search Wikipedia']";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@name,'{TEXT}')]]";

    public iOSSearchPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void findByText(String text) {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_INPUT,
                "Cannot find search input"
        );

        searchInput.sendKeys(text);
    }

    public void selectByText(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: '" + text + "'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("{TEXT}", text);
    }
}
