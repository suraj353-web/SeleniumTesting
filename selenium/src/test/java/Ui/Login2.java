package Ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("suraaaaaj");
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String t= driver.getTitle();
		System.out.println(t);
		
		String page= driver.getPageSource();
		System.out.println(page);
		
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@id,'login-button')]")).click();
		
		List<WebElement> web= driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(web);
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String window= driver.getWindowHandle();
		System.out.println(window);
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> Windowhandles= driver.getWindowHandles();
		System.out.println(Windowhandles);
		
		
		
		driver.close();
		

	}

}
