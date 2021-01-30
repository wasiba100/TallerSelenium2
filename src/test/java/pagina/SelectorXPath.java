package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class SelectorXPath extends ClaseBase1 {
    @Test
    void test01() {
        WebElement element = driver.findElement(By.xpath("/html/body/div/form/input"));
        SeleniumUtils.printElementInfo("Ruta absoluta",element);
    }
    @Test
    void test02() {
        WebElement element = driver.findElement(By.xpath("//input"));
        SeleniumUtils.printElementInfo("Ruta relativa",element);
    }
    @Test
    void test03() {
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        SeleniumUtils.printElementInfo("Ruta valor atributo",element);
    }
    @Test
    void test04() {
        WebElement element = driver.findElement(By.xpath("//*[@type='text']"));
        SeleniumUtils.printElementInfo("Casilla de texto",element);
    }
    @Test
    void test05() {
        WebElement element = driver.findElement(By.xpath("//*[text()='lost your password?']"));
        SeleniumUtils.printElementInfo("Casilla de  texto",element);
    }
    @Test
    void test06() {
        WebElement element = driver.findElement(By.xpath("//div/input"));
        SeleniumUtils.printElementInfo("Casilla de texto",element);
    }
    @Test
    void test07() {
        WebElement element = driver.findElement(By.xpath("//from/p/following-sibling::p"));
        SeleniumUtils.printElementInfo("Ruta de texto",element);
    }
}
