package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class locator2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
      //  options.setBrowserVersion("114.0");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(4000);
        System.out.println("llegamos,,,,,,,");
        driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]")).click();
        // driver.findElement(By.xpath("//div[@class='register-link m-t-15 text-center']/p/a")).click();
    }
}
