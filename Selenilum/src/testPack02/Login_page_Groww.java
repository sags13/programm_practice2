package testPack02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Login_page_Groww  {
	public static void main (String argd[]) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//Login_page		
		
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='btn51Btn btn51RipplePrimary btn51Primary']"));
		login.click();
		WebElement email = driver.findElement(By.xpath("//input[@id ='login_email1']"));
		email.sendKeys("snkg13@gmail.com");
		WebElement continue_btn = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
		continue_btn.click();
		
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
		
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='login_password1']"));
		pwd.sendKeys("Zhakshim@13");
		
		WebElement submit = driver.findElement(By.xpath("//div[contains(@class,'absolute-center btn51ParentDimension')]"));

		submit.click();
////	System.out.println("  "+submit.getText());
//		
		Thread.sleep(3000);
//		//pwd input hidden webelement, thats why thread.sleep()
//		
//		//WebElement pin = driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[1]/input"));
		WebElement pin1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
//		//Thread.sleep(3000);
		pin1.sendKeys("2");
		
		WebElement pin2 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		pin2.sendKeys("2");
		
		WebElement pin3 = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
		pin3.sendKeys("1");
		
		WebElement pin4 = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		pin4.sendKeys("3");
//		driver.close();
		
		
		                                                
//		//Home_page
//		
//		
		System.out.println("current website link"+driver.getCurrentUrl());
//		
		Thread.sleep(3000);
//		
		WebElement investments = driver.findElement(By.xpath("//a[@href='/stocks/user/investments']"));
		investments.click();
		Thread.sleep(2000);
	
		WebElement explore = driver.findElement(By.xpath("//a[@href='/stocks/user/explore']"));
		explore.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='txtinput88input fs14 ']"));
		String search_var= new String("tata motors");
		search.sendKeys(search_var);
		Thread.sleep(5000);

		
//		//code for finding then entering the text in search webelement and matching that content with list of availble list of string and finally clicking them. 
		
		List <WebElement> search_list = driver.findElements(By.xpath("//div[@style='max-width: 285px; margin: 0px; font-size: 14px;']"));
	
		System.out.println(" hi 1st "+search_list.size());
		
		String actual = "";
		
		int j=0;
		for (int i = 0; i < search_list.size(); i++) {
			
			actual = search_list.get(i).getText().toLowerCase();
			System.out.println("search_list = "+search_list.get(i).getText());
			
			if (actual.startsWith(search_var))
			{
				System.out.println("The value found is : " + actual);
				j++;
			}
		
		}
		System.out.println("Final match contain are = "+j);

		
//		//Sample practice for above for loop
//		 * List <String> search_content = new ArrayList<String> ();
//		 * 
//		 * for (int i=0; i<=(search_content.size()-1); i++) 
//		 * { 
//		 * 		search_content.add(i,
//		 * 		search_content.get(i));
//		 * } 
//		 * 
//		 * for (int j=0; j<=(search_list.size()-1); j++) 
//		 * {
//		 * System.out.println(" hi "+j);
//		 * }
		 
	
	
//		//To take the screenshot 
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File ("E:\\Velocity Teligram Videos\\Screenshot\\LoginPage\\FailedTestLogin.jpg");
//		Files.copy(source, dest);
//	
//		Thread.sleep(3000);
//	
//		//To scroll down the app/build//browser
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, 2500)");
		
//		//code for getting list of 6 webelements and clcking them, but not working correctly.
//		//List<WebElement>groww_fb = driver.findElements(By.xpath("//a[@class=\"col l12\"]"));
		
		//System.out.println("Total child browser are = "+groww_fb.size());

//		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		for ( j=0; j<=(groww_fb.size()-1); j++)
//		{
//			wait.until(ExpectedConditions.elementToBeClickable(groww_fb.get(j)));
//			System.out.println(""+groww_fb.get(j));
//			Thread.sleep(2000);
//			groww_fb.get(j).click();
//		}

		

//		Thread.sleep(3000);
//		//only 3 pop handled by selenium- hidden division, alert, child pop up!		
//		//ex for child browser pop up, all tabs in chrome browser, how to move from one tab/window to other,
		

	
	}

	

}
