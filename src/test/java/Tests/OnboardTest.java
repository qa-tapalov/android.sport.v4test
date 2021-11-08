package Tests;

import PageObject.InitialClass;
import org.junit.Test;

import java.io.IOException;

public class OnboardTest extends InitialClass {

    @Test
    public void testtt() throws InterruptedException, IOException {
        clickOnElement(onboardPage.getForwardBtn());
        captureScreenShots();
    Thread.sleep(5000);
    }

}
