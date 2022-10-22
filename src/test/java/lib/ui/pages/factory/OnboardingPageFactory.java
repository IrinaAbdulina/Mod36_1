package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidOnboardingPageObject;
import lib.ui.pages.interfaces.IOnboardingPageObject;
import lib.ui.pages.ios.iOSOnboardingPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OnboardingPageFactory {
    public static IOnboardingPageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSOnboardingPageObject(driver);
        } else {
            return new AndroidOnboardingPageObject(driver);
        }
    }
}

