package testRunners;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import util.DriverFactory;
import util.Hooks;


public class runner extends Hooks {
    WebDriver driver;
    Logger log=Logger.getLogger(runner.class);
    @Test
    public void loginTest() {
        HomePage homePage =new HomePage(DriverFactory.getDriver());
        SearchPage searchPage=new SearchPage(DriverFactory.getDriver());
        ProductPage productPage=new ProductPage(DriverFactory.getDriver());
        CartPage cartPage=new CartPage(DriverFactory.getDriver());

        homePage.checkHomePage();
        log.info("Home page checked");
        homePage.writeSearchBox("roman");
        log.info("Searched with the word 'Roman'");
        searchPage.selectProduct();
        log.info("Product Selected");
        productPage.clickAddToCart();
        log.info("Clicked add to cart");
        productPage.checkCartIcon("1");
        log.info("Checked the number of products added to the cart");
        productPage.clickCartButton();
        log.info("Clicked cart button");
        productPage.clickGoCartButton("Sepete Git");
        log.info("Clicked go cart button");
        cartPage.changeProductQuantity("1");
        log.info("amount increased");
        cartPage.clickRefreshIcon();
        log.info("Clicked refresh icon");
        cartPage.seeRefreshingMessage("Sepetiniz güncelleniyor!");
        log.info("Refreshing message checked");
        cartPage.clickCrossButton();
        log.info("Clicked the cross button");
        cartPage.checkCartMessage();
        log.info("Cart message checked, cart is null");
        cartPage.checkCartIcon("0");
        log.info("Cart icon checked, card is null");
    }

}
