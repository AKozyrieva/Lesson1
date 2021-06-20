package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class OscarShopTest {
    @Test
    public void registrationTest() throws InterruptedException {
        String email = "qwe123124@gmail.com";
        String password = "Qwe123123";

        WebDriver driver = new ChromeDriver();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");

        Thread.sleep(5000);
        WebElement loginLink = driver.findElement(By.id("login_link"));
        loginLink.click();
        Thread.sleep(5000);
        WebElement emailField = driver.findElement(By.id("id_registration-email"));
        emailField.clear();
        emailField.sendKeys(email);
        Thread.sleep(5000);
        WebElement passwordField = driver.findElement(By.id("id_registration-password1"));
        passwordField.sendKeys(password);
        Thread.sleep(5000);
        WebElement confirmPasswordField = driver.findElement(By.id("id_registration-password2"));
        confirmPasswordField.sendKeys(password);
        Thread.sleep(5000);
        WebElement registerButton = driver.findElement(By.name("registration_submit"));
        registerButton.click();
        Thread.sleep(5000);

        driver.quit();
    }
}