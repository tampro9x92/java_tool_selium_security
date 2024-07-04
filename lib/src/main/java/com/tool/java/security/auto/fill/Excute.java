package com.tool.java.security.auto.fill;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String title = driver.getTitle();
		System.out.println(title);
		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));

		textBox.sendKeys("Seldenium");
		submitButton.click();

		WebElement message = driver.findElement(By.id("message"));
		System.out.println(message.getText());
		String value = message.getText();
		System.out.println(value);
		driver.quit();
	}


}
