package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class AuthorizationTest extends InitialClass {


    // проверка наличия элементов на экране авторизации
    @Test
    public void checkAuthPage(){
        clickOnElement(authPage.getProfilePage());
        checkElementOnPage(authPage.getCloseBtn());
        checkElementOnPage(authPage.getCountryCode());
        checkElementOnPage(authPage.getPhoneEdit());
        checkElementOnPage(authPage.getTitle());
        checkElementOnPage(authPage.getAuthBtn());
        checkElementOnPage(authPage.getVkBtn());
        checkElementOnPage(authPage.getOkBtn());
        checkElementOnPage(authPage.getFbBtn());

    }

    @Test
    public void sendIncorrectCode(){
        clickOnElement(authPage.getProfilePage());
        sendKeys(authPage.getPhoneEdit(),"9999999999");
        clickOnElement(authPage.getAuthBtn());
        sendKeys(authPage.getSendCodeBar(),"1111");
        checkElementOnPage(authPage.getIncorrectCode());

    }

//авторизация по номеру телефона, используя автоподтановку кода, средствами андроида
//    @Test
//    public void authWithNumber() throws InterruptedException{
//        clickOnElement(authPage.getProfilePage());
//        sendKeys(authPage.getPhoneEdit(),"9372508072");
//        clickOnElement(authPage.getAuthBtn());
//
//        clickOnElement(authPage.getAlertGoogle());
//
//
//
//    }

}
