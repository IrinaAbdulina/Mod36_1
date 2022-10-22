package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IOnboardingPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidOnboardingPageObject extends MainPageObject implements IOnboardingPageObject {
    public AndroidOnboardingPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public void skipOnboarding() {}
}
