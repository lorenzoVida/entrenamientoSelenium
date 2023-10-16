package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[placeholder='Username']")
    WebElement txtUsuario;
    //WebElement user = driver.findElement(By.cssSelector("input[placeholder='Username']"));

    @FindBy(css = "input[placeholder='Password']")
    WebElement txtPassword;

    @FindBy(css = "button[type='submit']")
    WebElement btnIngresar;
    public void ingresarUsuarioYPassword(){
        txtUsuario.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnIngresar.click();
    }

}
