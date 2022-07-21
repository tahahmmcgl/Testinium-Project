package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {
        WebDriver driver;
        WebDriverWait wait;
        ElementHelper elementHelper;
        By addToCartBtn=By.cssSelector(".add-to-cart.btn-orange.btn-ripple");
        By cartIcon=By.cssSelector(".common-sprite.fl .fl");
        By cartButtons=By.cssSelector(".mg-b-5 .button");

        public ProductPage(WebDriver driver) {

            this.driver = driver;
            this.wait = new WebDriverWait(driver, 10);
            this.elementHelper = new ElementHelper(driver);
        }
        public void clickAddToCart(){
            elementHelper.click(addToCartBtn);
        }
        public void checkCartIcon(String cartNum){
            elementHelper.checkElementText(cartIcon,cartNum);
        }
        public void clickCartButton(){
            elementHelper.click(cartIcon);
        }
        public void clickGoCartButton(String cardBtn){
            elementHelper.clickElementWithText(cartButtons,cardBtn);
        }


    }

