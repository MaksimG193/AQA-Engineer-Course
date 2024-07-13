package test;

import InfoDataTaskl15.InfoBaseTest;
import InfoDataTaskl15.InfoData;
import LogicsTaskl15.LogicsTaskl15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;
import org.openqa.selenium.WebElement;


public class TestTaskl15 extends BaseTestTaskl15 {

    @Test
    @DisplayName("1. Проверить название указанного блока")
    public void checkBlock(){
        LogicsTaskl15 checkBlock = new LogicsTaskl15(driver);
        Assertions.assertEquals(InfoData.ONLAIN_PAY, checkBlock.getTitle().getText(),
                "Название не соответствует");

    }

    @ParameterizedTest
    @DisplayName("Проверка наличия логотипов платёжных систем")
    @ValueSource(strings = {InfoData.VISA, InfoData.VERIFIED_BY_VISA, InfoData.MASTER_CARD,
    InfoData.MASTER_CARD_SECURE_CODE, InfoData.BEL_CARD})
    public void checkLogoPay(String input){

        LogicsTaskl15 logicsTaskl15 = new LogicsTaskl15(driver);
        Assertions.assertTrue(logicsTaskl15.getLogoListOfStrings().contains(input),
                "Изображение отсутствует" + input);
        Assertions.assertTrue(logicsTaskl15.getLogoList().stream().allMatch(WebElement ::isDisplayed));

    }

    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
    public void checkLinkMoreAboutService(){

        LogicsTaskl15 logicsTaskl15 = new LogicsTaskl15(driver);
        Assertions.assertNotEquals(InfoBaseTest.MTS_URL, logicsTaskl15.getCurrentUrl(),
                "Ссылка не работает");

    }

    @Test
    @DisplayName("Проверка работы кнопки «Продолжить»")
    public void checkContinueButton(){
        LogicsTaskl15 logicsTaskl15 = new LogicsTaskl15(driver);
        logicsTaskl15.fillCommunicationServices();
        Assertions.assertTrue(logicsTaskl15.getIframe().isDisplayed(), "Button not click");
    }


    }










