package pomPackageGroww;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass2 {
	static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://groww.in");
		//Thread.sleep(3000);
		
		TestClass.loginPage();
		
		
		
		
		
	}

}
