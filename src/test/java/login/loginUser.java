package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginUser {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
       //  WebDriverManager.firefoxdriver().setup();
      //
        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
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
       // driver.findElement(By.cssSelector("#username")).sendKeys("sad@fas.com");
//        driver.findElement(By.cssSelector(".ab-coupon-incentive--branch_false.btn-text")).click();

        //driver.findElement(By.xpath("//input[@placeholder='Ingresa desde dónde viajas']")).click();
 //       driver.findElement(By.xpath("//input[@placeholder='Ingresa desde dónde viajas']")).clear();
  //      driver.findElement(By.xpath("//input[@placeholder='Ingresa desde dónde viajas']")).sendKeys("Cusco");
   //     Thread.sleep(4000);
   //     driver.findElement(By.xpath("//input[@placeholder='Ingresa desde dónde viajas']")).sendKeys(Keys.ENTER);
   //     driver.findElement(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']")).click();
   //     driver.findElement(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']")).clear();
   //     driver.findElement(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']")).sendKeys("Lima");
    }
}
