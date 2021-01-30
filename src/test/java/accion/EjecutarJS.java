package accion;
import common.ClaseBase2;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EjecutarJS extends ClaseBase2 {
    @Test
    void test () {
        JavascriptExecutor jsExec = (JavascriptExecutor) this.getDriver();
        jsExec.executeScript("document.getElementsByClassName('welcome-view-site')[0].click();");
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin")));
        getDriver().navigate().back();


        WebElement viesSiteLink = this.getDriver().findElement(By.className("welcome-view-site"));
        jsExec.executeScript("arguments[0].click()",viesSiteLink);
        getDriver().navigate().back();

        /*
        WebElement siteLink = (WebElement) jsExec.executeScript("return document.getElementsByClassName('welcome-view-site')[0]");
        siteLink.click();
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin"))); */

    }
}
