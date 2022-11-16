package br.com.Itera.steps;

import br.com.Itera.util.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseSteps extends Browser {

    @Before
    public void abrirNavegador() {
        BrowserUp("https://itera-qa.azurewebsites.net/login");
    }

    @After
    public void fecharNavegador() {
        BrowserDown();
    }

}