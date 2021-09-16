package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BasketPage extends BaseClass {
    private final By basket = MobileBy.AccessibilityId("cart");
    private final By titleBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
    private final By chooseCity = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat");
    private final By cityName = MobileBy.id("ru.sportmaster.app.v4:id/city_tv");
    private final By btnToCatalog = MobileBy.id("ru.sportmaster.app.v4:id/to_catalog_btn");
    private final By emptyBasketImage = MobileBy.id("ru.sportmaster.app.v4:id/empty_image");
    private final By emptyBasketText = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");


    public By getBasket() {
        return basket;
    }

    public By getBtnToCatalog() {
        return btnToCatalog;
    }

    public By getChooseCity() {
        return chooseCity;
    }

    public By getCityName() {
        return cityName;
    }

    public By getTitleBasket() {
        return titleBasket;
    }

    public By getEmptyBasketImage() {
        return emptyBasketImage;
    }

    public By getEmptyBasketText() {
        return emptyBasketText;
    }

}
