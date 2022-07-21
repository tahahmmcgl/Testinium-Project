package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.security.Key;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By homePageItem=By.cssSelector(".box.gray.no-padding.bestseller-pr-vertical .box-heading .ribbon-container");
    By searchBox=By.id("search-input");
    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkHomePage(){
        elementHelper.presenceElement(homePageItem);
    }
    public void writeSearchBox(String searchedProduct) {
        elementHelper.sendKey(searchBox,searchedProduct);
        elementHelper.sendKey(searchBox, String.valueOf(Keys.ENTER));
    }


}
