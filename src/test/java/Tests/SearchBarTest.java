package Tests;

import io.appium.java_client.MobileElement;
import org.junit.Test;
import PageObject.InitialClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBarTest extends InitialClass {


    //проверка кликабельности подсказки
    //https://testrail.app.local/testrail/index.php?/cases/view/678832
    @Test
    public void checkTapOnSearch(){

        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint1());
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
        checkElementOnPage(sBar.getTap1());
        checkElementOnPage(sBar.getTap2());
        checkElementOnPage(sBar.getTap3());
//        checkElementOnPage(sBar.getHint1());
//        checkElementOnPage(sBar.getHint2());
//        checkElementOnPage(sBar.getHint3());
//        checkElementOnPage(sBar.getCartItemFromSearch1());
//        checkElementOnPage(sBar.getCartItemFromSearch2());
//        checkElementOnPage(sBar.getCartItemFromSearch3());

    }


    //переход на КТ из поиска
    //https://testrail.app.local/testrail/index.php?/cases/view/678890
    @Test
    public void cartItemFromSearch(){
       clickOnElement(cPage.getCatalog());
       clickOnElement(sBar.getSearchbar());
       sendKeys(sBar.getSearchbar(),"кроссовки");
       clickOnElement(sBar.getCartItemFromSearch1());
       MobileElement item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Карточка товара: " + item.getText());
   }

}
