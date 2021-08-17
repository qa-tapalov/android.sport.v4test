package pages;

import core.BaseClass;
import io.appium.java_client.MobileBy;
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



    //Click on element
    public void clickOnElement(By element){

        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        driver.findElement(element).click();

        System.out.println("Click on element" + element);
    }

    //checking for the presence of an element
    public void checkElementOnPage(By element){
        try{
            BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(element));
            BaseClass.driver.findElement(element);
            System.out.println("Элемент '" + element + "' присутствует");

        }
        catch (Exception e){

            System.out.println("Элемент " + element + " отсутствует");


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
    public void scrollByCoord( int x1, int y1, int x2, int y2){
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action.press(PointOption.point(x1,y1))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(x2,y2))
                .release()
                .perform();

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
    public boolean scrollToElementById(String element) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                    ".scrollIntoView(new UiSelector().resourceId(\" + element + \").instance(0))"));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Scroll to element failed");
            return false;
        }
    }

//    public void invisibilityElement(By element){
//        MobileElement element1 = driver.findElement(ExpectedConditions.invisibilityOfElementWithText(element));
//        System.out.println("Элемент скрыт");
//    }

    //checking if element is displayed
//    public void checkElementDisplayed(By element){
//        if(driver.findElement(element).isDisplayed()){
//            System.out.println("Элемент найден");
//        }
//        else{
//            System.out.println("Элемент скрыт");
//
//        }
//    }
    public void isElementDisplayed(By element){
        try{
             driver.findElement(element).isDisplayed();
            System.out.println("Элемент найден" + element);

        }catch(Exception e){
            System.out.println("Элемент скрыт" + element);
        }
    }

}
