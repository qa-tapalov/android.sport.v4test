package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.Test;
import PageObject.InitialClass;

public class ListingTest extends InitialClass {


    //проверка наличия элементов в товарной плитке
    //
    @Test
    @Epic("Плитка товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671850")
    @Description("Проверка наличия элементов в товарной плитке")
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


    @Test
    @Epic("Плитка товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671854")
    @Description("Проверка наличия элементов на карточке товара в товарной плитке")
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
    @Epic("Плитка товаров")
    @Feature("Добавление в корзину с плитки товаров")
    @Link("")
    @Description("Успешное добавление в корзину размерного товара")
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
