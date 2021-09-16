package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ListingPage extends BaseClass {

    //элементы листинга товаров
    final By filters = MobileBy.id("ru.sportmaster.app.v4:id/filtersImage");
//    final By backBtn = MobileBy.id("ru.sportmaster.app.v4:id/imageView5");
    final By title = MobileBy.id("ru.sportmaster.app.v4:id/title");
    final By sort = MobileBy.id("ru.sportmaster.app.v4:id/sort");
    final By sortName = MobileBy.id("ru.sportmaster.app.v4:id/sort_name");
    final By countItems = MobileBy.id("ru.sportmaster.app.v4:id/countText");
    final By compare = MobileBy.id("ru.sportmaster.app.v4:id/is_compare_image");
    final By viewListing  = MobileBy.id("ru.sportmaster.app.v4:id/list_view_type");

    //элементы карточки товара в листинге
    final By item = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView");
    final By imageItem = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView");
    final By favorite = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/androidx.cardview.widget.CardView[1]");
    final By compareOnItem = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/androidx.cardview.widget.CardView[2]");
    final By titleItem = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
    final By reviewUi = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RatingBar");
    final By reviewCount = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    final By sell = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[3]");
    final By basketBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView");

    private final By chooseSizeBottomSheet = MobileBy.id("ru.sportmaster.app.v4:id/design_bottom_sheet");
    private final By titleBottomSheet = MobileBy.id("ru.sportmaster.app.v4:id/textView");
    private final By closeBottomSheet = MobileBy.id("ru.sportmaster.app.v4:id/closeButton");
    private final By groupSize = MobileBy.id("ru.sportmaster.app.v4:id/sizesChoiser");
    private final By tableSize = MobileBy.id("ru.sportmaster.app.v4:id/table_size_link");
    private final By sizeChooser = MobileBy.id("ru.sportmaster.app.v4:id/sizes");
    private final By sizeElement1 = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]\n");
    private final By addBasketBtn = MobileBy.id("ru.sportmaster.app.v4:id/order");


    public By getAddBasketBtn() {
        return addBasketBtn;
    }

    public By getChooseSizeBottomSheet() {
        return chooseSizeBottomSheet;
    }

    public By getCloseBottomSheet() {
        return closeBottomSheet;
    }

    public By getGroupSize() {
        return groupSize;
    }

    public By getSizeChooser() {
        return sizeChooser;
    }

    public By getSizeElement1() {
        return sizeElement1;
    }

    public By getTableSize() {
        return tableSize;
    }

    public By getTitleBottomSheet() {
        return titleBottomSheet;
    }

    public By getFilters() { return filters;
    }

    public By getTitle() { return title;
    }

    public By getBasketBtn() { return basketBtn;
    }

    public By getCompare() { return compare;
    }

    public By getCompareOnItem() { return compareOnItem;
    }

    public By getCountItems() { return countItems;
    }

    public By getFavorite() { return favorite;
    }

    public By getImageItem() { return imageItem;
    }

    public By getReviewCount() { return reviewCount;
    }

    public By getReviewUi() { return reviewUi;
    }

    public By getSell() { return sell;
    }

    public By getSort() { return sort;
    }

    public By getViewListing() { return viewListing;
    }

    public By getSortName() { return sortName;
    }

    public By getTitleItem() { return titleItem;
    }

    public By getItem() {
        return item;
    }
}
