package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class IdentificacionBasica extends ClaseBase1 { // el extend ereda los atributos de clase base uno el inicio y el fin @
    @Test
    void testByName(){
        WebElement usernameTextField = driver.findElement(By.name("pwd"));
        SeleniumUtils.printElementInfo("Casilla de texto",usernameTextField);
        System.out.println(usernameTextField);
    }

    @Test
    void testById() {
        WebElement usernameTextField =
                driver.findElement(By.id("user_login"));
        SeleniumUtils.printElementInfo("Casilla de texto",
                usernameTextField);
    }
    @Test
    void testLabelById() {
        // Si hay mas de un tag Label, solo encuentra el primero
        WebElement usernameTextField =
                driver.findElement(By.tagName("label"));
        SeleniumUtils.printElementInfo("Etiqueta",
                usernameTextField);
    }

}
