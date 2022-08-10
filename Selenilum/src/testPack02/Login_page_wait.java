package testPack02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

public class Login_page_wait  {
	// @SuppressWarnings("deprecation")
	public static WebDriverWait wait;
	public static void main (String argd[]) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//Login_page		
		
		driver.manage().window().maximize();
//		driver.get("https://groww.in/");
		
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().
//		
//		WebElement login = driver.findElement(By.xpath("//div[@class='btn51Btn btn51RipplePrimary btn51Primary']"));
//		login.click();
//		WebElement email = driver.findElement(By.xpath("//input[@id ='login_email1']"));
//		email.sendKeys("snkg13@gmail.com");
//		WebElement continue_btn = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
//		continue_btn.click();
//		
//		Thread.sleep(3000);
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='login_password1']"));
//		pwd.sendKeys("Zhakshim@13");
//		
//		WebElement submit = driver.findElement(By.xpath("//div[contains(@class,'absolute-center btn51ParentDimension')]"));
//
//		submit.click();
////		System.out.println("  "+submit.getText());
//		
//		Thread.sleep(3000);
//		//pwd input hidden webelement, thats why thread.sleep()
//		
//		//WebElement pin = driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[1]/input"));
//		WebElement pin1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
//		//Thread.sleep(3000);
//		pin1.sendKeys("2");
//		
//		WebElement pin2 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
//		pin2.sendKeys("2");
//		
//		WebElement pin3 = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
//		pin3.sendKeys("1");
//		
//		WebElement pin4 = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
//		pin4.sendKeys("3");
//		
//		
//		                                                
//		//Home_page
//		
//		
//		System.out.println("current website link"+driver.getCurrentUrl());
//		
//		Thread.sleep(3000);
//		
//		WebElement investments = driver.findElement(By.xpath("//a[@href='/stocks/user/investments']"));
//		investments.click();
//		Thread.sleep(2000);
//	
//		WebElement explore = driver.findElement(By.xpath("//a[@href='/stocks/user/explore']"));
//		explore.click();
//		
//		WebElement search = driver.findElement(By.xpath("//input[@class='txtinput88input fs14 ']"));
//		String search_var= new String("tata motors");
//		search.sendKeys(search_var);
//		Thread.sleep(5000);

		
//		//code for finding then entering the text in search webelement and matching that content with list of availble list of string and finally clicking them. 
		
//		List <WebElement> search_list = driver.findElements(By.xpath("//div[@style='max-width: 285px; margin: 0px; font-size: 14px;']"));
//		
//		System.out.println(" hi 1st "+search_list.size());
//		
//		String actual = "";
//		
//		int j=0;
//		for (int i = 0; i < search_list.size(); i++) {
//			
//			actual = search_list.get(i).getText().toLowerCase();
//			//System.out.println("search_list = "+search_list.get(i).getText());
//			
//			if (actual.startsWith(search_var))
//			{
//				System.out.println("The value found is : " + actual);
//				j++;
//			}
//		
//		}
//		System.out.println("Final match contain are = "+j);
//		

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
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		//WebDriverWiat object is getting created, with two arragumets, 1.driver, 2.interger==durations 
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement alert_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")));
//				driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
		alert_box.click();
		
		WebElement confirm_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")));
//				driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
		confirm_box.click();
		
		WebElement prompt_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")));
//				driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
		prompt_box.click();
		
//		WebElement line_break = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='w3-btn w3-margin-bottom'])[4]")));
//		WebElement line_break = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']"));
//		line_break.click();
		
		System.out.println("Current URL of driver at browser "+driver.getCurrentUrl());
		
		//WebElement run = driver.findElement(By.xpath("//button[@id='runbtn']"));
		//run.click();
		
		//Thread.sleep(3000);
//		WebElement flight_ad = driver.findElement(By.xpath("//div[@id='a4a-K']"));
//		flight_ad.click();
//				
		ArrayList <String> all_add = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("all_add.get(0) = "+all_add.get(0)+ " == "+driver.getWindowHandle());
		
		String mainpage = driver.getWindowHandle();
		System.out.println("Actual mainpage add = "+mainpage);
		
		driver.switchTo().window(all_add.get(0));
		//Thread.sleep(1000);
		
		driver.switchTo().window(all_add.get(4));
		System.out.println("First click,alert_box "+driver.getCurrentUrl()+" == "+all_add.get(4)+" == "+driver.getWindowHandle());
		
		Thread.sleep(1000);
		driver.switchTo().window(all_add.get(3));
		System.out.println("Second click, confirm_box = "+driver.getCurrentUrl()+" == "+all_add.get(3)+" == "+driver.getWindowHandle());
		
		Thread.sleep(1000);
		driver.switchTo().window(all_add.get(2));
		System.out.println("3rd click, prompt_box == "+driver.getCurrentUrl()+" == "+all_add.get(2)+" == "+driver.getWindowHandle());
		
//		JavascriptExecutor js2 =  ((JavascriptExecutor)driver);
//		
//		js2.executeScript("arguments[0].scrollIntoView(");
//		
		//Thread.sleep(1000);
		driver.switchTo().window(all_add.get(1));
		System.out.println("4th click, line_break == "+driver.getCurrentUrl()+" == "+all_add.get(1)+" == "+driver.getWindowHandle());
		
//		//switching to Iframe and then finding the requested webelement which is inside iframe,		
		WebElement ifrm1 = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));			// finding iframe
		
		driver.switchTo().frame(ifrm1);					// switching to iframe
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/button")).click();		//finding required webelement
		
//		//Alert pop up handling, have to create obj of Alert class & then few methods of it as mention below.

//		Alert alt2 = driver.switchTo().alert();
//		alt2.accept();
//		alt2.dismiss();
//		alt2.sendKeys(mainpage);;
//		alt2.getText();
//		
		//Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		
//		//scrolling
		driver.switchTo().window(all_add.get(0));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,-3000)");
		js.executeScript("arguments[0].scrollIntoView(true);", alert_box);
		//Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		//Thread.sleep(1000);
		alert_box.click();
		
		
//		// Mouse Actions
		
//		Thread.sleep(3000);
		ArrayList<String> new2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("All current browsers-after clicking alert_box from main again = "+new2.size());
		driver.switchTo().window(new2.get(5));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		WebElement ad_img_iframe = driver.findElement(By.xpath("//iframe[@aria-label='Advertisement']"));
		
		
//		driver.switchTo().frame(ad_img_iframe);	
//		Thread.sleep(2000);
//		WebElement ad_img= driver.findElement(By.xpath("//div[@class='GoogleActiveViewInnerContainer']"));
//		ad_img.click();
		
		//practice as iframe webelement are there sometimes(eg. 4-5 times refresh)there in html but after some refresh it goes aways, becoz he(iframe) is itself was dynamic iframe webelement!
		//driver.switchTo().frame(ad_img_iframe2);
		//WebElement ad_img = driver.findElement(By.xpath("//div[@id='google-center-div']"));
		//ad_img.click();
	
//		Actions act = new Actions(driver);
//		act.moveToElement(ad_img).click().build().perform();
		
		ArrayList<String> new3 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(new3.size());
		
		driver.switchTo().window(new3.get(0));
		System.out.println(driver.getCurrentUrl());	
//		
//		JavascriptExecutor js2 =  ((JavascriptExecutor)driver);
//		
//		js2.executeScript("window.scrollBy(0,7000)");
//		
//		
		
		
	
	}

	

}
