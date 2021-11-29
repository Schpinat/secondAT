package ua.privatbank;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondTest {
    @Test
    public void secondTest () throws InterruptedException {
        // Инициализируем веб-драйвер
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;

        Selenide.open("https://privatbank.ua/ru");
        Thread.sleep(10000);

//        System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver_win32\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
        // Заходим на страницу
// //       driver.get("https://privatbank.ua/ru");
//        // Ожидаем загрузки
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class=\"col-xs-6\"]")));
//        //Вытягиваем курс продажи доллара
//        String cursSale = (driver.findElement(By.xpath("//td[@id=\"USD_sell\"]")).getText());
//        //Очищаем поле ввода конвертера
//        driver.findElement(By.xpath("//input[@name=\"inner_currency\"]")).clear();
//        //Вставляем курс продажи
//        driver.findElement(By.xpath("//input[@name=\"inner_currency\"]")).sendKeys(cursSale);
//        //Ожидаем конвертации
//        Thread.sleep(3000);
//        //Вытягивае итоговое значение конвертации
//
//       // driver.findElement(By.xpath("//input[@name=\"outer_currency\"]")).getText();
//        String cursResult =  driver.findElement(By.xpath("//input[@name=\"outer_currency\"]")).getText();
//        System.out.println("curs from vidjet is " + cursResult);
//        //Проверяем итоговое значение конвертации
//        String etalonCursResult = "1";
//        System.out.println("etalon curs" + etalonCursResult);

       // Assert.assertEquals(cursResult,etalonCursResult);




    }

}

