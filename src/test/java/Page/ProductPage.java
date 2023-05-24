package Page;

import Step.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends Method {
        private final By markalar=By.xpath("//div[@class='form-group checkbox-structure']");
        private final By urunSec=By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-6 product-card-wrapper']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
        public void menu() throws InterruptedException{
            randomProductSelected(markalar);
            randomProductSelected(markalar);
            randomProductSelected(urunSec);
    }
    public WebElement urlControl(){
        return findElement(markalar);
}
}
