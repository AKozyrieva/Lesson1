package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CVBankTest1 {

    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://cv-app-test.herokuapp.com/");
        Thread.sleep(3000);
    }

    @Test
    public void CreateTest1() throws InterruptedException {
        driver.findElement(By.cssSelector("button.btn-lg")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[2]/h3[1]/i[1]")).click();
        Thread.sleep(1000);

        WebElement cvTitle = driver.findElement(By.cssSelector("input[name='title']"));
        cvTitle.click();
        cvTitle.sendKeys("CV");
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.click();
        firstName.sendKeys("fedorov");
        Thread.sleep(3000);

        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.click();
        lastName.sendKeys("fedya");
        Thread.sleep(3000);

        WebElement summaryField = driver.findElement(By.cssSelector("#summary"));
        summaryField.click();
        summaryField.sendKeys("summary");
        Thread.sleep(3000);

        WebElement about = driver.findElement(By.cssSelector("#about"));
        about.click();
        about.sendKeys("about");
        Thread.sleep(3000);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

