package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MetanitButtonJava extends Base {

    public MetanitButtonJava(WebDriver driver) {
        super(driver);
    }


    private final By ButtonJava = By.xpath("//ul[@class='mainmenu']//a[text()='Java']");
    private final By ButtonJavaSE = By.xpath("//div[@class='navmenu']//a[text()='Java SE']");
    private final By NameTema1 = By.xpath("//span[text()='Глава 1. Введение в Java']");
    private final By ListTem = By.xpath("//span[@class='folder']");


    public MetanitButtonJava ProverkaJavaSE(){
        urlMain();
        driver.findElement(ButtonJava).click();
        driver.findElement(ButtonJavaSE).click();
        return this;
    }

    public MetanitButtonJava clickTemy(int a){
        urlMain();
        driver.findElement(ButtonJava).click();
        driver.findElement(ButtonJavaSE).click();
        List<WebElement> list =driver.findElements(ListTem);
        list.get(a).click();
        return this;
    }
    public int SchetTem(){
        urlMain();
        driver.findElement(ButtonJava).click();
        driver.findElement(ButtonJavaSE).click();
        List<WebElement> list =driver.findElements(ListTem);
        return list.size();
    }

    public String SerchNameButton1(){
        urlMain();
        driver.findElement(ButtonJava).click();
        driver.findElement(ButtonJavaSE).click();
        return driver.findElement(NameTema1).getText();
    }

    public String Title(){
        urlMain();
        return driver.getTitle();
    }

}
