package pomPackageGroww;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainClass1 {

	static WebDriver driver;
	
	public static void Runner() {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://groww.in");
	}
	
	
	public static void main(String args[]) throws Exception {
		
//		MainClass1 ob = new MainClass1();	//when Runner() method is non-static, we have to access it using creating the object of the class where it belongs
//		ob.Runner();
//		TestClass.loginPage();
		
		MainClass1.Runner();			//when Runner() is static method we can access it using chaining method of class where it belongs
		TestClass.loginPage();
		System.out.println("current url 1 "+driver.getCurrentUrl());

		//changing 
//		ArrayList<String> ws = new ArrayList(driver.getWindowHandles());
		String jb = driver.getWindowHandle();
		System.out.println("getWindowHandle 1 "+jb);
		driver.switchTo().window(jb);

//		driver.switchTo().window(ws.get(1));
		System.out.println("current url 2 "+driver.getCurrentUrl());
//		System.out.println("share price of ");
		
//		TestClass.reloginPage(); 
		
		
	 
		
	}
}
