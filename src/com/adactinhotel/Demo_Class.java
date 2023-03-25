package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_Class {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.quit();

	}

}
