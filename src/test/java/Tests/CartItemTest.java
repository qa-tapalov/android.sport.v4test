package Tests;

import io.appium.java_client.MobileElement;
import org.junit.Test;
import PageObject.InitialClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartItemTest extends InitialClass {


    //проверка элементов в карточке товара
    //https://testrail.app.local/testrail/index.php?/cases/view/684815
    @Test
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

    //взаимодействие с картинкой товара
    //https://testrail.app.local/testrail/index.php?/cases/view/684813
    @Test
    public void imageGallery() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        clickOnElement(cartPage.getImage());
        clickOnElement(cartPage.getCloseImageGallery());
        checkElementOnPage(cartPage.getIndicatorGallery());
    }


    //воспроизведение видео
    //https://testrail.app.local/testrail/index.php?/cases/view/684816
    @Test
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


    //отображение рич контента
    //https://testrail.app.local/testrail/index.php?/cases/view/687803

    @Test
    public void checkItemWithRichContent() throws InterruptedException {
        openListing("10558310");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getRichContent());
        clickOnElement(cartPage.getRichContent());
        checkElementOnPage(cartPage.getRichWebView());


    }




    //открытие таблицы размеров
    //https://testrail.app.local/testrail/index.php?/cases/view/684821
    @Test
    public void openTableSize() throws InterruptedException {
        openListing("10674141");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getTable_size_link());
        checkElementOnPage(cartPage.getTableSizeView());
        clickOnElement(cartPage.getCloseTableBtn());
        MobileElement item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.getNameItem()));
        System.out.println("Карточка товара: " + item.getText());

    }





    //проверка появления блока доступности товара в магазине
    //https://testrail.app.local/testrail/index.php?/cases/view/684825
    @Test
    public void checkDefaultPickup() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        isElementDisplayed(cartPage.getPickup_title());
        assertElementByText(cartPage.getDefaultState(), "Для отображения наличия, выберите размер");
        clickOnElement(cartPage.getSizeItem());
        isElementDisplayed(cartPage.getPickup_title());
    }


    //проверка появления алерта, если не выбрать размер
    //https://testrail.app.local/testrail/index.php?/cases/view/684819
    @Test
    public void checkSnackChooseSize() throws InterruptedException {
        openListing("10656190");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getAddBasketMain());
        isElementDisplayed(cartPage.getSnackChooseSize());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getAddBasketFloatBtn());
        isElementDisplayed(cartPage.getSnackChooseSize());
    }

    //проверка появления плавающей кнопки добавления товара в корзину

    @Test
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
    public void addBasketFromCartItem() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        scrollByCoord(50,1700,50,500,1);
        clickOnElement(cartPage.getSizeItem());
        clickOnElement(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getSnackSuccessAddBasket());
        assertElementByText(cartPage.getSnackSuccessAddBasket(),"Товар добавлен в корзину!");




    }










}
