package Tests;

import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.Test;
import PageObject.InitialClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartItemTest extends InitialClass {




    @Test
    @Epic("Карточка товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684815")
    @Description("Проверка элементов в карточке товара")
    public void checkElementOnCartItem() throws InterruptedException {
        openListing("10656190");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getBackBtn());
        checkElementOnPage(cartPage.getFavorite());
        checkElementOnPage(cartPage.getCompare());
        checkElementOnPage(cartPage.getShare());
        checkElementOnPage(cartPage.getImage());
        checkElementOnPage(cartPage.getPlayVideo());
        checkElementOnPage(cartPage.getMarkers());
//        checkElementOnPage(cartPage.getRichContent());
        checkElementOnPage(cartPage.getBrand());
        checkElementOnPage(cartPage.getRatingBarSvg());
        checkElementOnPage(cartPage.getRatingText());
        checkElementOnPage(cartPage.getNameItem());
        scrollByCoord(50,1700,50,500,1);
        checkElementOnPage(cartPage.getPrice());
        checkElementOnPage(cartPage.getColorText());
        checkElementOnPage(cartPage.getColors());
        checkElementOnPage(cartPage.getColorImage());
        checkElementOnPage(cartPage.getSizeGroup());
        checkElementOnPage(cartPage.getSizes());
        checkElementOnPage(cartPage.getTable_size_link());
        checkElementOnPage(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getDefaultState());
//        checkElementOnPage(cartPage.getDescriptionTitle());
        checkElementOnPage(cartPage.getDescription());
//        checkElementOnPage(cartPage.getSpecificationsTitle());

    }



    @Test
    @Epic("Карточка товара")
    @Feature("Фото товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684813")
    @Description("Взаимодействие с картинкой товара")
    public void imageGallery() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        clickOnElement(cartPage.getImage());
        clickOnElement(cartPage.getCloseImageGallery());
        checkElementOnPage(cartPage.getIndicatorGallery());
    }



    @Test
    @Epic("Карточка товара")
    @Feature("Видео товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684816")
    @Description("Наличие кнопки воспроизведения видео и воспроизведение видео")
    public void videoOnItem() throws InterruptedException {
        openListing("10656190");
        clickOnElement(lPage.getImageItem());
        clickOnElement(cartPage.getPlayVideo());
        checkElementOnPage(cartPage.getVideoPlayer());
        tapByCoordinates(590,1080);
        driver.navigate().back();
//        clickOnElement(cartPage.getCloseVideoPlayer());
        MobileElement item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Карточка товара: " + item.getText());


    }





    @Test
    @Epic("Карточка товара")
    @Feature("Товар с рич контентом")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/687803")
    @Description("Отображение рич контента и его кликабельность")
    public void checkItemWithRichContent() throws InterruptedException {
        openListing("10558310");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getRichContent());
        clickOnElement(cartPage.getRichContent());
        checkElementOnPage(cartPage.getRichWebView());


    }






    @Test
    @Epic("Карточка товара")
    @Feature("Таблица размеров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684821")
    @Description("Проверка наличия ссылки на таблицу размеров и её открытие")
    public void openTableSize() throws InterruptedException {
        openListing("10674141");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        checkElementOnPage(cartPage.getTable_size_link());
        clickOnElement(cartPage.getTable_size_link());
        checkElementOnPage(cartPage.getTableSizeView());
        clickOnElement(cartPage.getCloseTableBtn());
        MobileElement item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Карточка товара: " + item.getText());

    }





    //
    //
    @Test
    @Epic("Карточка товара")
    @Feature("Блок доступности")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684825")
    @Description("Проверка появления блока доступности товара в магазине")
    public void checkDefaultPickup() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        isElementDisplayed(cartPage.getPickup_title());
        assertElementByText(cartPage.getDefaultState(), "Для отображения наличия, выберите размер");
        clickOnElement(cartPage.getSizeItem());
        isElementDisplayed(cartPage.getPickup_title());
    }




    @Test
    @Epic("Карточка товара")
    @Feature("Добавление в корзину с КТ")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684819")
    @Description("Проверка появления алерта, при добавлении в корзину, если не выбрать размер")
    public void checkSnackChooseSize() throws InterruptedException {
        openListing("10656190");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getAddBasketMain());
        assertElementByText(cartPage.getSnackChooseSize(),"Выберите размер");
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getAddBasketFloatBtn());
        isElementDisplayed(cartPage.getSnackChooseSize());
    }



    @Test
    @Epic("Карточка товара")
    @Feature("Добавление в корзину с КТ")
    @Link("")
    @Description("Проверка появления плавающей кнопки добавления товара в корзину и её элементов")
    public void checkAddBacketFloat() throws InterruptedException {
        openListing("10656190");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,2);
        isElementDisplayed(cartPage.getAddBasketMain());
        isElementDisplayed(cartPage.getAddBasketFloat());
        checkElementOnPage(cartPage.getPriceFloat());
        checkElementOnPage(cartPage.getAddBasketFloatBtn());
    }

    //успешное добавление в корзину из КТ
    //https://testrail.app.local/testrail/index.php?/cases/view/684830
    @Test
    @Epic("Карточка товара")
    @Feature("Добавление в корзину с КТ")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684830")
    @Description("Успешное добавление в корзину из КТ по главной кнопке 'В корзину'")
    public void addBasketFromCartItemMainButton() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getSizeItem());
        clickOnElement(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getSnackSuccessAddBasket());
        assertElementByText(cartPage.getSnackSuccessAddBasket(),"Товар добавлен в корзину!");


    }


    @Test
    @Epic("Карточка товара")
    @Feature("Добавление в корзину с КТ")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684830")
    @Description("Успешное добавление в корзину из КТ по плавающей кнопке 'В корзину'")
    public void addBasketFromCartItemFloatButton() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getSizeItem());
        scrollByCoord(50,1700,50,500,2);
        clickOnElement(cartPage.getAddBasketFloatBtn());
        checkElementOnPage(cartPage.getSnackSuccessAddBasket());
        assertElementByText(cartPage.getSnackSuccessAddBasket(),"Товар добавлен в корзину!");


    }







}
