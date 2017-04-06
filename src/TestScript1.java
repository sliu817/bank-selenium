/**
 * Created by fograinwind on 4/3/17.
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class TestScript1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette","geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://demo.guru99.com/v4/";

        driver.get(baseUrl);
        WebElement element = driver.findElement(By.name("uid"));
        element.sendKeys("mngr73124");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("adArUmY");

        driver.findElement(By.name("btnLogin")).click();


       // driver.close();
        //System.exit(0);

        String exptectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(exptectedTitle)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
