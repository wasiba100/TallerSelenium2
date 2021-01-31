package accion;
import common.Configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class NavegacionSinEncabezado {
@Test
    void testHtmlUnitdriver() {
    WebDriver driver = new HtmlUnitDriver(true);
    driver.get(Configuracion.ADMIN_URL);
    System.out.println(driver.getPageSource());
    WebElement element = driver.findElement(By.name("log"));
    element.sendKeys(Configuracion.USER);
    assertEquals(Configuracion.USER, element.getAttribute("value"));
}

/*@Test
    void testChromeHeadless() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get(Configuration.ADMIN_URL);
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.name("log"));
        element.sendKeys(Configuration.USER);
        TakesScreenshot camera = (TakesScreenshot) driver;

        File sFile = camera.getScreenshotAs(OutputType.FILE);
        String path = String.format("%s%s-%s.png",
                Configuration.SCREENSHOT_DIR,
                "captura", System.currentTimeMillis());
        sFile.renameTo(new File(path));
        assertEquals(Configuration.USER, element.getAttribute("value"));
    }
*/
}
