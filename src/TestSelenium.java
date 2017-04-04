/**
 * Created by fograinwind on 4/3/17.
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class TestSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette","geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("liusha2046@gmail.com");
        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

       // driver.close();
        //System.exit(0);
    }
}
