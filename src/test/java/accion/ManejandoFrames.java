package accion;
import common.ClaseBase2;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManejandoFrames extends ClaseBase2 {
    @Test
    void testAddPost(){
        this.getDriver().findElement(By.linkText("Posts")).click();
        this.getDriver().findElement(By.linkText("Add New")).click();

        WebElement publish = this.getWait().until(ExpectedConditions.presenceOfElementLocated(By.id("publish")));
        String title = "Titulo de Prueba";

        WebElement titleBox = this.getDriver().findElement(By.id("title"));
        titleBox.sendKeys(title);
        assertEquals(title,titleBox.getAttribute("value"),"Verifico que la casilla de titulo se haya completado");
        this.getDriver().switchTo().frame("content_ifr");
        String text = "Texto de prueba  no hay nada mejor que probar";
        WebElement content =getDriver().findElement(By.id("tinymce"));
        content.sendKeys(text);
        assertEquals(text, content.getText(),"verifico texto del frame");

        this.getDriver().switchTo().defaultContent();
        this.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.className("edit-slug")));
        publish.click();
    }
}
