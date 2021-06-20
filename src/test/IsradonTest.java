package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class IsradonTest {
    WebDriver driver;


    @BeforeMethod
    public void initTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.isradon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void openIsradonApplTest() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    public void locatorsTest() throws InterruptedException {
        driver.findElement(By.className("col1")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.className("withsubs")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Детский мир")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("CARMANI")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Досуг")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Канцтовары")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Универмаг \"Исрадон\"")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}