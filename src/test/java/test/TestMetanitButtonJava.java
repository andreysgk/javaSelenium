package test;

import org.junit.jupiter.api.*;

public class TestMetanitButtonJava extends BaseKlone {
    @BeforeEach
    public void urlMain(){
        driver.get("https://metanit.com/");
    }


    @Test
    public void PressJavaButton(){
        MetanitMain.clickButtonJava();
    }
    @Test
    @DisplayName("Сравнивает актуальное количество тем с ожидаемым")
    public void ListSize(){
        MetanitMain.clickButtonJava()
                .clickButtonJavaSE();
        Assertions.assertEquals(12,MetanitMain.sizeListSections());
    }

    @Test
    public void OpenSections(){
        MetanitMain.clickButtonJava()
                .clickButtonJavaSE()
                .openSection(0)
                .openSection(3)
                .openSection(6);
    }
    @Test
    @DisplayName("Проверяет название первой темы JavaSE")
    public void CheckNameFirstSection(){
        MetanitMain.clickButtonJava()
                .clickButtonJavaSE();
        Assertions.assertEquals("Глава 1. Введение в Java", MetanitMain.getNameFirstSection());
    }

    @Test
    @DisplayName("Проверка титула")
    public void test5(){
        Assertions.assertNotEquals("METANIT.COM", MetanitMain.getTitle());
    }
}
