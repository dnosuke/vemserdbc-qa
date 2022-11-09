package br.com.Itera.step;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static br.com.Itera.util.Util.*;

public class CrudTest extends BaseTest {
    @Test
    public void testValidarFazerLoginComSucesso(){
        logar();
        String text = driver.findElement(By.cssSelector("body > div > div > h3")).getText();
        Assert.assertEquals("Welcome mordekaiser", text);
    }

    @Test
    public void testFazerLoginComUserNaoCadastradoRetornaMensagemErro(){
        driver.findElement(By.cssSelector("a[href=\"/Login\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"Username\"]")).sendKeys("mordek");
        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
        String text = driver.findElement(By.cssSelector("body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(5) > td > label")).getText();
        Assert.assertEquals("Wrong username or password", text);
    }

    @Test
    public void testValidarCriarComSucesso(){
        logar();
        criarUser();
        String text = driver.findElement(By.cssSelector("body > div > div > h3")).getText();
        Assert.assertEquals("Welcome mordekaiser", text);
        buscarUser();
        deleteUser();
    }

    @Test
    public void testValidarBuscarUserComSucesso(){
        logar();
        criarUser();
        buscarUser();
        String user = driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1)")).getText();

        Assert.assertEquals("mordekaiser junior", user);
        deleteUser();
    }
    @Test
    public void testBuscarUserInexistenteRetornaMensagemErro(){
        logar();
        driver.findElement(By.cssSelector("#searching")).sendKeys("mordek123123141255");
        driver.findElement(By.cssSelector("body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0")).click();
        String user = driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td")).getText();

        Assert.assertEquals("No Match", user);
    }

    @Test
    public void testBuscarDetalhesUserComSucesso(){
        logar();
        criarUser();
        buscarUser();
        lerUser();
        String user = driver.findElement(By.cssSelector("body > div > div > dl > dd:nth-child(2)")).getText();
        Assert.assertEquals("mordekaiser junior", user);
        driver.findElement(By.cssSelector("body > div > p > a.btn.btn-link")).click();
        buscarUser();
        deleteUser();
    }

    @Test
    public void testValidarDeletarUserComSucesso(){
        logar();
        criarUser();
        buscarUser();
        deleteUser();

        buscarUser();
        String user = driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td")).getText();

        Assert.assertEquals("No Match", user);
    }

    @Test
    public void testValidarEditarUserComSucesso(){
        logar();
        criarUser();
        buscarUser();
        editarUser();
        buscarUser();
        String user = driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td")).getText();

        Assert.assertEquals("mordekaiser senior", user);
        deleteUser();
    }

    @Test
    public void testValidaLogoutComSucesso(){
        logar();
        logout();
       Assert.assertTrue(driver.getCurrentUrl().equals("https://itera-qa.azurewebsites.net/Login"));
    }
}
