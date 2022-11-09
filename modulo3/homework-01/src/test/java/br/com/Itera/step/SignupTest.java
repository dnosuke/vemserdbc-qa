package br.com.Itera.step;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
public class SignupTest extends BaseTest {

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
