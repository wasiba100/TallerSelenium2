package accion;

import common.ClaseBase2;
import common.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultipleMatch extends ClaseBase2{
    @Test
    void test(){
        this.getDriver().findElement(By.linkText("Posts")).click();
        this.getDriver().findElement(By.linkText("Categories")).click();
        List<WebElement>checkboxes = this.getDriver().findElements(By.name("delete_tags[]"));
        System.out.println("Cantidad de Checkbox es: "+checkboxes.size());
        for(WebElement element: checkboxes){
            SeleniumUtils.printElementInfo("category", element);
            element.click();
            assertTrue(element.isSelected(),"verifico hacr cilc checkbox");
        }


       /* for(int i=0; i <checkboxes.size();i++){
            SeleniumUtils.printElementInfo("category",checkboxes.get(i));
            checkboxes.get(i).click();
            assertTrue(checkboxes.get(i).isSelected(),"Verifico Clik en la Check");
        }*/
    }
}
