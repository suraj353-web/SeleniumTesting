package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		
		//driver.findElement(By.className("form_input")).sendKeys("performance_glitch_user"); //here class name is duplicate
		//WebElement p= driver.findElement(By.id("password "));.
		//WebElement u= driver.findElement(By.tagName("input").above(p));
		
		

	}

}
