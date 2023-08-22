package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/-/es/");
        Actions mouseOver = new Actions(driver);
        mouseOver.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Cuenta y Listas']"))).build().perform();
    }
}
