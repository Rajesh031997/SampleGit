package datedrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
WebElement oa = driver.findElement(By.xpath("select[@type='text']"));
		
}
}
