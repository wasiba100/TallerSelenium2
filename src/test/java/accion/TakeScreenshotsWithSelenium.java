package accion;

import common.ClaseBase2;
import common.Configuracion;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class TakeScreenshotsWithSelenium extends ClaseBase2
{
    @Test
    void testTakingScreenshot(){
        TakesScreenshot camera = (TakesScreenshot) this.getDriver();


        File sFile = camera.getScreenshotAs(OutputType.FILE);
        String path = String.format("%s%s-%s.png",Configuracion.SCREENSHOT_DIR,"captura",System.currentTimeMillis());
        sFile.renameTo(new File(path));
    }
}
