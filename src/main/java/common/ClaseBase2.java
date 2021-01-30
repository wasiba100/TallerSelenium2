package common;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



public class ClaseBase2 {
    private WebDriver driver = null;
    private WebDriverWait wait = null;


    @BeforeEach
    public void login() throws Exception{
        driver = Configuracion.createChromeWebDriver();
        wait = new WebDriverWait(driver, 60);


        driver.get(Configuracion.ADMIN_URL);
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("log")));
        username.sendKeys(Configuracion.USER);
        assertEquals(Configuracion.USER,username.getAttribute("value"),"verifico usuario");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pwd")));
        password.sendKeys(Configuracion.PASS);
        assertEquals(Configuracion.PASS,password.getAttribute("value"),"verifico pasword");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("wp-submit")));
        submitButton.click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Log Out']")));


    }
    @AfterEach
    public void logout() throws Exception{

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
        driver.get(logOut.getAttribute("href"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'logged out.')]")));
        driver.quit();
    }
    protected WebDriver getDriver() {return this.driver;}
    protected WebDriverWait getWait() {return this.wait;}

}
