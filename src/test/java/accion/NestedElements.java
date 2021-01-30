package accion;
import  common.SeleniumUtils;
import common.ClaseBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedElements extends ClaseBase2 {
    @Test
    void testClickFirstChekBox (){
        this.getDriver().findElement(By.linkText("Posts")).click();
        this.getDriver().findElement(By.linkText("Categories")).click();

        WebElement table = this.getDriver().findElement(By.className("wp-list-table"));

        WebElement firstCheckBox = table.findElement(By.name("delete_tags[]"));
        SeleniumUtils.printElementInfo("Primer casilla de verificacion",firstCheckBox);
        firstCheckBox.click();
        assertTrue(firstCheckBox.isSelected(),"verifico checklist seleccionada");


        ///////////////////////////
       /* List<WebElement>checboxes = table.findElements(By.name("delete_tags"));
        WebElement firstcehecboxes = checboxes.get(0);
        SeleniumUtils.printElementInfo("Primera casilla de verificacion",firstcehecboxes);
        firstcehecboxes.click();
        assertTrue(firstcehecboxes.isSelected(), "verifico cheklist seleccionada" ); */


    }

}
