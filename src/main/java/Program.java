import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.quit();


        System.setProperty("webdriver.gecko.driver","drivers/chromedriver.exe");
        ChromeDriver driver2 = new ChromeDriver();
        driver2.quit();


    }






}
