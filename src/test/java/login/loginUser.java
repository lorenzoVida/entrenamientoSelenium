package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginUser {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
       //  WebDriverManager.firefoxdriver().setup();
      //  WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.className("form-check-input")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("log-in")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("log-in")).click();
        driver.navigate().forward();
    }
}
