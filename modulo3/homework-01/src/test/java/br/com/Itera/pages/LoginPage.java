package br.com.Itera.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By campoUsername =
            By.cssSelector("[id=\"Username\"]");
    private static final By campoSenha =
            By.cssSelector("[id=\"Password\"]");
    private static final By btnLogin =
            By.cssSelector("input[name=\"login\"]");
    public void escreverNoCampoLogin(){
        sendKeys(campoUsername, "teste123");
    }
    public void escreverNoCampoSenha(){
        sendKeys(campoSenha, "12345");
    }
    public void clicarNoBotaoLogin(){
        click(btnLogin);
    }
}
