package util;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class Hooks {

    WebDriver driver;
    Properties properties;

    Logger log =Logger.getLogger(Hooks.class);


    @Before
    public void before() {

        properties = ConfigReader.initialize_Properties();
        String browser= properties.getProperty("browser");
        driver = DriverFactory.initialize_Driver(browser);
        log.info("Driver start succesfully");
    }

    @After
    public void after() {
        log.info("Driver will be close");
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
