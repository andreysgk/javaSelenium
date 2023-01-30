package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingMetanit extends Base {
    public SettingMetanit(WebDriver driver) {
        super(driver);
    }
    private final By firstSetting = By.id("--main-font-size");
    private final By secondSetting = By.id("--main-font-family");

    public String fontSetting() {
        return driver.findElement(firstSetting).getAttribute("value");
    }
    public String secondSetting(){
        return driver.findElement(secondSetting).getAttribute("value");
    }




}