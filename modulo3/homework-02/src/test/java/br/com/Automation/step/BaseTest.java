package br.com.Automation.step;

import br.com.Automation.util.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseTest extends Browser {
    @Before
    public void abrirnavegador(){
        BrowserUp("https://practice.automationtesting.in/my-account");
    }

    @After
    public void fecharNavegador(){
        BrowserDown();
    }
}
