package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketTest extends InitialClass {



    //верстка пустой корзины - https://testrail.app.local/testrail/index.php?/cases/view/727985
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
    //верстка блока изменения города - https://testrail.app.local/testrail/index.php?/cases/view/727987
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

    //изменение города из корзины - https://testrail.app.local/testrail/index.php?/cases/view/727987
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


    //верстка корзины с товарами - https://testrail.app.local/testrail/index.php?/cases/view/727986
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

    // переход на кт - https://testrail.app.local/testrail/index.php?/cases/view/727989
    @Test
    public void openCartItemFromBasket() throws InterruptedException {
        addItemOnBasket("10542186",1);
        clickOnElement(basketPage.getImageItemOnBasket());
        checkElementOnPage(cartPage.getNameItem());
        MobileElement nameItem = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Открыта КТ: " + nameItem.getText());


    }

    //отображение и кликабельность лейблов - https://testrail.app.local/testrail/index.php?/cases/view/727991
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

    //блок тотал - https://testrail.app.local/testrail/index.php?/cases/view/727996
    @Test
    public void checkBoxTotal() throws InterruptedException {
        addItemOnBasket("беговая дорожка",1);
        checkElementOnPage(basketPage.getTotalBox());
        checkElementOnPage(basketPage.getTotalItemCount());
        checkElementOnPage(basketPage.getTotalItemCountSum());


    }


    //отображение блока "нет в наличии" - https://testrail.app.local/testrail/index.php?/cases/view/728005
    @Test
    public void unavailableBox() throws InterruptedException {
      addItemOnBasket("10626602",3);
      checkElementOnPage(basketPage.getItemUnavailableBox());
      checkElementOnPage(basketPage.getDeleteAllFromUnavailable());
      checkElementOnPage(basketPage.getDescItemFromUnavailable());
      checkElementOnPage(basketPage.getImageItemFromUnavailable());
      checkElementOnPage(basketPage.getTitleItemFromUnavailable());
      checkElementOnPage(basketPage.getColorItemFromUnavailable());
      checkElementOnPage(basketPage.getPriceItemFromUnavailable());

    }

}
