package br.com.Itera;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestAutomation {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Before
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
    @After
    public void fecharNavegador(){
        driver.quit();
    }

    @Test
    public void testValidarTextAreaPratice(){
        Faker faker = new Faker();

        driver.findElement(By.cssSelector("a[href=\"/home/automation\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"name\"]")).sendKeys(faker.name().fullName());
        driver.findElement(By.cssSelector("input[id=\"phone\"]")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys(faker.internet().password());
        driver.findElement(By.cssSelector("textarea[id=\"address\"]")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.cssSelector("button[name=\"submit\"]")).click();
    }

    @Test
    public void testValidaCheckboxRadioButtonPratice(){

        driver.findElement(By.cssSelector("a[href=\"/home/automation\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"female\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"male\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"male\"]")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id=\"other\"]")).isEnabled());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id=\"monday\"]")).isSelected());
        driver.findElement(By.cssSelector("input[id=\"friday\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"friday\"]")).isSelected());

    }
    @Test
    public void testValidaDropDownPratice(){

        driver.findElement(By.cssSelector("a[href=\"/home/automation\"]")).click();
        driver.findElement(By.cssSelector("select[class=\"custom-select\"]")).click();
        driver.findElement(By.cssSelector("select > option:nth-child(3)")).click();
        String value = driver.findElement(By.cssSelector("select[class=\"custom-select\"]")).getAttribute("value");
        Assert.assertEquals(value, "2");
    }

    @Test
    public void testValidaCheckBoxRadioButtonPracticeXpath(){

        driver.findElement(By.cssSelector("a[href=\"/home/automation\"]")).click();
        driver.findElement(By.cssSelector("label[for=\"1year\"]")).click();
        driver.findElement(By.cssSelector("label[for=\"cucumber\"]")).click();
        driver.findElement(By.cssSelector("label[for=\"testng\"]")).click();
        driver.findElement(By.cssSelector("label[for=\"serenity\"]")).click();

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id=\"none\"]")).isEnabled());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"1year\"]")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("label[for=\"2years\"]")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"cucumber\"]")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"testng\"]")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id=\"serenity\"]")).isSelected());

    }
}
