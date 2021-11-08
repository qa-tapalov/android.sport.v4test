package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class OnboardPage extends BaseClass {

    private final By closeBtn = MobileBy.id("ru.sportmaster.app.v4:id/toolbarButton");
    private final By forwardBtn = MobileBy.id("ru.sportmaster.app.v4:id/forwardButton");
    private final By slideTitle = MobileBy.id("ru.sportmaster.app.v4:id/slideTitleTextView");
    private final By slideHint = MobileBy.id("ru.sportmaster.app.v4:id/slideHintTextView");
    private final By navSlider = MobileBy.id("ru.sportmaster.app.v4:id/onboardingTabsLayout");
    private final By loginBtn = MobileBy.id("ru.sportmaster.app.v4:id/loginButton");


    public By getCloseBtn() {
        return closeBtn;
    }

    public By getForwardBtn() {
        return forwardBtn;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public By getNavSlider() {
        return navSlider;
    }

    public By getSlideHint() {
        return slideHint;
    }

    public By getSlideTitle() {
        return slideTitle;
    }
}
