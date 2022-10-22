package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IOnboardingPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSOnboardingPageObject extends MainPageObject implements IOnboardingPageObject {
    final static String SKIP_BUTTON = "id:Skip";

    public iOSOnboardingPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void skipOnboarding() {
        WebElement skipButton = this.waitForElementPresent(
                SKIP_BUTTON,
                "Cannot find Search Wikipedia init search input"
        );
        skipButton.click();
    }
}
