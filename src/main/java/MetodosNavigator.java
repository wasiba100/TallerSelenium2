import common.Configuracion;
import org.openqa.selenium.WebDriver;
public class MetodosNavigator {
    public static void main (String[] args) throws Exception {
        WebDriver driver = Configuracion.createChromeWebDriver();
        driver.manage().window().maximize();
        driver.get(Configuracion.ADMIN_URL);

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Windows handle"+driver.getWindowHandle());
        for (String win: driver.getWindowHandles()){
            System.out.println("H: "+ win);
        };
        driver.quit();

    }
}
