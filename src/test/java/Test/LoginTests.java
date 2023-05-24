package Test;

import Page.AnaSayfa;
import Page.ProductPage;
import Page.SepetSayfa;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

    WebDriver driver;
    @BeforeEach
    void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void gratisLoginTesti() throws InterruptedException{
        driver.get("https://www.gratis.com");
        AnaSayfa anaSayfa=new AnaSayfa(driver);
        anaSayfa.menu();
        Assertions.assertNotNull(anaSayfa.siteControl(),"Site acilmadi");
        ProductPage productPage=new ProductPage(driver);
        productPage.menu();
        Assertions.assertNotNull(productPage.urlControl(),"URL'de ürün bulunamadı.");
        SepetSayfa sepetSayfa=new SepetSayfa(driver);
        sepetSayfa.menu();
        Thread.sleep(500000);

    }

    @AfterEach
    void tearDown(){
        driver.close();
    }
}
