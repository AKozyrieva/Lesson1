package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CVBankTests {

    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://cv-app-test.herokuapp.com/");
        Thread.sleep(3000);
}
@Test
public void pressRegistrationButton() throws InterruptedException {
    System.out.println("by className 'btn btn-danger' element quantity:" + driver
            .findElements(By.className("btn btn-danger")).size());
    driver.findElements(By.className("btn-danger")).get(1).click();
    Thread.sleep(3000);

    WebElement firstName = driver.findElement(By.id("firstName"));
    firstName.click();
    firstName.sendKeys("first name");
    Thread.sleep(3000);

    WebElement lastName = driver.findElement(By.id("lastName"));
    lastName.click();
    lastName.sendKeys("lastName");
    Thread.sleep(3000);

    WebElement emailField = driver.findElement(By.id("email"));
    emailField.click();
    emailField.sendKeys("Email");
    Thread.sleep(3000);

    WebElement phoneField = driver.findElement(By.id("phone"));
    phoneField.click();
    phoneField.sendKeys("Phone");
    Thread.sleep(3000);

    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.click();
    passwordField.sendKeys("Password");
    Thread.sleep(3000);


    WebElement passwordConfirm = driver.findElement(By.id("password-confirm"));
    passwordConfirm.click();
    passwordConfirm.sendKeys("Password confirm");
    Thread.sleep(3000);









}
   @AfterMethod
public void tearDown(){
    driver.quit();
    }
}
