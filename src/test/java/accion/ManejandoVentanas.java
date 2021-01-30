package accion;
import common.ClaseBase2;
import common.Configuracion;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManejandoVentanas  extends ClaseBase2 {
    @Test
    void test() {
        System.out.println(this.getDriver().getTitle());
        String mainWin = this.getDriver().getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) this.getDriver();
        js.executeScript("window.open(arguments[0]);",Configuracion.BLOG_URL);

        for(String handle: this.getDriver().getWindowHandles()){
            if (!handle.equals(mainWin)){
                this.getDriver().switchTo().window(handle);
                System.out.println(this.getDriver().getTitle());
                this.getDriver().close();
            }
        }
        this.getDriver().switchTo().window(mainWin);
        System.out.println(this.getDriver().getTitle());

              assertEquals(this.getDriver().getWindowHandles().size(),1,"verifico solo queda una ventana activa");
    }

}
