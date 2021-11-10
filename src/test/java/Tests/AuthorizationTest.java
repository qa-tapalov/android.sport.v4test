package Tests;

import PageObject.InitialClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import org.junit.Test;

import java.io.IOException;

public class AuthorizationTest extends InitialClass {



    @Epic("Авторизация")
    @Link("")
    @Description("Проверка наличия элементов на экране авторизации")
    @Test
    public void checkAuthPage() throws IOException {
        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(authPage.getProfilePage());
        clickOnElement(profilePage.getAuthBtn());
        checkElementOnPage(authPage.getCloseBtn());
        checkElementOnPage(authPage.getCountryCode());
        checkElementOnPage(authPage.getPhoneEdit());
        checkElementOnPage(authPage.getTitle());
        checkElementOnPage(authPage.getAuthBtn());
        checkElementOnPage(authPage.getVkBtn());
        checkElementOnPage(authPage.getOkBtn());
        checkElementOnPage(authPage.getFbBtn());


    }

    @Epic("Авторизация")
    @Link("")
    @Description("Появление алерта ошибки при вводе неверного кода подтверждения")
    @Test
    public void sendIncorrectCode() {
        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(authPage.getProfilePage());
        clickOnElement(profilePage.getAuthBtn());
        sendKeys(authPage.getPhoneEdit(), "9999999999");
        clickOnElement(authPage.getAuthBtn());
        sendKeys(authPage.getSendCodeBar(), "1111");
        checkElementOnPage(authPage.getIncorrectCode());

    }
}