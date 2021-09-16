package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class BasketTest extends InitialClass {

    @Test
    public void checkEmptyBasket(){
        clickOnElement(basketPage.getBasket());
        assertElementByText(basketPage.getTitleBasket(),"Корзина");
        checkElementOnPage(basketPage.getChooseCity());
        checkElementOnPage(basketPage.getCityName());
        checkElementOnPage(basketPage.getEmptyBasketImage());
        checkElementOnPage(basketPage.getEmptyBasketText());
        checkElementOnPage(basketPage.getBtnToCatalog());

    }



}
