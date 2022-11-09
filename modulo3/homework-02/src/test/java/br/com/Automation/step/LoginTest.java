package br.com.Automation.step;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {
    @Test
    public void testValidarFazerLoginComSucesso(){
        driver.findElement(By.id("username")).sendKeys("batman5555@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Fla1234!@");
        driver.findElement(By.cssSelector("input[name=\"login\"]")).click();

        String user = driver.findElement(By.cssSelector("#page-36 > div > div.woocommerce > div > p:nth-child(1) > strong")).getText();

        Assert.assertEquals("batman5555", user);
    }

    @Test
    public void testFazerLoginComEmailNaoCadastradoRetornaMensagemErro(){
        driver.findElement(By.id("username")).sendKeys("batman5555888888@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Fla1234!@");
        driver.findElement(By.cssSelector("input[name=\"login\"]")).click();

        String user = driver.findElement(By.cssSelector("#page-36 > div > div.woocommerce > ul > li")).getText();

        Assert.assertEquals("Error: A user could not be found with this email address.", user);
    }



    @Test
    public void testValidarCriarUserComSucesso(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        driver.findElement(By.cssSelector("#menu-item-50 > a")).click();
        driver.findElement(By.cssSelector("#reg_email")).sendKeys(email);
        driver.findElement(By.cssSelector("#reg_password")).sendKeys("Fla1234!@");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"woocommerce-password-strength good\"]")));
        driver.findElement(By.cssSelector("input[name=\"register\"]")).click();

       String user = driver.findElement(By.cssSelector("#page-36 > div > div.woocommerce > div > p:nth-child(1) > strong")).getText();
        String[] b = email.split("@", 2);
       Assert.assertEquals(b[0], user);
    }

    @Test
    public void testRegisterUserPassandoSenhaFracaDeixaBotaoRegisterDisabled(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        driver.findElement(By.cssSelector("#reg_email")).sendKeys(email);
        driver.findElement(By.cssSelector("#reg_password")).sendKeys("Fla");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"woocommerce-password-strength short\"]")));
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name=\"register\"]")).isEnabled());
    }

    @Test
    public void testPassarInvalidoEmSubscribeRetornaMensagemErro(){

        driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[1]/input")).sendKeys("delon@a");
        driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[2]/div/p")).getText();

        Assert.assertEquals("Please provide a valid email address.", text);
    }

    @Test
    public void testValidarCadastroSubscribeComSucesso(){
        Faker faker = new Faker();
        driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[1]/input")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[2]/div/p")).getText();

        Assert.assertEquals("Thank you, your sign-up request was successful! Please check your email inbox to confirm.", text);
    }
}
