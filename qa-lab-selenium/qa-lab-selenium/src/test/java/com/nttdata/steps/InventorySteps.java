package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }
    public String getMensaje(){
        return this.driver.findElement(InventoryPage.mensaje).getText();
    }
    public String getTitulo(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    public String getnombreCuenta(){
        return this.driver.findElement(InventoryPage.cuenta).getText();
    }

}
