package tests;

import org.junit.Test;
import pages.CatalogPage;
import pages.InitialClass;

public class CatalogTest extends InitialClass {


    //проверка наличия элементов в каталоге
    @Test
    public void checkElementsOnCatalog() {
        clickOnElement(cPage.getCatalog());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getScanCode());
        checkElementOnPage(cPage.getSearchByPhoto());
        checkElementOnPage(cPage.getTabCatalog());
        checkElementOnPage(cPage.getTabRazdel());
    }


    //проверка наличия элементов на 2-3 уровнях каталога
    @Test
    public void checkSubCategoryRazdel(){
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getCategory());
        checkElementOnPage(cPage.getBackButton());
        checkElementOnPage(cPage.getTitle());
        checkElementOnPage(cPage.getImageCategory());
        clickOnElement(cPage.getSubCategory());
        checkElementOnPage(cPage.getBackButton());
        checkElementOnPage(cPage.getTitleCategory());
        checkElementOnPage(cPage.getTitleSubCategory());
    }

    @Test
    //Проверка появление блока ранее просмотренных товаров
    public void checkResentlyWatched() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentlyWatched());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint());
        clickOnElement(lPage.getItem());
        Thread.sleep(1000);
        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentlyWatched());
    }



}
