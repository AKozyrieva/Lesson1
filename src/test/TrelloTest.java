package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrelloTest {

    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://trello.com/");
        Thread.sleep(1000);
    }

    @Test
    public void LogInTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Войти')]")).click();
        Thread.sleep(1000);

        WebElement userField = driver.findElement(By.cssSelector("#user"));
        userField.click();
        userField.sendKeys("A.Kurkova59@icloud.com");
        Thread.sleep(1000);

        WebElement loginField = driver.findElement(By.cssSelector("#login"));
        loginField.click();
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.click();
        password.sendKeys("naskacrazy1993");
        Thread.sleep(3000);

        WebElement loginInField = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/form[1]/div[3]/button[1]/span[1]/span[1]"));
        loginInField.click();
        Thread.sleep(15000);
        System.out.println("Button name is: " + driver.
                        findElement(By.xpath("(//button[@data-test-id='header-boards-menu-button']/span)[2]")).getText());




    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}



