package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CatalogPage extends BaseClass {

    private final By catalog = MobileBy.AccessibilityId("catalog");
    private final By searchBar = MobileBy.id("ru.sportmaster.app.v4:id/search_by_text");
    private final By scanCode = MobileBy.id("ru.sportmaster.app.v4:id/scan_code_image");
    private final By searchByPhoto = MobileBy.id("ru.sportmaster.app.v4:id/search_by_photo_image");
    private final By tabRazdel = MobileBy.AccessibilityId("Разделы");
    private final By tabCatalog = MobileBy.AccessibilityId("Каталог");
    private final By category = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    private final By subCategory = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
    private final By backButton = MobileBy.id("ru.sportmaster.app.v4:id/navigation_back_btn");
    private final By title = MobileBy.id("ru.sportmaster.app.v4:id/title_text_view");
    private final By imageCategory = MobileBy.id("ru.sportmaster.app.v4:id/image_view");
    private final By titleCategory = MobileBy.id("ru.sportmaster.app.v4:id/title_subcategory_tw");
    private final By titleSubCategory = MobileBy.id("ru.sportmaster.app.v4:id/title_low_subcategory_tw");
    private final By subCategory3 = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
    private final By recentlyWatched = MobileBy.id("ru.sportmaster.app.v4:id/recommendations_recycle_view");

    private final By jenshinam = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");

    public By getJenshinam() {
        return jenshinam;
    }

    public By getCatalog() { return catalog; }
    public By getSearchBar() {return searchBar;}
    public By getScanCode() { return scanCode; }
    public By getSearchByPhoto() { return searchByPhoto; }
    public By getTabRazdel() { return tabRazdel; }
    public By getTabCatalog() { return tabCatalog; }
    public By getCategory() { return category; }
    public By getBackButton() { return backButton; }
    public By getImageCategory() { return imageCategory; }
    public By getSubCategory() { return subCategory; }
    public By getTitle() { return title; }
    public By getTitleCategory() { return titleCategory; }
    public By getTitleSubCategory() { return titleSubCategory; }
    public By getSubCategory3() {return subCategory3;}

    public By getRecentlyWatched() {
        return recentlyWatched;
    }


}

