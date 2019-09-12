package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExecutableClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\eclipse-workspace\\SeleniumActionClass\\driv\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		WebElement e=d.findElement(By.name("q"));
		Actions a=new Actions(d);
		a.moveToElement(e).perform();
		e.click();
		System.out.println("tamilan");
		System.out.println("BiGIl");
	}
}


