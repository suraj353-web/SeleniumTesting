package Ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> R=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println(R.size());
		
		List<WebElement> C=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		System.out.println(C.size());
		
		for(int i=1;i<=R.size();i++) {
			for(int j=1;j<=C.size();j++) {
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()+ " ");
			}
			System.out.println();
		}
		
		driver.close();	
		
		
		

	}

}
