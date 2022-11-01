package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LinioPruebaSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinioPruebasSD {
    private WebDriver driver;
    private Scenario scenario;

    private InventorySteps inventorySteps(WebDriver driver){return new InventorySteps(driver);}
    private LinioPruebaSteps linioPruebaSteps;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
    @Given("usuario se encuentra en la página {string}")
    public void usuarioSeEncuentraEnLaPágina(String arg0) {
    linioPruebaSteps= new LinioPruebaSteps(driver);
    driver.get("https://www.linio.com.pe/account/login");
    screenShot();
    }

    @When("ingresa email correcto {string}")
    public void ingresaEmailCorrecto(String email) {
    linioPruebaSteps.typeUser(email);
    screenShot();
    }

    @And("ingresa contraseña correcta {string}")
    public void ingresaContraseñaCorrecta(String contraseña) {
    linioPruebaSteps.typePassword(contraseña);
    screenShot();
    }

    @And("se hace click en el boton Iniciar sesion segura")
    public void seHaceClickEnElBotonIniciarSesionSegura() {
    linioPruebaSteps.login();
    screenShot();
    }


    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


    @And("se selecciona la opcion Mejores calificados")
    public void seSeleccionaLaOpcionMejoresCalificados() {
        //linioPruebaSteps.mCalificados();
       // screenShot();
    }

    @And("se selecciona el producto {string}")
    public void seSeleccionaElProducto(String arg0) {
        //linioPruebaSteps.productoSeleccionado();
        //screenShot();
    }

    @And("se da click en el boton Añadir al carrito")
    public void seDaClickEnElBotonAñadirAlCarrito() {
        //  linioPruebaSteps.carrito();
        // screenShot();
    }


    @And("se valida que debe aparecer el titulo {string}")
    public void seValidaQueDebeAparecerElTitulo(String mCalificado) {
        //String title =  inventorySteps(driver).getTitulo();
        //Assertions.assertEquals(mCalificado, title);
    }


    @And("se valida el mensaje {string}")
    public void seValidaElMensaje(String msj) {
        // String mensaje =  inventorySteps(driver).getMensaje();
        // Assertions.assertEquals(msj, mensaje);
    }

    @Then("se valida que el nombre de cuenta sea {string}")
    public void seValidaQueElNombreDeCuentaSea(String esperado) {
        //String cuenta =  inventorySteps(driver).getnombreCuenta();
        //Assertions.assertEquals(esperado, cuenta);
    }
}
