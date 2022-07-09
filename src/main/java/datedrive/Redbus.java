package datedrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("Chennai");
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("salem");
}
}
