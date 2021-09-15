package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AuthorizationPage extends BaseClass {

    private final By profilePage = MobileBy.AccessibilityId("account");
    private final By closeBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageButton");
    private final By countryCode = MobileBy.id("ru.sportmaster.app.v4:id/country_code_tv");
    private final By phoneEdit = MobileBy.id("ru.sportmaster.app.v4:id/phone_edit_text");
    private final By authBtn = MobileBy.id("ru.sportmaster.app.v4:id/auth_btn");
    private final By title = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView");
    private final By vkBtn = MobileBy.id("ru.sportmaster.app.v4:id/auth_with_vk_btn");
    private final By okBtn = MobileBy.id("ru.sportmaster.app.v4:id/auth_with_ok_btn");
    private final By fbBtn = MobileBy.id("ru.sportmaster.app.v4:id/auth_with_fb_btn");
    private final By alertGoogle = MobileBy.id("com.google.android.gms:id/positive_button");
    private final By profile = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");


    public By getProfilePage() { return profilePage; }

    public By getCloseBtn() { return closeBtn; }

    public By getTitle() { return title; }

    public By getAuthBtn() { return authBtn; }

    public By getCountryCode() { return countryCode; }

    public By getFbBtn() { return fbBtn; }

    public By getOkBtn() { return okBtn; }

    public By getPhoneEdit() { return phoneEdit; }

    public By getVkBtn() { return vkBtn; }
    public By getAlertGoogle() { return alertGoogle; }
}
