package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidSearchPageObject;
import lib.ui.pages.interfaces.ISearchPageObject;
import lib.ui.pages.ios.iOSSearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageFactory {
    public static ISearchPageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSSearchPageObject(driver);
        } else {
            return new AndroidSearchPageObject(driver);
        }
    }
}
