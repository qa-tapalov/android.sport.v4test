package pages;

import core.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.time.Duration;

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


    public void sendKeys(By element, String keys){
        BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(element));
        BaseClass.driver.findElement(element).sendKeys(keys);

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
        new AndroidTouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    //Tap by coordinates

    public void tapByCoordinates (int x,  int y) {
        new AndroidTouchAction(driver)
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }




}
