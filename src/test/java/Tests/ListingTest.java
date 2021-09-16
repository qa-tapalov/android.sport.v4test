package Tests;

import org.junit.Test;
import PageObject.InitialClass;

public class ListingTest extends InitialClass {


    //проверка наличия элементов в товарной плитке
    //https://testrail.app.local/testrail/index.php?/cases/view/671850
    @Test
    public void checkElementsOnListing(){

        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getCategory());
        clickOnElement(cPage.getSubCategory());
        clickOnElement(cPage.getSubCategory3());

        checkElementOnPage(lPage.getFilters());
        checkElementOnPage(lPage.getTitle());
        checkElementOnPage(lPage.getCompare());
        checkElementOnPage(lPage.getCountItems());
        checkElementOnPage(lPage.getSort());
        checkElementOnPage(lPage.getSortName());
        checkElementOnPage(lPage.getViewListing());
    }
    //проверка наличия элементов на карточке товара в товарной плитке
    //https://testrail.app.local/testrail/index.php?/cases/view/671854
    @Test
    public void checkElementOnItem(){
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getCategory());
        clickOnElement(cPage.getSubCategory());
        clickOnElement(cPage.getSubCategory3());

        checkElementOnPage(lPage.getImageItem());
        checkElementOnPage(lPage.getFavorite());
        checkElementOnPage(lPage.getCompareOnItem());
        checkElementOnPage(lPage.getTitleItem());
        checkElementOnPage(lPage.getReviewUi());
        checkElementOnPage(lPage.getReviewCount());
        checkElementOnPage(lPage.getSell());
        checkElementOnPage(lPage.getBasketBtn());


    }

    @Test
    public void addBasketFromListing() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getBasketBtn());
        clickOnElement(lPage.getSizeElement1());
        clickOnElement(lPage.getAddBasketBtn());
        assertElementByText(cartPage.getSnackSuccessAddBasket(),"Товар добавлен в корзину!");
    }

//    @Test
//    public void blabla() throws InterruptedException {
//        openListing("кроссовки");
//        checkElementOnPage(lPage.getImageItem());
//        clickOnElement(cPage.getSearchBar());
//        sendKeys(cPage.getSearchBar(),"палатка");
//        tapByCoordinates(981, 1913);
//        clickOnElement(cPage.getBackButton());
//        Thread.sleep(5000);
//
//    }

}
