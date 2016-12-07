import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Al Savani-HP on 13/11/2016.
 */
public class NopCommerceAutomation {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.nopcommerce.com");

        driver.findElement(By.className("ico-register")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.id("FirstName")).sendKeys("Alpesh");
        driver.findElement(By.id("LastName")).sendKeys("Savani");
        driver.findElement(By.id("Email")).sendKeys("alpesh89@yahoo.com");
        driver.findElement(By.id("Company")).sendKeys("Alpesh Pvt Ltd");
        driver.findElement(By.className("Password")).sendKeys("alpesh89@yahoo.com");
        driver.findElement(By.className("ConfirmPassword")).sendKeys("Alpesh89");
        driver.findElement(By.id("register-button")).click();


        String actual = driver.getTitle();
        String expected = "nopCommerce demo store";

        if (expected.equals(actual))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        System.out.println(actual);
        System.out.println(driver.getCurrentUrl());


driver.quit();
    }
}
