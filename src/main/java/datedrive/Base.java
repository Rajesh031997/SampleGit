package datedrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
WebDriver driver;
public void getdriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
public void Loadurl() {
	driver.get("https://www.facebook.com/");
	}
public void Maximize() {
	driver.manage().window().maximize();
	
} 
public void type(WebElement element, String data) {
element.sendKeys(data);

}
public void click(WebElement element) {
	element.click();

}
Public void findElementById() {
	// TODO Auto-generated method stub

}
}
