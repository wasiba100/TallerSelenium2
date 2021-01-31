package accion;
import common.ClaseBase2;
import common.SeleniumUtils;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InteraccionConTeclado extends ClaseBase2 {
    @Test
    void test1(){
        String titulo = "Ejemplo";
        WebElement postTitle =
                getDriver().findElement(By.name("post_title"));
        postTitle.sendKeys(Keys.chord(Keys.SHIFT, titulo));
        assertEquals(titulo.toUpperCase(),
        postTitle.getAttribute("value"),"verifico texto mayuscula");

    }

    @Test
    void test1b(){
        String titulo = "Ejemplo";
        WebElement postTitle =
                getDriver().findElement(By.name("post_title"));
        postTitle.sendKeys(Keys.chord(Keys.SHIFT, titulo));
        SeleniumUtils.printElementInfo("Antes",postTitle);
        //comparamos  el resultado tipo minusculas y resultado payuscula  para  comparar el error
        postTitle.clear();
        postTitle.sendKeys(titulo);
        SeleniumUtils.printElementInfo("Despues",postTitle);

        assertEquals(titulo.toUpperCase(),
                postTitle.getAttribute("value"),"verifico texto mayuscula");

    }
    @Test
    void  test2(){
        String titulo ="Ejemplo";
        WebElement postTitle = getDriver().findElement(By.name("post_title"));
        Actions actions = new Actions(this.getDriver());
        actions.keyDown(Keys.SHIFT).sendKeys(postTitle,titulo).keyUp(Keys.SHIFT).build().perform();
        assertEquals(titulo.toUpperCase(),
                postTitle.getAttribute("value"),"verifico texto mayuscula");
    }
}
