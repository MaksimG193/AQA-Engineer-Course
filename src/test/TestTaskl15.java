package test;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaskl15 {

    @Test
    public void main() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://mts.by");


        WebElement cookieClick = driver.findElement(By.xpath("//button[@class = 'btn btn_black cookie__ok']"));
        cookieClick.click();

        //1. Проверить название указанного блока
        WebElement blockName = driver.findElement(By.xpath("//section[@class = 'pay']//h2"));
        assertEquals("Онлайн пополнение" + "\n" + "без комиссии", blockName.getText());

        //2. Проверить наличие логотипов платёжных систем
        List<WebElement> payPartners = driver.findElements(By.xpath("//div[@class='pay__partners']"));
        for(WebElement logo : payPartners) {
            Assert.isTrue(
                    (logo.getSize().width > 0 && logo.isDisplayed())
                    , logo.getAttribute("alt") + " не отображается на странице"
            );
        }
        //3. Проверить работу ссылки «Подробнее о сервисе»
        WebElement clickServiceInfo =  driver.findElement((By.linkText("Подробнее о сервисе")));
        clickServiceInfo.click();

        //Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)
        driver.navigate().back();
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@class = 'phone']"));
        phoneNumberField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[@class = 'button button__default ']"));
        continueButton.click();

        driver.quit();
    }

    }



