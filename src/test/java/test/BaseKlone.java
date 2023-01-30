package test;

import Pages.Base;
import Pages.MetanitButtonJava;
import Pages.SettingMetanit;
import common.BazovieNastroiki;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseKlone {
    protected WebDriver driver = BazovieNastroiki.createDriver();
    protected Base baseT = new Base(driver);
    protected MetanitButtonJava MetanitMain = new MetanitButtonJava(driver);
    protected SettingMetanit SettingMetanitKlone = new SettingMetanit(driver);
    @AfterEach
    public void closePage(){
        close();
    }
    @BeforeAll
    public static void startTests(){
        System.out.println("Start of testsing");
    }
    @AfterAll
    public static void finishTests(){
        System.out.println("Finish of tetsting");
    }
    public void close(){
        driver.quit();
    }

}
