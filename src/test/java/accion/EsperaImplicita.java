package accion;
import common.Configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EsperaImplicita {
    @Test
    void test() throws Exception {
        // crear el driver
        WebDriver driver = Configuracion.createChromeWebDriver();
        // espera hasta 5 segundos  de espera implicita
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get(Configuracion.ADMIN_URL);

        WebElement usrname = driver.findElement(By.name("log"));
        usrname.sendKeys(Configuracion.USER);
        WebElement password = driver.findElement(By.name("pwd"));
        password.sendKeys(Configuracion.PASS);
        password.submit();
        boolean cargaDashboard = driver.findElement(By.id("wpadminbar")).isDisplayed();
        assertTrue(cargaDashboard,"Verifico carga de dashboard");
        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
        driver.get(logOut.getAttribute("href"));

        WebElement logOutMsg = driver.findElement(By.xpath("//p[contains(text(),'logged out.')]" ));
        assertTrue(logOutMsg.isDisplayed(),"Verifico visibilidad del mensaje logout");
        driver.quit();
    }
}
