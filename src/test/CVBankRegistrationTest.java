package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CVBankRegistrationTest {

    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://cv-app-test.herokuapp.com/");
        Thread.sleep(3000);
    }

    @Test
    public void RegistrationTest1() throws InterruptedException {
        System.out.println("by className 'btn btn-danger' element quantity:" + driver
                .findElements(By.className("btn btn-danger")).size());
        driver.findElements(By.className("btn-danger")).get(1).click();
        Thread.sleep(3000);


        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        firstName.click();
        firstName.sendKeys("Fedya");
        Thread.sleep(3000);

        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.click();
        lastName.sendKeys("Fedya");
        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.click();
        emailField.sendKeys("A@test");
        Thread.sleep(3000);

        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
        phoneField.click();
        phoneField.sendKeys("345");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("123");
        Thread.sleep(3000);

        WebElement confirmPassword = driver.findElement(By.cssSelector("#password-confirm"));
        confirmPassword.click();
        confirmPassword.sendKeys("123");
        Thread.sleep(3000);




    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
