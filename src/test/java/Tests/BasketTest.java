package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketTest extends InitialClass {



    //верстка пустой корзины -
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
    //верстка блока изменения города -
    @Test
    public void checkElementOnCityChooser(){
        clickOnElement(basketPage.getBasket());
        clickOnElement(basketPage.getChooseCity());
        checkElementOnPage(basketPage.getAlertCity());
        checkElementOnPage(basketPage.getAlertCityTitle());
        checkElementOnPage(basketPage.getAlertCityText());
        checkElementOnPage(basketPage.getAlertCityCancelBtn());
        checkElementOnPage(basketPage.getAlertCityOkBtn());
        clickOnElement(basketPage.getAlertCityOkBtn());
        checkElementOnPage(basketPage.getTitleChooserCity());
        checkElementOnPage(basketPage.getSearchBarOnChooserCity());




    }

    //изменение города из корзины
    @Test
    public void changeCity(){
        clickOnElement(basketPage.getBasket());
        MobileElement cityName = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(basketPage.getCityName()));
        System.out.println("Город до изменения: " + cityName.getText());
        clickOnElement(basketPage.getChooseCity());
        clickOnElement(basketPage.getAlertCityOkBtn());
        clickOnElement(basketPage.getCityNameOnChooserCity());
        clickOnElement(basketPage.getBasket());
        MobileElement cityName2 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(basketPage.getCityName()));
        System.out.println("Город после изменения: " + cityName2.getText());
    }


    //верстка корзины с товарами
    @Test
    public void addItemInBasket() throws InterruptedException {
        openListing("беговая дорожка");
        clickOnElement(lPage.getBasketBtn());
        clickOnElement(lPage.getSizeElement1());
        clickOnElement(lPage.getAddBasketBtn());
        checkElementOnPage(cartPage.getSnackSuccessAddBasket());
        tapByCoordinates(100,250);
        clickOnElement(basketPage.getBasket());
        checkElementOnPage(basketPage.getBtnMain());
    }

    // переход на кт
    @Test
    public void openCartItemFromBasket() throws InterruptedException {
        openListing("10542186");
        clickOnElement(lPage.getBasketBtn());
        clickOnElement(lPage.getSizeElement1());
        clickOnElement(lPage.getAddBasketBtn());
        checkElementOnPage(cartPage.getSnackSuccessAddBasket());
        tapByCoordinates(100,250);
        clickOnElement(basketPage.getBasket());
        clickOnElement(basketPage.getImageItemOnBasket());
        checkElementOnPage(cartPage.getNameItem());
        MobileElement nameItem = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Открыта КТ: " + nameItem.getText());


    }

    //отображение и кликабельность лейблов
    @Test
    public void checkLabelOnItem() throws InterruptedException {
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getLabel2ItemOnBasket());
        clickOnElement(basketPage.getLabel2ItemOnBasket());
        checkElementOnPage(basketPage.getBottomSheetLabel());
        checkElementOnPage(basketPage.getBottomSheetLabelTitle());
        checkElementOnPage(basketPage.getBottomSheetLabelClose());
        checkElementOnPage(basketPage.getBottomSheetLabelDesc());


    }

    //блок тотал


    //отображение блока "нет в наличии"

}
