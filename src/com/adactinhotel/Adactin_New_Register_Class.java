package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_New_Register_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	
		System.out.println("Current WebApplication Title: " + driver.getTitle());
			
		System.out.println("Current WebApplication URL: " + driver.getCurrentUrl());
		
		driver.findElement(By.id("username")).sendKeys("vinoth197654");
		
		driver.findElement(By.id("password")).sendKeys("Vinoth@123a");
		
		driver.findElement(By.id("re_password")).sendKeys("Vinoth@123a");
		
		driver.findElement(By.id("full_name")).sendKeys("Vinoth Kumar");
		
		driver.findElement(By.id("email_add")).sendKeys("VinothKumar1976@gmail.com");
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("tnc_box")).click();
		
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(15000);
		
		WebElement emailVerificationMessage = driver.findElement(By.xpath("//td[@class='reg_success']"));
		
		String text = emailVerificationMessage.getText();
		
		System.out.println("Email Verification Message: " + text);
		
		driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}	

}
