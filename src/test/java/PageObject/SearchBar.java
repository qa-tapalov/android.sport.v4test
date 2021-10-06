package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SearchBar extends BaseClass {

    private final By searchbar = MobileBy.id("ru.sportmaster.app.v4:id/search_by_text");
    private final By tapView = MobileBy.id("ru.sportmaster.app.v4:id/taps_recycle_view");
    private final By tap1 = MobileBy.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
    private final By tap2 = MobileBy.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
    private final By tap3 = MobileBy.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView");

    private final By hint1 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    private final By hint2 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
    private final By hint3 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");

    private final By cartItemFromSearch1 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]");
    private final By cartItemFromSearch2 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]");
    private final By cartItemFromSearch3 = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]");

    private final By searchTitle = MobileBy.xpath("ru.sportmaster.app.v4:id/search_title");
    private final By clearSearch = MobileBy.xpath("ru.sportmaster.app.v4:id/clear_search");


    public By getClearSearch() {
        return clearSearch;
    }

    public By getSearchbar() {
        return searchbar;
    }
    public By getTap1() {
        return tap1;
    }
    public By getSearchTitle() { return searchTitle; }
    public By getTapView() { return tapView; }

    public By getCartItemFromSearch1() {
        return cartItemFromSearch1;
    }

    public By getCartItemFromSearch2() {
        return cartItemFromSearch2;
    }

    public By getCartItemFromSearch3() {
        return cartItemFromSearch3;
    }

    public By getHint1() {
        return hint1;
    }

    public By getHint2() {
        return hint2;
    }

    public By getHint3() {
        return hint3;
    }

    public By getTap2() {
        return tap2;
    }

    public By getTap3() {
        return tap3;
    }

}
