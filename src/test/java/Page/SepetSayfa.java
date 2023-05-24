package Page;

import Step.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SepetSayfa extends Method {
        private final By sepeteEkle=By.xpath("(//a[@class='round-btns fat add-to-basket'])[2]");
    public SepetSayfa(WebDriver driver) {
        super(driver);
    }
        public void menu()  {

            click(sepeteEkle);
        }
}
