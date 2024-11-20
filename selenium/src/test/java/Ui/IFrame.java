package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
	    //Thread.sleep(10000);
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("/html/body/button")).click();
		String A=driver.switchTo().alert().getText();
		System.out.println(A);
		driver.switchTo().alert().accept();
		

	}

}
