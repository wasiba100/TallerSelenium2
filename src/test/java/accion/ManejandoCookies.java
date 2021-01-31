package accion;
import common.ClaseBase2;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManejandoCookies extends ClaseBase2{
    @Test
    void test(){
        for (Cookie cookie : this.getDriver().manage().getCookies()){
            System.out.println("informacion de coookies: ");
            System.out.println("Nombre: "+cookie.getName());
            System.out.println("Valor: "+cookie.getValue());
            System.out.println("Dominio: "+cookie.getDomain());
            System.out.println("Ruta (Path): "+cookie.getPath());
            System.out.println("Segura"+cookie.isSecure());
            System.out.println("HttpOnly?: "+cookie.isHttpOnly());
        }
        //Borrar las  Cookies
        //this.getDriver().manage().deleteAllCookies();
        //refrescar
        getDriver().navigate().refresh();
    }
}
