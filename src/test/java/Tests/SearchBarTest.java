package Tests;

import org.junit.Test;
import PageObject.InitialClass;

public class SearchBarTest extends InitialClass {


    //проверка кликабельности подсказки
    //https://testrail.app.local/testrail/index.php?/cases/view/678832
    @Test
    public void checkTapOnSearch(){

        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint());
        checkElementOnPage(sBar.getSearchTitle());

    }

    //проверка наличия элементов в поиске
    //https://testrail.app.local/testrail/index.php?/cases/view/678830
    @Test
    public void checkElementsOnSearch(){
        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        checkElementOnPage(sBar.getTapView());
        checkElementOnPage(sBar.getHint());
        checkElementOnPage(sBar.getHintItem());
        checkElementOnPage(sBar.getImageHintItem());


    }

    //открытие конкретного товара
    @Test
    public void openItem() throws InterruptedException {
        openListing("кроссовки");
        Thread.sleep(2000);
        checkElementOnPage(sBar.getSearchTitle());
    }

}
