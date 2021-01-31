
package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.Locale;

public class Configuracion {
    public static String USER = "user";
    public static String PASS= "Password123";
    public static String IP = "http://52.188.170.0/";
    public static String ADMIN_URL = IP + "/wp-admin";
    public static String BLOG_URL = IP+"/wordpress";
    public static String DRIVER_DIR = System.getProperty("user.dir")+ File.separator+"drivers"+File.separator;

    public static String SCREENSHOT_DIR = System.getProperty("user.dir")+File.separator+"screenshots"+File.separator;

    public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
    public static String GECKO_DRIVER_PATH = DRIVER_DIR+"geckodriver";
/*
user
Password123
*/
    public static String modifyWindows(String inPath) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return inPath+".exe";
        }else{
            return inPath;
        }
    }

    public static  WebDriver createChromeWebDriver(){
        System.setProperty("webdirver.chrome.driver", modifyWindows(CHROME_DRIVER_PATH));
        return new ChromeDriver();
    }

    public static  WebDriver createGeckoDriver(){
        System.setProperty("webdirver.gecko.driver", modifyWindows(GECKO_DRIVER_PATH));
        return new FirefoxDriver();
    }
}
