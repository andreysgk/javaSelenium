package test;

import Pages.SettingMetanit;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.*;

public class TestMainMetanitButtonJava extends KlonBase{


    @Test
    @DisplayName("Кнопка Jaca SE")
    public void test1(){
        MetanitMain.ProverkaJavaSE();

    }
    @Test
    @DisplayName("Клик по темам JavaSE 1,2,3")
    public void test2(){
        MetanitMain.clickTemy(0);
        MetanitMain.clickTemy(1);
        MetanitMain.clickTemy(2);
    }
    @Test
    @DisplayName("Сравнивает актуальное количество тем с ожидаемым")
    public void test3(){
        Assertions.assertEquals(12,MetanitMain.SchetTem());
    }

    @Test
    @DisplayName("Проверяет название первое темы JavaSE")
    public void test4(){
        Assertions.assertEquals("Глава 1. Введение в Java", MetanitMain.SerchNameButton1());
    }

    @Test
    @DisplayName("Проверка титула")
    public void test5(){
        Assertions.assertNotEquals("METANIT.COM", MetanitMain.Title());
    }

}
