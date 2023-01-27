package Pages;

import org.openqa.selenium.WebDriver;

public class Base {
    protected WebDriver driver;
    public Base(WebDriver driver){
        this.driver=driver;
    }

    public Base urlMain(){
        driver.get("https://metanit.com/");
        return this;
    }

    public Base urlSetting(){
        driver.get("https://metanit.com/settings.php");
        return this;
    }

}
