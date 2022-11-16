package br.com.Itera.steps;

import br.com.Itera.pages.DashboardPage;
import br.com.Itera.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginSteps extends BaseSteps {

    // Instanciar
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void validarLoginComUsernameESenhaValidos() {
        loginPage.escreverNoCampoLogin();
        loginPage.escreverNoCampoSenha();
        loginPage.clicarNoBotaoLogin();

        Assert.assertEquals("Welcome teste123", dashboardPage.validarTextLogadoNaTela());
    }

}
