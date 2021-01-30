
package pagina;
import common.Configuracion;
import org.openqa.selenium.WebDriver;
import java.lang.module.Configuration;


public class PropiedadesPagina {
    public static void main (String[] args) throws Exception {
        WebDriver driver = Configuracion.createChromeWebDriver();
        driver.get(Configuracion.ADMIN_URL);
        Thread.sleep(3000);
        System.out.println("IRL: "+ driver.getCurrentUrl());
        System.out.println("TITLE "+ driver.getTitle());
        System.out.println("PAGE SOURCE: "+ driver.getPageSource());
        driver.quit();

    }




}
