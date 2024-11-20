package Ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@role='searchbox' and @class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Jhantipahari");
		//driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]")).click();
	    //driver.findElement(By.cssSelector(".ng-tns-c65-11 > .ui-dropdown-trigger-icon")).click();
		
		List<WebElement> links=driver.findElementsByTagName("a");
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
		
		driver.findElement(By.cssSelector("#journeyClass > div")).click();
		driver.findElement(By.xpath("//span[text()='Anubhuti Class (EA)']")).click();
		
		driver.navigate().to("https://www.booking.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Where are you going?\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Where are you going?\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Where are you going?\"]")).sendKeys(Keys.ENTER);
	}

}
