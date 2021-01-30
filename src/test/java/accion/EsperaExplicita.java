package accion;
import common.Configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EsperaExplicita {
    @Test
    void testEsperaExplicta() throws Exception{
        WebDriver driver = Configuracion.createChromeWebDriver();
        WebDriverWait wait = new WebDriverWait(driver,60);

        driver.get(Configuracion.ADMIN_URL);

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("log")));
        username.sendKeys(Configuracion.USER);
        assertEquals(Configuracion.USER,username.getAttribute("value"),"verifico usuario");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pwd")));
        password.sendKeys(Configuracion.PASS);
        assertEquals(Configuracion.PASS,password.getAttribute("value"),"verifico usuario");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("wp-submit")));
        submitButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Log Out']")));
        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
        System.out.println(logOut.getAttribute("href"));
        driver.get(logOut.getAttribute("href"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'logged out.')]")));
        driver.quit();



    }
}
