package Ui;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor je= (JavascriptExecutor) driver;
		
		String script= "return document.title;";
		String t= (String) je.executeScript(script);
		System.out.println(t);
		
		driver.switchTo().frame(1);
		je.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement b= driver.findElement(By.xpath("/html/body/button"));
		je.executeScript("arguments[0].style.border='3px solid red'", b);
		
		driver.navigate().to("https://www.w3schools.com/");
		WebElement l= driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
		je.executeScript("arguments[0].scrollIntoView(true);", l);
		

	}

}
