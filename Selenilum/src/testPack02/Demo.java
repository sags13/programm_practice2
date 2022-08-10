package testPack02;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Demo {
	public static void main (String argd[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='btn51Btn btn51RipplePrimary btn51Primary']"));
		login.click();
		WebElement email = driver.findElement(By.xpath("//input[@id ='login_email1']"));
		email.sendKeys("snkg13@gmail.com");
		WebElement continue_btn = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
		continue_btn.click();
		
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='login_password1']"));
		pwd.sendKeys("Zhakshim@13");
		
		WebElement submit = driver.findElement(By.xpath("//div[contains(@class,'absolute-center btn51ParentDimension')]"));

		submit.click();
//		System.out.println("  "+submit.getText());
		
		Thread.sleep(3000);
		WebElement pin = driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[1]/input"));
		Thread.sleep(3000);
		pin.sendKeys("2");

/*		Most commo webelement action performed!!
 
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
		
*/		
/*		different types for visibilityOf methode for wait.until(ExpectedConditions.visibilityOf());

		wait.until(ExpectedConditions.visibilityOfAllElements(ListOfWebElement));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("ListOfWebElementXpath")));
*/		
		                                                
		
		
		
	}

}
