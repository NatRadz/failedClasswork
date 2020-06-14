package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    private final By SUBCATHEGORY = By.xpath(".//a[@class='submenu-lvl2__list-item-link']");
    private final By MENU_ITEMS = By.xpath(".//a[@class ='submenu-lvl1__link']");


    public void selectMenuItem(String menuItem, String subCategoryName) {
        List<WebElement> menuItems = baseFunc.getElements(MENU_ITEMS);
        for (WebElement elementMenu : menuItems) {
            String elementName = elementMenu.getText();
            if ((elementName.equals(menuItem))) {
                baseFunc.moveMouseToElement(elementMenu);
                break;
            }
        }
        List<WebElement> subCathegories = baseFunc.getElements(SUBCATHEGORY);
        for (WebElement subcathegory : subCathegories) {
            String subName = subcathegory.getText();
            if (subName.equals(subCategoryName)) {
                baseFunc.moveMouseToElementAndClick(subcathegory);
                break;
            }
        }
    }
}
