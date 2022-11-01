package com.nttdata.steps;

import com.nttdata.page.LinioPruebaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinioPruebaSteps {

    private WebDriver driver;

    //constructor
    public LinioPruebaSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LinioPruebaPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LinioPruebaPage.loginButton));


    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LinioPruebaPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){

            this.driver.findElement(LinioPruebaPage.loginButton).click();

}
    public void mCalificados(){
    this.driver.findElement(LinioPruebaPage.opcionButton).click();

}
    public void carrito(){
    this.driver.findElement(LinioPruebaPage.carritoButton).click();
}
    public void productoSeleccionado(){
        this.driver.findElement(LinioPruebaPage.productoSeleccionado).click();
    }
}
