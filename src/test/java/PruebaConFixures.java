import common.Configuracion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaConFixures {
    WebDriver driver = null;
    @BeforeEach
    void setUp(){
        driver=Configuracion.createChromeWebDriver();

    }
    @Test
    void testTituloPagina(){
        driver.get(Configuracion.ADMIN_URL);
        //Log In ‹ user's Blog! — WordPress
        String expectedTitle = "Log In ‹ user's Blog! — WordPress";
        //String expectedTitle = "Dummy";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);

    }
    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
