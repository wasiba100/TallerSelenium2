import org.openqa.selenium.WebDriver;
public class UsandoConfiguracion {
    public static void main(String[] arg) throws Exception{
        WebDriver driver = common.Configuracion.createChromeWebDriver();
        //driver.manage().window().fullscreen();

        Thread.sleep(5000);

        driver.quit();
    }
}
