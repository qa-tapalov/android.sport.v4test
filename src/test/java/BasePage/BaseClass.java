package BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static WebDriverWait wait;
    public static AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
//        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("appPackage", "ru.sportmaster.app.v4");
        capabilities.setCapability("appActivity", "ru.sportmaster.app.view.AppActivity");
//        capabilities.setCapability("noReset","true");
        capabilities.setCapability("automationName", "UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(url, capabilities);
        wait = new WebDriverWait(driver, 10);

        System.out.println("Приложение запущено");
        System.out.println();

    }



    @After
    public void tearDown()  {
        driver.quit();
        System.out.println();
        System.out.println("Приложение закрыто");

    }




















}
