package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BaseFunc {
    public WebDriver driver;
    Actions actions;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        actions = new Actions(driver);
    }

    public void openApplication(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }
        driver.get(url);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }


    public void moveMouseToElement(WebElement element){

        actions.moveToElement(element).perform();
    }

    public void moveMouseToElementAndClick(WebElement element){
        actions.moveToElement(element).click().build().perform();
    }

}
