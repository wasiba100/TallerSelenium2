package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumUtils {
    public static void printElementInfo(String name, WebElement element){
        String separador = "------------------------------";

        System.out.println(separador);
        System.out.println("Informacion del elemento ->"+name);
        System.out.println(separador);
        System.out.println("Objeto WebElement: ->"+ element);
        System.out.println("Html Externo ->"+ element.getAttribute("outerHTML"));
        System.out.println("Html Interno ->"+ element.getAttribute("innerHTML"));
        System.out.println("Texto ->"+element.getText());
        System.out.println("Value ->"+element.getAttribute("value"));
        System.out.println("Tag ->"+element.getTagName());
        System.out.println("Displayed? ->"+element.isDisplayed());
        System.out.println("Selected? ->"+element.isSelected());
        System.out.println("Enabled ->"+element.isEnabled());
    }
}
