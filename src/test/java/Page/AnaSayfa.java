package Page;


import Step.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AnaSayfa extends Method{

    private final By ciltBakimi= By.xpath("(//a[text()=\"Cilt Bakım\"])[2]");
    private final By ciltBakimiUrunleri=By.xpath("//ul[@class=\"nav-list\"]//../div[@class=\"mega-menu\"]//..//a[@data-bind and text()=\"Cilt Bakım\"]//..//div[@class=\"container\"]//..//li//a");


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
    public void menu() throws InterruptedException{
        //waitUntilElementVisible(ciltBakimi);
        //click(ciltBakimi);
        hoverElement(ciltBakimi);
        randomProductSelected(ciltBakimiUrunleri);

}
    public WebElement siteControl(){
        return findElement(ciltBakimi);
    }
}
