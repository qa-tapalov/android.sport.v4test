package PageObject;


import BasePage.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class InitialClass extends BaseClass{



    public CatalogPage cPage = new CatalogPage();
    public AuthorizationPage authPage = new AuthorizationPage();
    public SearchBar sBar = new SearchBar();
    public ListingPage lPage = new ListingPage();
    public CartItemPage cartPage = new CartItemPage();
    public BasketPage basketPage = new BasketPage();


    //открытие плитки через поиск
    public void openListing(String keys) throws InterruptedException {

        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getSearchBar());
        driver.findElement(cPage.getSearchBar()).sendKeys(keys);
        Thread.sleep(1500);
        tapByCoordinates(981, 1913);
    }

    //добавление товара в корзину и переход в корзину.
    public void addItemOnBasket(String id, int x) throws InterruptedException {
        openListing(id);
        //1 означает, что для данного товара присутствует выбор размера
        //2 означает что для данного товара нет выбора размера
        //3 добавляет в корзину с КТ
        if (x==1){
            clickOnElement(lPage.getBasketBtn());
            clickOnElement(lPage.getSizeElement1());
            clickOnElement(lPage.getAddBasketBtn());
            checkElementOnPage(cartPage.getSnackSuccessAddBasket());
            tapByCoordinates(100,250);
            clickOnElement(basketPage.getBasket());

        }
       else if(x==2){
            clickOnElement(lPage.getBasketBtn());
            checkElementOnPage(cartPage.getSnackSuccessAddBasket());
            tapByCoordinates(100,250);
            clickOnElement(basketPage.getBasket());
        }
        else if(x==3){
            clickOnElement(lPage.imageItem);
            scrollByCoord(50,1700,50,500,1);
            clickOnElement(cartPage.getAddBasketMain());
            checkElementOnPage(cartPage.getSnackSuccessAddBasket());
            tapByCoordinates(100,250);
            clickOnElement(basketPage.getBasket());


        }

    }


    //Click on element
    public void clickOnElement(By element){

       wait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).click();

        System.out.println("Click on element: " + element);

    }

    //checking for the presence of an element
    public void checkElementOnPage(By element){

        try{
            MobileElement object = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(element));
            object.getText();
            driver.findElement(element);
            System.out.println("Элемент присутствует " + element);

        }
        catch (Exception e){

            System.out.println("Элемент отсутствует " + element);


        }

    }

//    public void checkElementOnPageWithText(String keys){
//        BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(keys));
//        BaseClass.driver.findElement(keys);
//    }


    public void sendKeys(By element, String keys){
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).sendKeys(keys);

    }

    //Scroll by coordinates
    public void scrollByCoord( int x1, int y1, int x2, int y2, int j) throws InterruptedException {
        AndroidTouchAction action = new AndroidTouchAction(driver);

        Thread.sleep(2500);
        for (int i = 0; i < j; i++) {
            action.press(PointOption.point(x1, y1))
                    .waitAction(waitOptions(ofMillis(1000)))
                    .moveTo(PointOption.point(x2, y2))
                    .release()
                    .perform();
        }
    }

    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    //Tap by coordinates
    public void tapByCoordinates (int x,  int y) {
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }


    //Press by element
    public void pressByElement (AndroidElement element, long seconds) {
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action
                .press(element(element))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }


    //Press by coordinates
    public void pressByCoordinates (int x, int y, long seconds) {
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action
                .press(point(x,y))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }

    //Swipe by elements
    public void swipeByElements (AndroidElement startElement, AndroidElement endElement) {
        AndroidTouchAction action = new AndroidTouchAction(driver);

        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        action
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    //Scroll to element
    public void scrollToElementById() {
//        Dimension dimensions = driver.manage().window().getSize();
//        double point = dimensions.getHeight() * 0.45;
//        int pointAsAnInteger = (int) point;
//
//        int element_Count = driver.findElements(element).size();
//        System.out.println("Element count is : " + element_Count);
//
//        do {
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(0 , pointAsAnInteger * 2))
//                    .moveTo(PointOption.point(0 , pointAsAnInteger))
//                    .release()
//                    .perform();
//            element_Count = driver.findElements(element).size();
//            System.out.println("Element count is : " + element_Count);
//        } while(element_Count==0);
//        Dimension dimensions = driver.manage().window().getSize();
//        Double point = dimensions.getHeight() * 0.45;
//        int pointAsAnInteger = point.intValue();
//
        int spinner_Count = driver.findElements(By.id("ru.sportmaster.app.v4:id/by_cart_include")).size();
        System.out.println("Spinner count is : " + spinner_Count);

        do {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(560 , 1750))
                    .moveTo(PointOption.point(560 , 350))
                    .waitAction(waitOptions(ofMillis(1000)))
                    .release()
                    .perform();
            spinner_Count = driver.findElements(By.id("ru.sportmaster.app.v4:id/by_cart_include")).size();
            System.out.println("Spinner count is : " + spinner_Count);
        } while(spinner_Count==0);








    }


    //checking if element is displayed
    public void isElementDisplayed(By element) throws InterruptedException {
        Thread.sleep(2000);
        try{
             driver.findElement(element).isDisplayed();
            System.out.println("Элемент найден " + element);

        }catch(Exception e){
            System.out.println("Элемент скрыт " + element);
        }
    }

    //Assert element
    public void assertElementByText(By element, String keys){
       MobileElement compare = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(element));
        if (compare.getText().equals(keys)){
            System.out.println("Надпись соответствует: " + compare.getText());
        }
        else {
            System.out.println("Надпись не соответствует: " + compare.getText());

        }

    }

    // assert element to element
    public void assertElementToElement(By element1, By element2, int x1, int y1, int x2, int y2, int j) throws InterruptedException {
        MobileElement compare1 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(element1));
        compare1.getText();

        scrollByCoord( x1,  y1,  x2,  y2,  j);
        MobileElement compare2 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(element2));
        if (compare2.getText().equals(compare1.getText())){
            System.out.println("Значения равны: " + compare2.getText());
        }
        else {
            System.out.println("Значения не равны: " + compare2.getText());

        }

    }


}
