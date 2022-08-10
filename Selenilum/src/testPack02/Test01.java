package testPack02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println("Im starting selenium!");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");		//01
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/");			//02
		Thread.sleep(3000);
		System.out.println("Current URL"+driver.getCurrentUrl());
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		System.out.println(" "+driver.navigate().toString());    ///?
//		
//		driver.manage().window().fullscreen();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		System.out.println("  "+driver.manage().window().getSize());
//		driver.manage().window().getPosition();
//		
//		System.out.println("driver.getTitle()"+driver.getTitle());
		
		WebElement user = driver.findElement(By.xpath("//input[@name ='username']"));
		user.clear();
		user.sendKeys("sagar");
		System.out.println("user.getTagName = "+user.getTagName());
		
		WebElement login = driver.findElement(By.xpath("//button[@class = 'sqdOP  L3NKy   y3zKF     ']"));
		
		WebElement pwd =driver.findElement(By.xpath("//input[@aria-label = 'Password']"));
		WebElement pwd_text = driver.findElement(By.xpath("//span[text() = 'Password']"));
		System.out.println("  "+pwd_text);
		
		pwd.sendKeys("asdfghjkl");
		login.click();

		WebElement signup   = driver.findElement(By.xpath("//a[@data-testid = 'sign-up-link']"));   //alternate xpath for finding same WebElement
		//WebElement signup01 = driver.findElement(By.xpath("//a[contains(@data-testid, 'sign-up-link')]"));
		signup.click();
		
		WebElement logi2=driver.fidElement(By.xpath(null));
		login2.click();
		WebElement email=driver.findElement(By.xpath(null))
		email.sendKeys(argd);;
		WebElement pwd=driver.findElement(By.xpath(null));
		pwd.clear();
		pwd.sendKeys();
		pwd.isDisplayed();
		pwd.isEnabled();
		pwd.isSelected();
		pwd.click();
		pwd.equals(pwd);	//:boolean-Object
		pwd.getAttribute(String:name);	//:String-WebElement
		pwd.getText();
		pwd.submit();
		pwd.toString();		//:String-Object
		
		 
		
		
		
		
	}

}
