package com.nttdata.page;

import org.openqa.selenium.By;

public class LinioPruebaPage {

    //Localizadores de elementos
    public static By userInput = By.id("login_form_email");
    public static By passInput = By.id("login_form_password");
    public static By loginButton= By.xpath("/html/body/div[1]/main/div/div/div[2]/div[1]/form/button");
    public static By opcionButton= By.xpath("/html/body/div[4]/main/div[1]/div[1]/div[1]/a[4]");
    public static By carritoButton= By.id("buy-now");
    public static By productoSeleccionado= By.xpath("/html/body/div[4]/main/div/div[8]/div[2]/div/div[1]/a[1]/div[2]/p/span");
}
