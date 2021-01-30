package accion;

import common.ClaseBase1;
import common.Configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.module.Configuration;

public class LoginLogout extends ClaseBase1{
    @Test
    void test()throws Exception{
        driver.get(Configuracion.ADMIN_URL);
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("log"));
        username.sendKeys(Configuracion.USER);
        WebElement password = driver.findElement(By.name("pwd"));
        password.sendKeys(Configuracion.PASS);
        password.submit();
        Thread.sleep(2000);
        boolean cargaDashboard = driver.findElement(By.id("wpadminbar")).isDisplayed();
        assertTrue(cargaDashboard,"verifico carga de dashboard");

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
        driver.get(logOut.getAttribute("href"));
        Thread.sleep(5000);
        WebElement logOutMsg = driver.findElement(By.xpath("//p[contains(text(),'logged out.')]"));
        assertTrue(logOutMsg.isDisplayed(),"verifico visivilidad del mensaje logout");



    }

}
