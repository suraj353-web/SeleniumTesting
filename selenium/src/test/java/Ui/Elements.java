package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("suraaaaaj");
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		
		String A=driver.findElement(By.xpath("//input[@name=\"user-name\"]")).getAttribute("class");
		System.out.println(A);
		
		Dimension D=driver.findElement(By.xpath("//input[@name=\"user-name\"]")).getSize();
		System.out.println(D);

	}

}
