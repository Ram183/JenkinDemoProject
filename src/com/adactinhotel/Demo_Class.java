package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Class {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\msedgedriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://www.asos.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

	}

}
