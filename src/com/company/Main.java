package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//----driver initialization-----
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//----delay
		Thread.sleep(3000);
		System.out.println("Title: " + driver.getTitle());

		//----go by url link
		driver.get("https://www.souvenir.co.il/");
		Thread.sleep(3000);
		System.out.println("Title: " + driver.getTitle());

		//-----change window size--
		Dimension targetSize = new Dimension(400,600);
		driver.manage().window().setSize(targetSize);

		driver.get("https://www.isradon.com");
		Thread.sleep(3000);
		System.out.println("Title: " + driver.getTitle());

		//---setmaximum window size--
		driver.manage().window().fullscreen();

		//----return to the previous page in the history
		driver.navigate().back();
		Thread.sleep(3000);// waiting time
		System.out.println("Title: " + driver.getTitle());

		//---button forward in the browser
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Title: " + driver.getTitle());

		driver.navigate().back();
		Thread.sleep(3000);// waiting time
		System.out.println("Title: " + driver.getTitle());

// drive.close(); закрытие текущего окна, но не всех процессов

		driver.findElement(By.id("link_customer_signup"));
		Thread.sleep(3000);


		// define and initialize nameField elements
		WebElement nameField =  driver.findElement(By.id("customer_full_name"));
		nameField.click();
		nameField.sendKeys("Name");
		Thread.sleep(3000);

		driver.quit(); //закрытие всех процессов в драйвере. это обязательно

	}
}
