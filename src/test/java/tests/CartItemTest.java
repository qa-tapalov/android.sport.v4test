package tests;

import org.junit.Test;
import pages.InitialClass;

public class CartItemTest extends InitialClass {


    //проверка элементов в карточке товара
    @Test
    public void checkElementOnCartItem(){
        openItem("10656190");
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
        checkElementOnPage(cartPage.getColorText());
        checkElementOnPage(cartPage.getColors());
        checkElementOnPage(cartPage.getColorImage());
        checkElementOnPage(cartPage.getSizeGroup());
        checkElementOnPage(cartPage.getSizes());
        checkElementOnPage(cartPage.getTable_size_link());
        checkElementOnPage(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getDefaultState());
        checkElementOnPage(cartPage.getDescriptionTitle());
        checkElementOnPage(cartPage.getDescription());
        checkElementOnPage(cartPage.getSpecificationsTitle());

    }

    //проверка отображения блока доступности товара в магазине
    @Test
    public void checkDefaultPickup(){
        openItem("10656190");
        scrollByCoord();
        isElementDisplayed(cartPage.getPickup_title());
        assertElementByText(cartPage.getDefaultState(), "Для отображения наличия, выберите размер");
        clickOnElement();
        isElementDisplayed(cartPage.getPickup_title());


    }

    //проверка появления алерта, если не выбрать размер
    @Test
    public void checkSnackChooseSize(){
        openItem("10656190");
        scrollByCoord();
        clickOnElement(cartPage.getAddBasketMain());
        isElementDisplayed(cartPage.getSnackChooseSize());




    }

    //проверка появления плавающей кнопки добавления товара в корзину
    @Test
    public void checkAddBacketFloat(){
        openItem("10656190");
        verticalSwipeByPercentages();
        isElementDisplayed(cartPage.getAddBasketMain());
        isElementDisplayed(cartPage.getAddBasketFloat());





    }





}
