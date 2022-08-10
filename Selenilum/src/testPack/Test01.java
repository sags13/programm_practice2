package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String args[])
	{
		System.setProperty( "webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.youtube.com/");
		
		WebDriver driver01 = new ChromeDriver ();
		
		driver01.get("https://www.youtube.com/");
		
		WebDriver x = new ChromeDriver();
		WebDriver y = new ChromeDriver();
		
		System.out.println(" "+x.equals(y));				//False
		System.out.println(" "+driver.equals(driver01));	//false
		
		
	}
 
}
