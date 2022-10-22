package tests;

import lib.CoreTestCase;
import lib.ui.MainPageObject;
import lib.ui.pages.factory.OnboardingPageFactory;
import lib.ui.pages.factory.SearchPageFactory;
import lib.ui.pages.factory.StartPageFactory;
import lib.ui.pages.interfaces.IOnboardingPageObject;
import lib.ui.pages.interfaces.ISearchPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SearchTest extends CoreTestCase {

    @Test
    public void testSearch() {
        /*IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ISearchPageObject searchPage = SearchPageFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        startPage.initSearch();
        searchPage.findByText("Java");
        searchPage.selectByText("Island of Indonesia");*/

        //org.wikipedia:id/fragment_feed_header
        //org.wikipedia:id/search_src_text

        MainPageObject mainPO = new MainPageObject(this.driver);

        WebElement searchInit = mainPO.waitForElementPresent(
                "id:org.wikipedia:id/fragment_feed_header",
                "Error1"
        );

        searchInit.click();

        WebElement searchInput = mainPO.waitForElementPresent(
                "id:org.wikipedia:id/search_src_text",
                "Error2"
        );

        searchInput.sendKeys("Java");

        WebElement expectedResult = mainPO.waitForElementPresent(
        //        "xpath://*[./*[contains(@text, 'Island of Indonesia, Southeast Asia')]]",
                "xpath://*[./*[contains(@text, 'wfewfewfwegweg')]]",
                "Error3"
        );

        expectedResult.click();

    }
}
