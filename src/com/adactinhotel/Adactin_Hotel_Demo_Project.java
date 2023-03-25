package com.adactinhotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel_Demo_Project {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Adactin_Hotel\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String title = driver.getTitle();

		System.out.println("Login Page Title: " + title);

		driver.findElement(By.id("username")).sendKeys("ramammu3");

		driver.findElement(By.id("password")).sendKeys("ram@123a");

		driver.findElement(By.id("login")).click();

		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.id("username_show"));

		System.out.println("UserName Reflects: " + userName.getAttribute("value"));

		System.out.println("Current Page URL: " + driver.getCurrentUrl());

		System.out.println("Home Page Title: " + driver.getTitle());

		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);

		s.selectByIndex(3);

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s1 = new Select(hotels);

		s1.selectByIndex(2);

		WebElement roomType = driver.findElement(By.id("room_type"));

		Select s2 = new Select(roomType);

		s2.selectByIndex(1);

		WebElement noOfRooms = driver.findElement(By.id("room_nos"));

		Select s3 = new Select(noOfRooms);

		s3.selectByValue("6");

		WebElement checkInDate = driver.findElement(By.name("datepick_in"));

		checkInDate.clear();

		checkInDate.sendKeys("24/03/2023");

		WebElement checkOutDate = driver.findElement(By.name("datepick_out"));

		checkOutDate.clear();

		checkOutDate.sendKeys("30/03/2023");

		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));

		Select s4 = new Select(adultsPerRoom);

		s4.selectByVisibleText("3 - Three");

		WebElement childRoom = driver.findElement(By.id("child_room"));

		Select s5 = new Select(childRoom);

		s5.selectByIndex(2);
		
		Thread.sleep(5000);

		driver.findElement(By.id("Submit")).click();

		Thread.sleep(5000);
		
		System.out.println("Hotel Page URL: " + driver.getCurrentUrl());

		System.out.println("Hotel Page Title: " + driver.getTitle());

		driver.findElement(By.id("radiobutton_0")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Confirmation Page URL: " + driver.getCurrentUrl());

		System.out.println("Confirmation Page Title: " + driver.getTitle());

		driver.findElement(By.id("first_name")).sendKeys("Will Smith");

		driver.findElement(By.id("last_name")).sendKeys("Chota Bheem");

		driver.findElement(By.id("address")).sendKeys("Number kedaiyathu, Ammadi Appadi theru, Nathamedu Dubai kurukusanthu, Vaniyampadi pakathu vidu, America-110574");

		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

		WebElement creditCardType = driver.findElement(By.id("cc_type"));

		Select s6 = new Select(creditCardType);

		s6.selectByIndex(1);

		WebElement expiryDate = driver.findElement(By.id("cc_exp_month"));

		Select s7 = new Select(expiryDate);

		s7.selectByIndex(3);

		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));

		Select s8 = new Select(expiryYear);

		s8.selectByValue("2022");

		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		driver.findElement(By.id("book_now")).click();

		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement orderId = driver.findElement(By.id("order_no"));

		System.out.println("Order Number: " + orderId.getAttribute("value"));

		driver.findElement(By.id("my_itinerary")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"check_all\"]")).click();

		driver.findElement(By.name("cancelall")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.findElement(By.id("logout")).click();

		Thread.sleep(3000);

		WebElement logOutMessage = driver.findElement(By.xpath("//td[text()='You have successfully logged out. ']"));

		System.out.println("Logged Out Message: " + logOutMessage.getText());

		Thread.sleep(3000);

		driver.quit();

	}

}
