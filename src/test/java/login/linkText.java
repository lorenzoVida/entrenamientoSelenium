package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class linkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationtesting.co.uk/loader.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("loaderBtn")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.linkText("Log in instead!")).click();
        //driver.findElement(By.name("email")).sendKeys("PorName");
        //Thread.sleep(4000);
        WebDriverWait wait1 = new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#")));
    }
}
