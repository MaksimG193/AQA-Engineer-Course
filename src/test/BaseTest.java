package test;

import InfoDataTaskl15.InfoBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.xpath.XPathEvaluator;

import java.util.concurrent.TimeUnit;

import static InfoDataTaskl15.InfoBaseTest.MTS_URL;


public class BaseTestTaskl15 {

    static WebDriver driver ;


    @BeforeEach
    public void setDriver(){

        System.setProperty("webdriver.chrome.driver" , System.getenv("DRIVER"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(InfoBaseTest.MTS_URL);
        clickCookie();

    }
    public static void clickCookie(){

        driver.get(MTS_URL);
        WebElement clickCookie = driver.findElement(By.xpath(InfoBaseTest.COOKIE_BUTTON_AGREE));
        clickCookie.click();

    }

    @AfterEach
    public void quit() {
        driver.quit();
    }
}
