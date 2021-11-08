package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPage extends BaseClass {
    //баннеры главного экрана
    private final By mediumBannerCard = MobileBy.id("ru.sportmaster.app.v4:id/mediumBannerCard");
    private final By smallBannerCard1 = MobileBy.id("ru.sportmaster.app.v4:id/smallBannerCard1");
    private final By smallBannerCard2 = MobileBy.id("ru.sportmaster.app.v4:id/smallBannerCard2");
    private final By largeBannerCard = MobileBy.id("ru.sportmaster.app.v4:id/largeBannerCard");

    //тулбар с поиском
    private final By mainMenuToolbar = MobileBy.id("ru.sportmaster.app.v4:id/mainMenuToolbar");

    //блок авторизации с главного экрана
    private final By loginTitleTextView = MobileBy.id("ru.sportmaster.app.v4:id/loginTitleTextView\n");
    private final By loginHintTextView = MobileBy.id("ru.sportmaster.app.v4:id/loginHintTextView");
    private final By rightCardsImageView = MobileBy.id("ru.sportmaster.app.v4:id/rightCardsImageView");
    private final By loginEnterButton = MobileBy.id("ru.sportmaster.app.v4:id/loginEnterButton");


    public By getLargeBannerCard() {
        return largeBannerCard;
    }

    public By getLoginEnterButton() {
        return loginEnterButton;
    }

    public By getLoginHintTextView() {
        return loginHintTextView;
    }

    public By getLoginTitleTextView() {
        return loginTitleTextView;
    }

    public By getMainMenuToolbar() {
        return mainMenuToolbar;
    }

    public By getMediumBannerCard() {
        return mediumBannerCard;
    }

    public By getRightCardsImageView() {
        return rightCardsImageView;
    }

    public By getSmallBannerCard2() {
        return smallBannerCard2;
    }

    public By getSmallBannerCard1() {
        return smallBannerCard1;
    }
}
