package br.com.Itera.step;

import br.com.Itera.util.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseTest extends Browser {
    
    @Before
    public void abrirnavegador(){
        BrowserUp("https://itera-qa.azurewebsites.net/");
    }

    @After
    public void fecharNavegador(){
        BrowserDown();
    }
}
