package br.com.Itera.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {
    private static final By textValidateUser =
            By.cssSelector("body > div > div > h3");

    public String validarTextLogadoNaTela(){
        return getText(textValidateUser);
    }
}
