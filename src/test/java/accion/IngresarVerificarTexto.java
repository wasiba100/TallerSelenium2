package accion;
import common.ClaseBase1;
import org.junit.jupiter.api.Test;
import common.Configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.module.Configuration;

public class IngresarVerificarTexto extends ClaseBase1 {
    @Test
    void testIngresarUserName(){
        String usuarioEsperado = Configuracion.USER;
        WebElement element = driver.findElement(By.id("user_login"));
        assertTrue(element.isEnabled(),"verificar que el username esta habilitado");
        element.sendKeys(usuarioEsperado);
        String usuarioActual=element.getAttribute("value");
        assertEquals(usuarioEsperado,usuarioActual,"Verfico que el ususario es igual al actual");
    }



}
