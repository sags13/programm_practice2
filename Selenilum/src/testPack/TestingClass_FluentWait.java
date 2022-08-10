package testPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingClass_FluentWait {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Software testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/downloads/");
		//Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com");
		//Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.navigate().forward();
		
		//Thread.sleep(5000);
		//driver.navigate().wait();
		//driver.navigate().refresh();
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  //Implicit wait== act on full browser, i.e. below all web element we can create

		
		//WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		//email.sendKeys("sngharate@gmail.com");
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);		//  Explicit wait-500milisec wait for frequently search
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));     // until xpath element is not visible condition waits
		//or for above line // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]"))).sendKeys("sngharate@gmail.com");
		//WebElement eml1 = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		//eml1.sendKeys("sngharate@gmail.com");
		
		
		//Fluent wait== apply only on one web element
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))  // Max waiting
				.pollingEvery(Duration.ofSeconds(20))  // polling frequency
				.ignoring(NoSuchElementException.class);  //  condition			// above 4 line is only for creating object
		
		WebElement ele12 = wait2.until(new Function<WebDriver, WebElement>()
				{
						public WebElement apply(WebDriver driver)
						{
							return driver.findElement(By.xpath("//input[@id='email']"));
							
						}
				}
				
				
				
				)
				
				
				
				
				
	}

}
