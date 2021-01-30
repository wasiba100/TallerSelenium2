import common.Configuracion;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaBasica {
    @Test
    void testTituloPagina(){
        WebDriver driver = Configuracion.createChromeWebDriver();
        driver.get(Configuracion.ADMIN_URL);
        String expectedTitle = "Dunny";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
        driver.quit();

    }
//Log In ‹ user's Blog! — WordPress
    @Test
    void testTituloPaginaok(){
        WebDriver driver = Configuracion.createChromeWebDriver();
        driver.get(Configuracion.ADMIN_URL);
        String expectedTitle = "Log In ‹ user's Blog! — WordPress";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
        driver.quit();



}
/*
@Test
    void testCompararContenido(){

        WebDriver driver = Configuracion.createChromeWebDriver();
        driver.get(Configuracion.ADMIN_URL);
        String expectedTitle = "Log In ‹ user's Blog! — WordPress";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
        driver.quit();
    }*/

}
