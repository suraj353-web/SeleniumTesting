package Ui;

import java.util.Set;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(1);
		
		Set<org.openqa.selenium.Cookie> C= driver.manage().getCookies();
		System.out.println(C.size());
		
		for(org.openqa.selenium.Cookie c:C) {
			System.out.println(c.getName() + "  :  " + c.getValue() );	
		}
		
		//Cookie c= new Cookie();
		//driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		//driver.findElement(By.xpath("S&P ASX200 top 5")).click();

	}

}
