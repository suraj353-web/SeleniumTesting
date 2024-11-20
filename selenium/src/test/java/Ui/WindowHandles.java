package Ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("suraj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[4]/div[2]/ul/li[1]/a")).click();
		
		Set<String> W= driver.getWindowHandles();
		System.out.println(W);
		
		Iterator<String> I= W.iterator();
		String P=I.next();
		String C= I.next();
		
		driver.switchTo().window(C);
		
		driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).sendKeys("Help");
		driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).sendKeys(Keys.ENTER);
	}

}
