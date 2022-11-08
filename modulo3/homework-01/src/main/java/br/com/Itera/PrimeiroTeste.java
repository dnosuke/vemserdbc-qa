package br.com.Itera;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PrimeiroTeste {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void abrirNavegador(){
        // Informando a automação qual app vai utilizar
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);

        // Abrir navegador = .get
        driver.get("https://itera-qa.azurewebsites.net/");
        // Maximizar
        driver.manage().window().maximize();
        // Delay
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    }

    public void fecharNavegador(){
        driver.quit();
    }

    @Test
    public void validarSignupComDadosValidos(){
        Faker faker = new Faker();
        abrirNavegador();

        // Mapeamento
        driver.findElement(By.cssSelector("a[class=\"nav-link\"][href=\"/UserRegister/NewUser\"]")).click();

        driver.findElement(By.cssSelector("input[type=\"text\"][name=\"FirstName\"]")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("#Surname")).sendKeys(faker.name().lastName());
        driver.findElement(By.cssSelector("input[id=\"E_post\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("#Mobile")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"Username\"]")).sendKeys(faker.name().username());
        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys(faker.internet().password());
        driver.findElement(By.cssSelector("#submit")).click();

        fecharNavegador();
    }

    @Test
    public void testSignupComCampoNameVazioRetornaMensagemErro(){
        Faker faker = new Faker();
        abrirNavegador();

        // Mapeamento
        driver.findElement(By.cssSelector("a[class=\"nav-link\"][href=\"/UserRegister/NewUser\"]")).click();

        driver.findElement(By.cssSelector("input[type=\"text\"][name=\"FirstName\"]")).sendKeys("");
        driver.findElement(By.cssSelector("#Surname")).sendKeys(faker.name().lastName());
        driver.findElement(By.cssSelector("input[id=\"E_post\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("#Mobile")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"Username\"]")).sendKeys(faker.name().username());
        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys(faker.internet().password());
        driver.findElement(By.cssSelector("#submit")).click();

        String text = driver.findElement(By.cssSelector("span[id=\"FirstName-error\"]")).getText();
        Assert.assertEquals(text, "Please enter first name");

        fecharNavegador();
    }
    @Test
    public void testSignupComCampoPasswordVazioRetornaMensagemErro(){
        Faker faker = new Faker();
        abrirNavegador();

        // Mapeamento
        driver.findElement(By.cssSelector("a[class=\"nav-link\"][href=\"/UserRegister/NewUser\"]")).click();

        driver.findElement(By.cssSelector("input[type=\"text\"][name=\"FirstName\"]")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("#Surname")).sendKeys(faker.name().lastName());
        driver.findElement(By.cssSelector("input[id=\"E_post\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("#Mobile")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"Username\"]")).sendKeys(faker.name().username());
        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("");
        driver.findElement(By.cssSelector("#submit")).click();

        String text = driver.findElement(By.cssSelector("span[id=\"Password-error\"]")).getText();
        Assert.assertEquals(text, "Please enter password");

        fecharNavegador();
    }

    @Test
    public void testLoginComUsernameSenhaInvalidosRetornaMensagemDeErro(){
        abrirNavegador();

        driver.findElement(By.cssSelector("a[class=\"nav-link\"][href=\"/Login\"]")).click();
        driver.findElement(By.cssSelector("[id=\"Username\"]")).sendKeys("");
        driver.findElement(By.cssSelector("[id=\"Password\"]")).sendKeys("");
        driver.findElement(By.cssSelector("[name=\"login\"]")).click();

        String text = driver.findElement(By.cssSelector("body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(5) > td > label")).getText();

        Assert.assertEquals(text, "Wrong username or password");

        fecharNavegador();
    }


}
