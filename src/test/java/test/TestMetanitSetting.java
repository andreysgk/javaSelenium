package test;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMetanitSetting extends BaseKlone {
    @BeforeEach
    public void urlSetting(){
        driver.get("https://metanit.com/settings.php");
    }
    @Test
    public void checkFontHeight(){
        Assert.isTrue(SettingMetanitKlone.fontSetting().contains("16px"),"Font height not 16px");
    }

    @Test
    public void checkSecondSetting(){
        Assertions.assertEquals("-apple-system, \"system-ui\", Helvetica, Arial, sans-serif",SettingMetanitKlone.secondSetting());
    }



}
