package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

//товар с кликабельной плашкой - 10542186

public class BasketPage extends BaseClass {
    private final By basket = MobileBy.AccessibilityId("cart");
    private final By titleBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
    private final By chooseCity = MobileBy.id("ru.sportmaster.app.v4:id/cityLayout");
    private final By cityNameOnBasket = MobileBy.id("ru.sportmaster.app.v4:id/city_tv");
    private final By alertCity = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout");
    private final By alertCityTitle = MobileBy.id("ru.sportmaster.app.v4:id/titleDialog");
    private final By alertCityText = MobileBy.id("ru.sportmaster.app.v4:id/bodyText");
    private final By alertCityOkBtn = MobileBy.id("ru.sportmaster.app.v4:id/changeCity");
    private final By alertCityCancelBtn = MobileBy.id("ru.sportmaster.app.v4:id/reject");
    private final By titleChooserCity = MobileBy.id("ru.sportmaster.app.v4:id/title");
    private final By searchBarOnChooserCity = MobileBy.id("ru.sportmaster.app.v4:id/search_by_text");
    private final By cityNameOnChooserCity = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
    private final By btnToCatalog = MobileBy.id("ru.sportmaster.app.v4:id/to_catalog_btn");
    private final By emptyBasketImage = MobileBy.id("ru.sportmaster.app.v4:id/empty_image");
    private final By emptyBasketText = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    private final By itemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    private final By imageItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.View");
    private final By label1ItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]");
    private final By label2ItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[2]");
    private final By label3ItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[3]");
    private final By bottomSheetLabel = MobileBy.id("ru.sportmaster.app.v4:id/design_bottom_sheet");
    private final By bottomSheetLabelTitle = MobileBy.id("ru.sportmaster.app.v4:id/title_tv");
    private final By bottomSheetLabelDesc = MobileBy.id("ru.sportmaster.app.v4:id/desc_tv");
    private final By bottomSheetLabelClose = MobileBy.id("ru.sportmaster.app.v4:id/close");


    private final By titleItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    private final By colorItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]");
    private final By sizeItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]");
    private final By priceItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]");
    private final By oldPriceItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[5]");
    private final By sumItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.TextView");
    private final By btnMain = MobileBy.id("ru.sportmaster.app.v4:id/btn");
    private final By btnFloat = MobileBy.id("ru.sportmaster.app.v4:id/by_cart_btn");
    private final By blockFloat = MobileBy.id("ru.sportmaster.app.v4:id/to_checkout_include\n");
    private final By blockFloatOldPrice = MobileBy.id("ru.sportmaster.app.v4:id/old_price_tv\n");
    private final By blockFloatPrice = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By itemUnavailable = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");

    private final By totalItemCount = MobileBy.id("ru.sportmaster.app.v4:id/amount_title_tv");
    private final By totalItemCountSum = MobileBy.id("ru.sportmaster.app.v4:id/old_total_amount_tv");
    private final By totalBox = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat");



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
        return cityNameOnBasket;
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

    public By getBlockFloat() {
        return blockFloat;
    }

    public By getBlockFloatOldPrice() {
        return blockFloatOldPrice;
    }

    public By getBlockFloatPrice() {
        return blockFloatPrice;
    }

    public By getBtnFloat() {
        return btnFloat;
    }

    public By getBtnMain() {
        return btnMain;
    }

    public By getSizeItemOnBasket() {
        return sizeItemOnBasket;
    }

    public By getCityNameOnBasket() {
        return cityNameOnBasket;
    }

    public By getCityNameOnChooserCity() {
        return cityNameOnChooserCity;
    }

    public By getColorItemOnBasket() {
        return colorItemOnBasket;
    }

    public By getItemOnBasket() {
        return itemOnBasket;
    }

    public By getImageItemOnBasket() {
        return imageItemOnBasket;
    }

    public By getItemUnavailable() {
        return itemUnavailable;
    }

    public By getLabel1ItemOnBasket() {
        return label1ItemOnBasket;
    }

    public By getLabel2ItemOnBasket() {
        return label2ItemOnBasket;
    }

    public By getLabel3ItemOnBasket() {
        return label3ItemOnBasket;
    }

    public By getBottomSheetLabel() {
        return bottomSheetLabel;
    }

    public By getBottomSheetLabelClose() {
        return bottomSheetLabelClose;
    }

    public By getBottomSheetLabelDesc() {
        return bottomSheetLabelDesc;
    }

    public By getBottomSheetLabelTitle() {
        return bottomSheetLabelTitle;
    }

    public By getOldPriceItemOnBasket() {
        return oldPriceItemOnBasket;
    }

    public By getPriceItemOnBasket() {
        return priceItemOnBasket;
    }

    public By getSumItemOnBasket() {
        return sumItemOnBasket;
    }

    public By getTitleItemOnBasket() {
        return titleItemOnBasket;
    }

    public By getTotalBox() {
        return totalBox;
    }

    public By getTotalItemCount() {
        return totalItemCount;
    }

    public By getTotalItemCountSum() {
        return totalItemCountSum;
    }

    public By getAlertCity() {
        return alertCity;
    }

    public By getAlertCityCancelBtn() {
        return alertCityCancelBtn;
    }

    public By getAlertCityOkBtn() {
        return alertCityOkBtn;
    }

    public By getAlertCityText() {
        return alertCityText;
    }

    public By getAlertCityTitle() {
        return alertCityTitle;
    }

    public By getSearchBarOnChooserCity() {
        return searchBarOnChooserCity;
    }

    public By getTitleChooserCity() {
        return titleChooserCity;
    }

}
