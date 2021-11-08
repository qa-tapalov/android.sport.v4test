package Tests;

import PageObject.InitialClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import org.junit.Test;

public class CatalogTest extends InitialClass {


    //проверка наличия элементов в каталоге
    //https://testrail.app.local/testrail/index.php?/cases/view/671781
    @Test
    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671781")
    @Description("проверка наличия элементов в каталоге ")
    public void checkElementsOnCatalog() {
        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(cPage.getCatalog());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getScanCode());
        checkElementOnPage(cPage.getSearchByPhoto());
        checkElementOnPage(cPage.getTabCatalog());
        checkElementOnPage(cPage.getTabRazdel());
    }


    //https://testrail.app.local/testrail/index.php?/cases/view/671788
    @Test
    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671788")
    @Description("проверка наличия элементов на 2-3 уровнях каталога")
    public void checkSubCategoryRazdel(){
        clickOnElement(onboardPage.getCloseBtn());
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
    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671800")
    @Description("Проверка появление блока ранее просмотренных товаров")
    public void checkResentlyWatched() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentlyWatched());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint1());
        clickOnElement(lPage.getItem());
        Thread.sleep(1000);
        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentlyWatched());
    }



}
