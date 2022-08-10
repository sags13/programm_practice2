package pomPackageFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	static WebDriver driver;
	
	public static void main (String args[] ) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		TestClass.signup();
			
		
		

}
	
}
