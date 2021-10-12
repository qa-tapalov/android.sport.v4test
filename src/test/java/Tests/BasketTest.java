package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import io.qameta.allure.*;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketTest extends InitialClass {



    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727985")
    @Description("Верстка пустой корзины")
    public void checkEmptyBasket(){
        clickOnElement(basketPage.getBasket());
        assertElementByText(basketPage.getTitleBasket(),"Корзина");
        checkElementOnPage(basketPage.getChooseCity());
        checkElementOnPage(basketPage.getCityName());
        checkElementOnPage(basketPage.getEmptyBasketImage());
        checkElementOnPage(basketPage.getEmptyBasketText());
        checkElementOnPage(basketPage.getBtnToCatalog());

    }


    //добавить кредит, тотал и баннер
    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727986")
    @Description("Верстка корзины с товарами")
    public void itemsInBasket() throws InterruptedException {
        addItemOnBasket("10610426",1);
        checkElementOnPage(basketPage.getBtnMain());
        checkElementOnPage(basketPage.getCreditConteiner());
        checkElementOnPage(basketPage.getMotivationBanner());
    }

    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Изменение города")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727987")
    @Description("Верстка блока изменения города")
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


    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Изменение города")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727987")
    @Description("Изменение города в корзине")
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






    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Список товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727989")
    @Description("Переход на КТ с корзины")
    public void openCartItemFromBasket() throws InterruptedException {
        addItemOnBasket("10542186",1);
        clickOnElement(basketPage.getImageItemOnBasket());
        checkElementOnPage(cartPage.getNameItem());
        MobileElement nameItem = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Открыта КТ: " + nameItem.getText());


    }


    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Список товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727991")
    @Description("Отображение и кликабельность лейблов у товара")
    @Step
    public void checkLabelOnItem() throws InterruptedException {
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getLabel2ItemOnBasket());
        clickOnElement(basketPage.getLabel2ItemOnBasket());
        checkElementOnPage(basketPage.getBottomSheetLabel());
        checkElementOnPage(basketPage.getBottomSheetLabelTitle());
        checkElementOnPage(basketPage.getBottomSheetLabelClose());
        checkElementOnPage(basketPage.getBottomSheetLabelDesc());


    }


    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Блок тотал")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727996")
    @Description("Отображение блока тотала при наличии товаров в корзине и проверка его элементов")
    public void checkBoxTotal() throws InterruptedException {
        addItemOnBasket("беговая дорожка",1);
        checkElementOnPage(basketPage.getTotalBox());
        checkElementOnPage(basketPage.getTotalItemCount());
        checkElementOnPage(basketPage.getTotalItemCountSum());


    }



    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Блок 'нет в наличии'")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/728005")
    @Description("Отображение блока нет в наличии и проверка его элементов")
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

    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Кредит")
    @Link("")
    @Description("Проверка блока кредит и его элементов")
    public void checkBoxCredit() throws InterruptedException {
        addItemOnBasket("кроссовки",1);
        checkElementOnPage(basketPage.getCreditConteiner());
        checkElementOnPage(basketPage.getCreditIcon());
        checkElementOnPage(basketPage.getCreditLable());
        checkElementOnPage(basketPage.getCreditTitle());
        checkElementOnPage(basketPage.getCreditDetailsIcon());
        checkElementOnPage(basketPage.getCreditDesc());

    }
    @Test
    @Epic("Корзина")
    @Feature("Второй экран корзины")
    @Story("Кредит")
    @Link("")
    @Description("Проверка блока кредит и его элементов")
    public void availableForPickupInSingleStoreTrue() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        addItemsOnBasketFromListing(new String[]{"кроссовки","беговая дорожка","куртка",});








    }




}
