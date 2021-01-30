package accion;
import common.ClaseBase2;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
public class ManejandoAlertas extends ClaseBase2{
    @Test
    void testBorrarImagen(){
        this.getDriver().findElement(By.cssSelector("#menu-media > a > div.wp-menu-name")).click();
        this.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("posts-filter")));

        List<WebElement> checkBoxes = this.getDriver().findElements(By.name("media[]"));

        checkBoxes.get(0).click();

        this.getDriver().findElement(By.name("action")).click();
        this.getDriver().findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]/option[2]")).click();
        this.getDriver().findElement(By.id("doaction")).click();
        System.out.println(this.getDriver().switchTo().alert().getText());
        this.getDriver().switchTo().alert().accept();
    }

}
