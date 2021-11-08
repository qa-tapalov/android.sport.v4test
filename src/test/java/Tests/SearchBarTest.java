package Tests;

import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.Test;
import PageObject.InitialClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBarTest extends InitialClass {



    @Test
    @Epic("Каталог")
    @Feature("Поиск")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/678830")
    @Description("Проверка наличия элементов в поиске")
    public void checkElementsOnSearch(){
        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        checkElementOnPage(sBar.getTapView());
        checkElementOnPage(sBar.getTap1());
        checkElementOnPage(sBar.getTap2());
        checkElementOnPage(sBar.getTap3());
        checkElementOnPage(sBar.getHint1());
        checkElementOnPage(sBar.getHint2());
        checkElementOnPage(sBar.getHint3());
        checkElementOnPage(sBar.getCartItemFromSearch1());
        checkElementOnPage(sBar.getCartItemFromSearch2());
        checkElementOnPage(sBar.getCartItemFromSearch3());

    }


    @Test
    @Epic("Каталог")
    @Feature("Поиск")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/678832")
    @Description("Проверка работы подсказок")
    public void checkTapOnSearch(){
        clickOnElement(onboardPage.getCloseBtn());

        clickOnElement(cPage.getCatalog());
        clickOnElement(sBar.getSearchbar());
        sendKeys(sBar.getSearchbar(),"кроссовки");
        clickOnElement(sBar.getHint1());
        checkElementOnPage(sBar.getSearchTitle());

    }





    @Test
    @Epic("Каталог")
    @Feature("Поиск")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/678890")
    @Description("Переход на КТ из поиска")
    public void cartItemFromSearch(){
        clickOnElement(onboardPage.getCloseBtn());
       clickOnElement(cPage.getCatalog());
       clickOnElement(sBar.getSearchbar());
       sendKeys(sBar.getSearchbar(),"кроссовки");
       clickOnElement(sBar.getCartItemFromSearch1());
       MobileElement item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Карточка товара: " + item.getText());
   }

}
