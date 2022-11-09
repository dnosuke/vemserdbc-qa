package br.com.Automation.util;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void BrowserUp(String url){
        // Informando a automação qual app vai utilizar
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);

        // Abrir navegador = .get
        driver.get(url);
        // Maximizar
        driver.manage().window().maximize();
        // Delay
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    }
    @After
    public void BrowserDown(){
        driver.quit();
    }
}
