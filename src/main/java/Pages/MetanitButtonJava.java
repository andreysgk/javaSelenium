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
    private final By NameFirstSection = By.xpath("//span[text()='Глава 1. Введение в Java']");
    private final By ListTem = By.xpath("//li[@class='closed']");

    public MetanitButtonJava clickButtonJava(){
        driver.findElement(ButtonJava).click();
        return this;
    }

    public MetanitButtonJava clickButtonJavaSE(){
        driver.findElement(ButtonJavaSE).click();
        return this;
    }
    public MetanitButtonJava clickButtonFirstSection(){
        driver.findElement(NameFirstSection).click();
        return this;
    }

    public String getNameFirstSection(){
        return driver.findElement(NameFirstSection).getText();
    }
    public MetanitButtonJava listSections(){
        driver.findElement(ListTem);
        return this;
    }

    public int sizeListSections(){
        List<WebElement> list =driver.findElements(ListTem);
        return list.size();
    }

    public MetanitButtonJava checkJavaSE(){
        driver.findElement(ButtonJava).click();
        driver.findElement(ButtonJavaSE).click();
        return this;
    }

    public MetanitButtonJava openSection(int numberSections){
        List<WebElement> list =driver.findElements(ListTem);
        list.get(numberSections).click();
        return this;
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
