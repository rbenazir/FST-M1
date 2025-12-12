package examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity1 {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://training-support.net");
	String title=driver.getTitle();
	System.out.println("Title is "+title);
	driver.findElement(By.xpath("//a[contains(text(),\"About Us\")]")).click();
	System.out.println("New title is "+driver.getTitle());
	driver.quit();
	}
}
