package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By selectedProduct=By.cssSelector(".product-cr:nth-child(5) .name");


    public SearchPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void selectProduct(){
        elementHelper.click(selectedProduct);
    }
}



