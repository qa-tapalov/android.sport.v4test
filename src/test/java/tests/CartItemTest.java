package tests;

import org.junit.Test;
import pages.InitialClass;

public class CartItemTest extends InitialClass {


    //проверка наличия элементов в карточке товара
    @Test
    public void checkElementOnCartItem(){


        checkElementOnPage(cartPage.getBackBtn());
        checkElementOnPage(cartPage.getFavorite());
        checkElementOnPage(cartPage.getCompare());
        checkElementOnPage(cartPage.getShare());
        checkElementOnPage(cartPage.getImage());
        checkElementOnPage(cartPage.getPlayVideo());
        checkElementOnPage(cartPage.getMarkers());
        checkElementOnPage(cartPage.getRichContent());
        checkElementOnPage(cartPage.getBrand());
        checkElementOnPage(cartPage.getRatingBarSvg());
        checkElementOnPage(cartPage.getRatingText());
        checkElementOnPage(cartPage.getNameItem());
        checkElementOnPage(cartPage.getPrice());

    }
}
