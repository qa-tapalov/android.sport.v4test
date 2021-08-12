package tests;

import org.junit.Test;
import pages.InitialClass;

public class ListingTest extends InitialClass {


    //проверка наличия элементов в товарной плитке
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
        checkElementOnPage(lPage.getAddBasket());







           }





}
