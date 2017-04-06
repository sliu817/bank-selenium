import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by fograinwind on 4/5/17.
 */
public class TestScript2 {
    static WebDriver driver;
    private static String baseUrl;

    //this method setup will read initialization parameters from the class Util.java and launch firefox
    public static void setUp() throws Exception {
        System.setProperty("webdriver.firefox.marionette",Util.FIREFOX_PATH);
        driver = new FirefoxDriver();

        baseUrl = Util.BASE_URL;
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);

        driver.get(baseUrl + "/V4/");
    }

    /*
    * THis method will perfome following Test Steps:
    * 1) Go to www.
    * 2) Enter valid UserId
    * 3) Enter valid password
    * 4) Click login
    * 5) Verify the Page title after login
    * */

    public static void main(String[] args) throws Exception {
        String username, password;
        String actualTitle;
        String actualBoxtitile;

        setUp();

        driver.findElement(By.name("uid")).clear();;  //Good practice to clear a field before use
        driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);

        driver.findElement(By.name("password")).clear();;  //Good practice to clear a field before use
        driver.findElement(By.name("password")).sendKeys(Util.PASSWD);

        driver.findElement(By.name("btnLogin")).click();

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(Util.EXPECTED_TITLE)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }

    }
}
