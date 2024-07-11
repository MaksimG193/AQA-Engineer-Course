package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CheckDisplayLabels extends BaseTest {

    private void switchToPayment(){

        WebElement phone = driver.findElement(By.xpath(PHONE_NUMBER_FIELD));
        phone.click();
        phone.sendKeys(PHONE_NUMBER);
        WebElement sum = driver.findElement(By.xpath(SUM_NUMBER_FIELD));
        sum.click();
        sum.sendKeys("3");
        sum.submit();
        WebElement iframe = driver.findElement(By.xpath(IFRAME_PAYMENT));
        driver.switchTo().frame(iframe);
    }

    @Test
    @DisplayName("Проверить корректность отображения суммы в окне (в том числе на кнопке)")
    public void checkSumCorrect(){

        switchToPayment();
        WebElement depositAmount = driver.findElement(By.xpath("//input[contains(@class,'total_rub')]"));
        WebElement buttonDepositAmount = driver.findElement(By.xpath(BUTTON_DEPOSIT_XPATH));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(buttonDepositAmount));

        assertAll(
                () -> assertEquals("2.00 BYN", depositAmount.getText()),
                () -> assertEquals("Оплатить 2.00 BYN", buttonDepositAmount.getText()));
    }

    @Test
    @DisplayName("Проверить корректность отображения номера телефона")
    public void checkPhoneNumberCorrect() {

        switchToPayment();
        WebElement paymentInfo = driver.findElement(By.xpath("//input[contains(@class,'phone')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(paymentInfo));
        String expected = "Оплата: Услуги связи Номер:375297777777";
        assertEquals(expected, paymentInfo.getText());
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях для ввода реквизитов карты")
    public void checkTextIBlankCard() {

        switchToPayment();
        WebElement cardNumberField = driver.findElement(By.xpath("//input[contains(@id,'cc-number')]"));
        WebElement durationPeriodField = driver.findElement(By.xpath("//input[contains(@placeholder,'MM / YY')]"));
        WebElement holderNameField = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c46-3 ng-star-inserted')]"));
        WebElement CVCField = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c46-3 ng-star-inserted')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(cardNumberField));

        String expectedCardNumberField = "Номер карты";
        String expectedDurationPeriodField = "Срок действия";
        String expectedHolderNameField = "Имя держателя (как на карте)";
        String expectedCVCField = "CVC";

        assertAll(
                () -> assertEquals(expectedCardNumberField, cardNumberField.getText()),
                () -> assertEquals(expectedDurationPeriodField, durationPeriodField.getText()),
                () -> assertEquals(expectedHolderNameField, holderNameField.getText()),
                () -> assertEquals(expectedCVCField, CVCField.getText()));
    }

    @Test
    @DisplayName("Проверить наличие иконок платёжных систем")
    public void checkPaymentSystemIcon() {

        switchToPayment();
        WebElement header = driver.findElement(By.xpath("//div[contais(@class,'header__container')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(header));

        List<WebElement> logoElements = driver.findElements(By.xpath("//div[contains(@class,'icons-container ng-tns-c46-1')]"));
        for (WebElement logo : logoElements) {
            assertTrue(logo.isDisplayed());
        }
    }
    }
