package ua.privatbank;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;


public class SecondTest {
    @Test

    public void emailTest () throws InterruptedException {
        // Инициализируем веб-драйвер
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;

        Selenide.open("https://accounts.ukr.net/login?lang=ru");

        Selenide.$x("//input[@name='login']").setValue("schpinat");
        Selenide.$x("//input[@name='password']").setValue("test123test");
        Selenide.$x("//button[@type='submit']").click();
        Selenide.$x("//button[@class='button primary compose']").click();
        Selenide.$x("//input[@name=\"toFieldInput\"]").setValue("schpinat@ukr.net");

        Selenide.$x("//input[@name=\"subject\"]").setValue("SPAM");
        Selenide.$x("//iframe[@id=\"mce_0_ifr\"]").click();
        Selenide.$x("//iframe[@id=\"mce_0_ifr\"]").sendKeys("Это сообщение было отправлено автоматизированным программным обеспечением.");
        Selenide.$x("//div[@class = \"controls\"]/button[@class = \"button primary send\" ]").click();

    }

}

