package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Adactin_Class1 {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String webPageUrl = driver.getCurrentUrl();

		System.out.println("Current Webpage URL: " + webPageUrl);

		String title = driver.getTitle();

		System.out.println("WebPage Title: " + title);

		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();

		driver.findElement(By.id("username")).sendKeys("ArunSuk730");

		driver.findElement(By.id("password")).sendKeys("Arunkumar$123");

		driver.findElement(By.id("re_password")).sendKeys("Arunkumar$123");

		driver.findElement(By.id("full_name")).sendKeys("Arunkumar s");

		driver.findElement(By.id("email_add")).sendKeys("arunkumarsuk195@gmail.com");

		Thread.sleep(15000);

		driver.findElement(By.id("tnc_box")).click();

		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(5000);
		
		WebElement emailNotification = driver.findElement(By.xpath("//td[contains(text(),'An email verification code has been sent to your email address')]"));

		String a = "An email verification code has been sent to your email address";
		
		Thread.sleep(5000);
		
		if (a.equals(emailNotification)) {
			
			System.out.println("Email Notification has been send to the Register Email Address. Kindly Please Check"); 
			
		}else {
			System.out.println("Email Address is wrong so its not sending to the user");
		}
		
		driver.quit();
		
	}

}
