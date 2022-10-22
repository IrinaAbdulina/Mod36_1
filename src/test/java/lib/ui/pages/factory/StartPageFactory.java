package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidStartPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import lib.ui.pages.ios.iOSStartPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StartPageFactory {
    public static IStartPageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSStartPageObject(driver);
        } else {
            return new AndroidStartPageObject(driver);
        }
    }
}
