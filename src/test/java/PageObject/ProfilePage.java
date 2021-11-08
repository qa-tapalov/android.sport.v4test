package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProfilePage extends BaseClass {
    private final By cities = MobileBy.id("ru.sportmaster.app.v4:id/cities");
    private final By citiesIconPin = MobileBy.id("ru.sportmaster.app.v4:id/iv_pin");
    private final By titleUnAuthProfile = MobileBy.id("ru.sportmaster.app.v4:id/main_header");
    private final By decsUnAuthProfile = MobileBy.id("ru.sportmaster.app.v4:id/description");
    private final By authBtn = MobileBy.id("ru.sportmaster.app.v4:id/by_entry_btn");
//    private final By authBtn = MobileBy.id("ru.sportmaster.app.v4:id/by_entry_btn\n");
//    private final By authBtn = MobileBy.id("ru.sportmaster.app.v4:id/by_entry_btn\n");


    public By getAuthBtn() {
        return authBtn;
    }

    public By getCities() {
        return cities;
    }

    public By getCitiesIconPin() {
        return citiesIconPin;
    }

    public By getDecsUnAuthProfile() {
        return decsUnAuthProfile;
    }

    public By getTitleUnAuthProfile() {
        return titleUnAuthProfile;
    }
}
