package oneLVTests;

import core.BaseFunc;
import org.junit.Before;
import org.junit.Test;
import pageObjects.HomePage;

public class GrozsTest {

    BaseFunc baseFunc = new BaseFunc();;

    @Before
    public void navigateToSite() {
        baseFunc.openApplication("https://www.1a.lv/");
    }

    @Test
    public void grozsTest() {

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectMenuItem("Sports un fitness", "Velosipēdi");

    }

}
