package br.com.Itera.util;

import br.com.Itera.step.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

public class Util extends BaseTest {
    public static void logar(){
        driver.findElement(By.cssSelector("a[href=\"/Login\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"Username\"]")).sendKeys("mordekaiser");
        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
    }

    public static void criarUser(){
        Faker faker = new Faker();
        driver.findElement(By.cssSelector("a[href=\"/Customer/Create\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"Name\"]")).sendKeys("mordekaiser junior");
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(faker.company().name());
        driver.findElement(By.cssSelector("input[id=\"Address\"]")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.cssSelector("input[id=\"Phone\"]")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"City\"]")).sendKeys(faker.address().cityName());
        driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div > input")).click();
    }

    public static void buscarUser(){
        driver.findElement(By.cssSelector("#searching")).sendKeys("mordekaiser");
        driver.findElement(By.cssSelector("body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0")).click();
    }

    public static void editarUser(){
        Faker faker = new Faker();
        driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-primary")).click();
        driver.findElement(By.cssSelector("input[id=\"Name\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"Name\"]")).sendKeys("mordekaiser senior");
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(faker.company().name());
        driver.findElement(By.cssSelector("input[id=\"Address\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"Address\"]")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.cssSelector("input[id=\"Phone\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"Phone\"]")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("input[id=\"City\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"City\"]")).sendKeys(faker.address().cityName());
        driver.findElement(By.cssSelector("input[id=\"Email\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(10) > div > input")).click();
    }

    public static void deleteUser(){
        driver.findElement(By.cssSelector("a[class=\"btn btn-outline-danger\"]")).click();
        driver.findElement(By.cssSelector("body > div > div > form > div > input")).click();
    }

    public static void lerUser(){
        driver.findElement(By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-info")).click();
    }

    public static void logout(){
        driver.findElement(By.cssSelector("a[href=\"/Login/LogOut\"]")).click();
    }
}
