package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By productQuantity=By.cssSelector(".js-cart-update-product input:nth-child(1)");
    By refreshIcon=By.cssSelector(".fa.fa-refresh.green-icon");
    By refreshingMessage=By.cssSelector(".swal2-title.ky-swal-title-single");
    By crossButton=By.cssSelector(".fa.fa-times.red-icon");
    By cartEmptyMessage=By.cssSelector(".grid_9.alpha.omega .content");
    By cartIcon=By.cssSelector(".common-sprite.fl span");


    public CartPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void changeProductQuantity(String numberOfIncrements){
        String oldQuantity=elementHelper.getAttribute(productQuantity,"value");
        int productOldQuantity=Integer.parseInt(oldQuantity);
        int incrementNum=Integer.parseInt(numberOfIncrements);
        int newProductQuantity=productOldQuantity+incrementNum;
        String productNewQuantity=Integer.toString(newProductQuantity);
        elementHelper.clearElement(productQuantity);
        elementHelper.sendKey(productQuantity,productNewQuantity);
    }
    public void clickRefreshIcon(){
        elementHelper.click(refreshIcon);
    }
    public void seeRefreshingMessage(String refreshMsg){
        elementHelper.checkElementText(refreshingMessage,refreshMsg);
    }
    public void clickCrossButton(){
        elementHelper.click(crossButton);
    }
    public void checkCartMessage(){
        elementHelper.presenceElement(cartEmptyMessage);
    }
    public void checkCartIcon(String addedProductNum){
        elementHelper.checkElementText(cartIcon,addedProductNum);
    }

}
