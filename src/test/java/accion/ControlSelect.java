package accion;
import common.ClaseBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControlSelect extends ClaseBase2 {

    @Test
    void test01() {



        this.getDriver().findElement(By.linkText("Setting")).click();
        this.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));
        WebElement dropDown = this.getDriver().findElement(By.id("start_of_week"));
        dropDown.click();

        String diaEsperado = "Monday";
        String xfinder = "//option[text()='"+ diaEsperado+"']";

        WebElement option = this.getDriver().findElement(By.xpath(xfinder));
        option.click();
        assertTrue(option.isSelected(),
                "Verifico que el elemento esta seleccionado" );

    }
    @Test
    void test02(){
        //driver.manage().window().fullscreen();

        this.getDriver().findElement(By.linkText("Settings")).click();
        this.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

                WebElement dropDown = this.getDriver().findElement(By.id("start_of_week"));

        String diaEsperado = "Monday";
        dropDown.sendKeys(diaEsperado);
        String xfinder = "//option[text()='"+ diaEsperado+"']";
        WebElement option = getDriver().findElement(By.xpath(xfinder));
        assertTrue(option.isSelected(),"Verifico que el elemento esta seleccionado" );
    }

    @Test
    void test03(){
        this.getDriver().findElement(By.linkText("Settings")).click();
        this.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));



        String diaEsperado = "Monday";
        Select weekStart = new Select(this.getDriver().findElement(By.id("start_of_week")));
        weekStart.selectByVisibleText(diaEsperado);

        String diaseleccionado = weekStart.getFirstSelectedOption().getText();
        assertEquals(diaEsperado, diaseleccionado,"verifico dia seleccionado");
    }


}
