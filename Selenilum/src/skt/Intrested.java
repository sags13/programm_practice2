package skt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intrested {
	
	public static void main(String args[]) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skout.com/");
		
		Thread.sleep(6000);
		
		WebElement login = driver.findElement(By.xpath("//input[@ng-model='user.username']"));
		login.sendKeys("vicky356@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@ng-model='user.password']"));
		pwd.sendKeys("sagar22vicky");
		
		WebElement login_btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		login_btn.click();
		
	}

}
