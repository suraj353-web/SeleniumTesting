package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement d= driver.findElement(By.name("SiteMap"));
		Select s= new Select(d);
		
		s.selectByValue("ghi");
		Thread.sleep(2000);
		
		s.selectByIndex(4);
		Thread.sleep(2000);
		
		s.selectByVisibleText("doc 3");
		
		driver.navigate().to("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		
		
		//driver.close();

	}

}
