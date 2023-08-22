package suitesDePruebas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class suitePruebas {
    WebDriver driver;

    @BeforeSuite
    public void BeforeSuit() {
        System.out.println("@Before Suite: Setup and start webdriver ");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("@BeforeTest: Cargar Data de Prueba");
//		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
//		btnLogin.click();
//		Highlighter.highlightElement(driver, btnLogin);
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("@Before Class: Antes de la clase SuitePruebas");
    }

    @BeforeMethod
    public void BeforMethod() {
        System.out.println("@Before Method : Antes de cadaTest");
    }






    @AfterSuite
    public void AfterSuit() {
        System.out.println("@After Suite: Eliminar Cambios de data, rollback!, stop webdriver");
        //driver.manage().deleteAllCookies();
    }



    @AfterTest
    public void AfterTest() {
        System.out.println("@AfterTest: Correr otros Test dependientes");
    }
    @Test
    public void Test2() {
        System.out.println("Test2-demo");
        //	driver.findElement(By.xpath("//font[contains(text(),'Administración')]")).click();
    }

    @Test
    public void test3() {
        System.out.println("test 3 comprarProducto");
    }


    @Test
    public void Test4() {
        System.out.println("Test4");
    }



}
