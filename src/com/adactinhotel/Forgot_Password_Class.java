package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Forgot_Password_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		driver.findElement(By.id("emailadd_recovery")).sendKeys("Vinoth@gmail.com");
		
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(5000);
		
		WebElement emailConfirmationMsg = driver.findElement(By.className("reg_success"));
		
		driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
		
		driver.quit();
		
	}

}
