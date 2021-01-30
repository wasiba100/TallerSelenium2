package pagina;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.ClaseBase1;

public class EstrategiasIdentificacion extends ClaseBase1 {
    @Test
    void testById(){
        WebElement element = driver.findElement(By.id("user_pass"));
        SeleniumUtils.printElementInfo("Casilla de Password",element);
    }
    @Test
    void testByClassName1(){
        WebElement element = driver.findElement(By.className("input"));
        SeleniumUtils.printElementInfo("casilla de texto ",element);

    }
    @Test
    void testByClassName2(){
        WebElement element = driver.findElement(By.className("button-large"));
        SeleniumUtils.printElementInfo("boton de login", element);

    }
    @Test
    void tesBytagName(){
        WebElement element = driver.findElement(By.tagName("input"));
        SeleniumUtils.printElementInfo("Casilla de texto",element);

    }
}
