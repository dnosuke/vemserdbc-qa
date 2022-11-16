package br.com.Itera.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends Browser{
    public static WebElement element(By element){
        return driver.findElement(element);
    }

    public static void waitElement(By element){
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
