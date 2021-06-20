package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SouvenirTests {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.souvenir.co.il/");
        Thread.sleep(3000);

    }

    @Test
    public void souvenirApplOpeningTest() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Test
    public void registrationTest() throws InterruptedException {
        // ----- find element by id -------
        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(3000);

        // ------ define and initialize nameField element and fill in it----
        WebElement nameField = driver.findElement(By.id("customer_full_name"));

        nameField.click();
        nameField.sendKeys("Name");


    }

    @Test
    public void registrationTest1() throws InterruptedException {

        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.id("customer_email"));
        emailField.click();
        emailField.sendKeys("Email");


    }

    @Test
    public void registrationTest2() throws InterruptedException {

        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(3000);

        WebElement telephoneField = driver.findElement(By.id("customer_mobile_phone"));
        telephoneField.click();
        telephoneField.sendKeys("Telephone");


    }

    @Test
    public void locatorsTest() throws InterruptedException {
        //press on "Registration" button
        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(3000);

        //--get elements list by tagName 'input'
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));

        //--write quantity of elements by tagName 'input'
        System.out.println("Quantity of elements with tag 'input': " + inputElements.size());

        //--write aria-label attribute value for the first element with tagName 'input'
        System.out.println("First element with tag 'input': " + driver
                .findElement(By.tagName("input")).getAttribute("aria-label"));

        //--list aria-label attribute values for all elements with tagName 'input'
        for (WebElement element : inputElements) {
            System.out.println("aria-label value " + element.getAttribute(("aria-label")));

        }


        }

        @Test
        public void locatorClassNameTest(){
        //receive list of elements with className "parent category title"
            List<WebElement>parentTitleList = driver.findElements(By.className("parent_category_title"));
            for(WebElement element: parentTitleList){
                System.out.println("Text of element: " + element.getText());
            }

        }

    @Test
    public void locatorLinkedTextTest(){
        System.out.println("Registration link text:" + driver
                .findElement(By.linkText("הרשמה")).getAttribute("href"));
        System.out.println("Gift Card element:" + driver
                .findElement(By.linkText("Gift Card")).getAttribute("href"));
    }
    @Test
    public void longInTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='last'][contains(text(),'התחברות/')]")).click();
        Thread.sleep(5000);
    }

    @Test
    public void logInTest() throws InterruptedException {
//        driver.findElement(By.xpath("//a[@class='last'][contains(text(),'התחברות/')]")).click();
//        driver.findElement(By.xpath("//*[@id = 'header_login_signup']//a[@class='last']")).click();

        driver.findElement(By.cssSelector("div[id = 'header_login_signup'] a[class='last']")).click();
        Thread.sleep(5000);

        WebElement mailField = driver.findElement(By.cssSelector("input[aria-label='מייל']"));
        mailField.click();
        mailField.sendKeys("test@test.com");
        Thread.sleep(3000);
    }




        @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}