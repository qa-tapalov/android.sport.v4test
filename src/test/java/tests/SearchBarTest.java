package tests;

import org.junit.Test;
import pages.InitialClass;

public class SearchBarTest extends InitialClass {


    //проверка кликабельности подсказки
    @Test
    public void checkTapOnSearch(){

        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint());
        checkElementOnPage(sBar.getSearchTitle());

    }

    //проверка наличия элементов в поиске
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

}
