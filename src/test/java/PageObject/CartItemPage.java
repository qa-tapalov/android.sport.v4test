package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CartItemPage extends BaseClass {

//    id необходимых товаров:
//    10656190 товар с видео
//    10558310 товар с рич контентом
//    10518834 товар без выбора размера
//    10671281 товар с блоком фото покупателей

    private final By backBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
    private final By favorite = MobileBy.id("ru.sportmaster.app.v4:id/action_favorite");
    private final By compare = MobileBy.id("ru.sportmaster.app.v4:id/action_compare");
    private final By share = MobileBy.id("ru.sportmaster.app.v4:id/action_share");
    private final By playVideo = MobileBy.id("ru.sportmaster.app.v4:id/open_video_btn");
    private final By videoPlayer = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[5]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
    private final By closeVideoPlayer = MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]");
    private final By indicatorGallery = MobileBy.id("ru.sportmaster.app.v4:id/indicator_layout");
    private final By image = MobileBy.id("ru.sportmaster.app.v4:id/image_gallery");
    private final By closeImageGallery = MobileBy.id("ru.sportmaster.app.v4:id/navigation_back_btn");
    private final By markers = MobileBy.id("ru.sportmaster.app.v4:id/imageMarker");
    private final By richContent = MobileBy.id("ru.sportmaster.app.v4:id/imageRichContent");
    private final By richWebView = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.webkit.WebView");
    private final By brand = MobileBy.id("ru.sportmaster.app.v4:id/brand");
    private final By ratingBarSvg = MobileBy.id("ru.sportmaster.app.v4:id/ratingBarSvg");
    private final By ratingText = MobileBy.id("ru.sportmaster.app.v4:id/ratingText");
    private final By nameItem = MobileBy.id("ru.sportmaster.app.v4:id/name");
    private final By price = MobileBy.id("ru.sportmaster.app.v4:id/price");
    private final By colorText = MobileBy.id("ru.sportmaster.app.v4:id/colorText");
    private final By colors = MobileBy.id("ru.sportmaster.app.v4:id/colors");
    private final By colorImage = MobileBy.id("ru.sportmaster.app.v4:id/colorImage");
    private final By sizeGroup = MobileBy.id("ru.sportmaster.app.v4:id/sizeGroup");
    private final By sizesChoiser = MobileBy.id("ru.sportmaster.app.v4:id/sizesChoiser");
    private final By sizeItem = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView[2]/androidx.cardview.widget.CardView[1]");
    private final By table_size_link = MobileBy.id("ru.sportmaster.app.v4:id/table_size_link");
    private final By closeTableBtn = MobileBy.id("ru.sportmaster.app.v4:id/closeButton");
    private final By titleTable = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView");
    private final By tableSizeView = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.GridView");
    private final By sizes = MobileBy.id("ru.sportmaster.app.v4:id/sizes");
    private final By addBasketMain = MobileBy.id("ru.sportmaster.app.v4:id/order");
    private final By defaultState = MobileBy.id("ru.sportmaster.app.v4:id/default_state");
    private final By pickup_title = MobileBy.id("ru.sportmaster.app.v4:id/pickup_title");
    private final By descriptionTitle = MobileBy.AccessibilityId("Описание");
    private final By specificationsTitle = MobileBy.AccessibilityId("Характеристики");
    private final By description = MobileBy.id("ru.sportmaster.app.v4:id/description");
    private final By specifications = MobileBy.id("ru.sportmaster.app.v4:id/view_pager");
    private final By review = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat");
    private final By emptyReview = MobileBy.id("ru.sportmaster.app.v4:id/empty_rating_tv");
    private final By question = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    private final By addBasketFloat = MobileBy.id("ru.sportmaster.app.v4:id/by_cart_include");
    private final By priceFloat = MobileBy.id("ru.sportmaster.app.v4:id/price_tv");
    private final By addBasketFloatBtn= MobileBy.id("ru.sportmaster.app.v4:id/by_cart_btn");
    private final By snackChooseSize = MobileBy.id("ru.sportmaster.app.v4:id/snackbar_text");
    private final By snackSuccessAddBasket = MobileBy.id("ru.sportmaster.app.v4:id/snackbar_text");


    public By getRichWebView() {
        return richWebView;
    }

    public By getIndicatorGallery() {
        return indicatorGallery;
    }

    public By getCloseVideoPlayer() {
        return closeVideoPlayer;
    }

    public By getVideoPlayer() {
        return videoPlayer;
    }


    public By getCloseImageGallery() {
        return closeImageGallery;
    }

    public By getCloseTableBtn() {
        return closeTableBtn;
    }

    public By getTableSizeView() {
        return tableSizeView;
    }

    public By getTitleTable() {
        return titleTable;
    }


    public By getSizeItem() {
        return sizeItem;
    }

    public By getSnackSuccessAddBasket() { return snackSuccessAddBasket; }
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

    public By getSnackChooseSize() { return snackChooseSize; }

    public By getAddBasketFloat() { return addBasketFloat; }

    public By getAddBasketFloatBtn() { return addBasketFloatBtn; }

    public By getAddBasketMain() { return addBasketMain; }

    public By getColorImage() { return colorImage; }

    public By getColors() { return colors; }

    public By getColorText() { return colorText; }

    public By getDefaultState() { return defaultState; }

    public By getDescription() { return description; }

    public By getDescriptionTitle() { return descriptionTitle; }

    public By getEmptyReview() { return emptyReview; }

    public By getPickup_title() { return pickup_title; }

    public By getPriceFloat() { return priceFloat; }

    public By getQuestion() { return question; }

    public By getReview() { return review; }

    public By getSizeGroup() { return sizeGroup; }

    public By getSizes() { return sizes; }

    public By getSizesChoiser() { return sizesChoiser; }

    public By getSpecifications() { return specifications; }

    public By getSpecificationsTitle() { return specificationsTitle; }

    public By getTable_size_link() { return table_size_link; }

}
