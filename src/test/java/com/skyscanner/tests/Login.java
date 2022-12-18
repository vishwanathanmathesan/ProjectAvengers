package com.skyscanner.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.netty.util.Timeout;

public class Login {

	static WebDriver driver;

	public static void launchApplicationURLInChromeBrowser() {

		try {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://parabank.parasoft.com/");

		} catch (Exception exception) {
			exception.printStackTrace();

		}
	}

	public static void loginAndValidateWelcomePage(String xpath, WebDriver driver) {

	}

	public static void endTest() {

		driver.quit();
		System.out.println("Test completed...");
	}

	public static void main(String[] args) {

		launchApplicationURLInChromeBrowser();
//		loginAndValidateWelcomePage();
		endTest();

	}

}
