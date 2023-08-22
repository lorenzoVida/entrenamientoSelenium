package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicandoLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        Thread.sleep(4000);
        driver.findElement(By.linkText("Sign Up Here")).click();
       // driver.findElement(By.xpath("//div[@class='register-link m-t-15 text-center']/p/a")).click();
        Select s = new Select(driver.findElement(By.cssSelector("#title")));
        s.selectByVisibleText("Mr.");
        driver.findElement(By.id("firstName")).sendKeys("Lorenzo");
        driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Vidaurre");
        WebElement genderM = driver.findElement(By.cssSelector("input[value='M']"));
        genderM.click();
        driver.findElement(By.id("dob")).sendKeys("29/11/2000");
        driver.findElement(By.id("ssn")).sendKeys("123-45-6789");
        driver.findElement(By.name("emailAddress")).sendKeys("lorenzo.v.more@gmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("PASSCONFIRM");
        driver.findElement(By.id("confirmPassword")).sendKeys("PASSCONFIRM");
        driver.findElement(By.id("confirmPassword")).sendKeys(Keys.ENTER);


    }
}
