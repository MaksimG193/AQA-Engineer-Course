package LogicsTaskl15;

import InfoDataTaskl15.InfoData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicsTaskl15 {
    WebDriver driver;
    WebDriverWait driverwait;
    WebElement title;
    List<WebElement> logoList;
    WebElement buttonMoreAboutService;
    WebElement phoneNumber;
    WebElement sum;
    WebElement buttonContinue;
    WebElement iframe;



    public LogicsTaskl15(WebDriver driver){

        this.driver = driver;
        driverwait = new WebDriverWait(driver , Duration.ofSeconds(15));
        this.title = driver.findElement(By.xpath(InfoData.TITLE_FORM));
        this.logoList = driver.findElements(By.xpath(InfoData.LOGO_PAY));
        this.buttonMoreAboutService = driver.findElement(By.xpath(InfoData.MORE_ABOUT_THE_SERVICE);
        this.phoneNumber = driver.findElement(By.xpath(InfoData.PHONE_NUMBER));
        this.sum = driver.findElement(By.xpath(InfoData.SUM_RUB));

    }

    public List<WebElement> getLogoList(){
        return logoList;

    }

    public WebElement getTitle(){
        return title;

    }

    public WebElement getButtonMoreAboutService(){
        return buttonMoreAboutService;

    }

    public List<String> getLogoListOfStrings() {
        return logoList.stream()
                .map(webElement -> webElement.getAttribute("alt"))
                .collect(Collectors.toList());

    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();

    }

    public void fillCommunicationServices(Map<String, String> inputData) {
        phoneNumber = driver.findElement(By.xpath("//div[@class='input-wrapper input-wrapper_label-left']" +
                "/input[@class='phone'][../label[@for='connection-phone']]"));
        phoneNumber.sendKeys(inputData.get("phone"));

        sum = driver.findElement(By.xpath("//div[@class='input-wrapper input-wrapper_label-right']" +
                "/input[@class='total_rub'][../label[@for='connection-sum']]"));
        sum.sendKeys(inputData.get("sum"));

        buttonContinue = driver.findElement(By.xpath("//form[@class='pay-form opened']/button[contains(text(), " +
                "'Продолжить')]"));
        buttonContinue.click();

    }

    public WebElement getIframe() {
        iframe = driver.findElement(By.xpath(InfoData.IFRAME));
        return iframe;
    }




}
