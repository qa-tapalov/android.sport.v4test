package pages;

import core.BaseClass;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InitialClass extends BaseClass{


    public CatalogPage cPage = new CatalogPage();
    public AuthorizationPage authPage = new AuthorizationPage();
    public SearchBar sBar = new SearchBar();
    public ListingPage lPage = new ListingPage();
    public CartItemPage cartPage = new CartItemPage();


    public void clickOnElement(By element){

        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        driver.findElement(element).click();

        System.out.println("Click on element" + element);
    }


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

    public void scrollByCoord( int x1, int y1, int x2, int y2){
       AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(PointOption.point(x1,y1)).moveTo(PointOption.point(x2,y2)).release().perform();

    }







}
