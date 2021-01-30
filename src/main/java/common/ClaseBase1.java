
package common;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class ClaseBase1 {
    protected static WebDriver driver = null;

    @BeforeAll
    protected static void launchBrowser() throws Exception{
        driver = Configuracion.createChromeWebDriver();
        driver.get(Configuracion.ADMIN_URL);

        Thread.sleep(2000);
    }
    @AfterAll
    public static void closeBrowser() {
        driver.quit();
    }
}
