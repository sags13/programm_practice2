package testPack02;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;





public class Signup_dropDown_ss {
	
	static WebDriver driver;
	//static int i= 22;
	
//	public static void date_time ()
//	{
//		
//	
//	}
	
	
	
	
	public static void screenshot (WebDriver driver,String i ) throws IOException
	{
		
		
//		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest1 = new File("E:\\Velocity Teligram Videos\\Screenshot\\Signup\\FailedTestSignup"+i+".jpg");
//		Files.copy(source1, dest1);	
//		
		Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("E:\\Screenshot\\"+i+".jpg"));
		
		
	}

	public static void main(String args[]) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		signup.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Mahesh");
		
		WebElement lastname =driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Pawar");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("sags13p@gmail.com");
		
		WebElement email_conf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		email_conf.sendKeys("sags13p@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pwd.sendKeys("Zhakshim@13");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		s.selectByIndex(12);				//day==13
//		s.selectByValue("13");
//		s.selectByVisibleText("13");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
//		
		new Select(month).selectByIndex(1);
		
		//Select m = new Select(month);
		//m.selectByVisibleText("Mar");		
		//m.selectByIndex(2);					//indexing start at 0!
//		m.selectByValue("3");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		
		//y.selectByIndex(30);
		//y.selectByValue("1992");
		y.selectByVisibleText("1992");
		
		WebElement male_radio = driver.findElement(By.xpath("//input[@value='2']"));
		
		if (male_radio.isSelected()==false)
		{
			male_radio.click();
		}
		
		screenshot(driver, "File_name");
		
		WebElement signup_final = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup_final.click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		
//		driver. 
		
	
		
		
	}	
	
	

}
