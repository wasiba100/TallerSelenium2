package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorCSS extends ClaseBase1{
    @Test
    void testUsingInput(){
        WebElement element = driver.findElement(By.cssSelector("input"));
        SeleniumUtils.printElementInfo("casilla de texto",element);
    }
    @Test
    void testUsingInputType(){
        WebElement element = driver.findElement(By.cssSelector("input[type]"));
        SeleniumUtils.printElementInfo("Tipo de Casilla de texto",element);
    }
    @Test
    void testUsingTypePassword(){
        WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
        SeleniumUtils.printElementInfo("Casilla de texto password",element);
    }
    @Test
    void testUsingClassName(){
        WebElement element = driver.findElement(By.cssSelector("input[class='input']"));
        SeleniumUtils.printElementInfo("Clases nombre",element);
    }
    @Test
    void testUsingid(){
        WebElement element = driver.findElement(By.cssSelector("#user_login"));
        SeleniumUtils.printElementInfo("Casilla usa id",element);
    }
    @Test
    void testUsingAnyTag(){
        WebElement element = driver.findElement(By.cssSelector("*[name='log']"));
        SeleniumUtils.printElementInfo("Cualquier tag",element);
    }
    @Test
    void testUsingClass(){
        WebElement element = driver.findElement(By.cssSelector(".input"));
        SeleniumUtils.printElementInfo("Usa tag input",element);
    }
    @Test
    void testUsingParentChild(){
        WebElement element = driver.findElement(By.cssSelector("form > p > label"));
        SeleniumUtils.printElementInfo("labeld",element);
    }


}
