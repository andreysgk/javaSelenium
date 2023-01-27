package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SettingMetanit extends Base {
    public SettingMetanit(WebDriver driver) {
        super(driver);
    }
    private final By firstPole = By.id("--main-font-size");

    public void Pole() {
        urlSetting();
        driver.findElement(firstPole).clear();
        driver.findElement(firstPole).sendKeys("HelloGay");
    }



}