package pages;

import core.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CartItemPage extends BaseClass {

    private final By backBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
    private final By favorite = MobileBy.id("ru.sportmaster.app.v4:id/action_favorite");
    private final By compare = MobileBy.id("ru.sportmaster.app.v4:id/action_compare");
    private final By share = MobileBy.id("ru.sportmaster.app.v4:id/action_share");
    private final By playVideo = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton");
    private final By image = MobileBy.id("ru.sportmaster.app.v4:id/image_gallery");
    private final By markers = MobileBy.id("ru.sportmaster.app.v4:id/imageMarker");
    private final By richContent = MobileBy.id("ru.sportmaster.app.v4:id/imageRichContent");
    private final By brand = MobileBy.id("ru.sportmaster.app.v4:id/brand");
    private final By ratingBarSvg = MobileBy.id("ru.sportmaster.app.v4:id/ratingBarSvg");
    private final By ratingText = MobileBy.id("ru.sportmaster.app.v4:id/ratingText");
    private final By nameItem = MobileBy.id("ru.sportmaster.app.v4:id/name");
    private final By price = MobileBy.id("ru.sportmaster.app.v4:id/price");


    public By getBackBtn() { return backBtn; }
    public By getFavorite() { return favorite; }
    public By getCompare() { return compare; }
    public By getShare() { return share; }
    public By getPlayVideo() { return playVideo; }
    public By getImage() { return image; }
    public By getBrand() { return brand; }
    public By getNameItem() { return nameItem; }
    public By getMarkers() { return markers; }
    public By getPrice() { return price; }
    public By getRatingBarSvg() { return ratingBarSvg; }
    public By getRatingText() { return ratingText; }
    public By getRichContent() { return richContent; }

}
